package FactoryPattern;

/* 내가 이해한 내용
    같은 패턴을 가진 객체를 생성하지만 내부적인 호출 권한은 생성자에 의해 달라질수있음
*/

public class Main {
    public static void main(String[] args) {

        Company company = new UnNamedCompany();
        Worker w1 = company.hire("홍석기");
        Worker w2 = company.hire("스티브잡스");

        System.out.println("\n");

        w1.work();
        w2.rest();
    }
}