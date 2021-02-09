package PrototypePattern;

/* 내가 이해한 내용
    객체를 새로 생성하지않고 기존에있는 객체를 불러오는 형태 (객체 생성에 들어가는 큰작업 또는 불필요한 작업을 배제)
*/

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.doLotsOfWorkWithUser();

        int userTotalNumber = user.getTotalNumber();
        System.out.println("기존유저:" + userTotalNumber);

        User newUser = (User) user.clone();
        int newTotalNumber = newUser.addNumber(20);
        System.out.println("새로운유저: " + newTotalNumber);

    }
}