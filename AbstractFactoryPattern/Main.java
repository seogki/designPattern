package AbstractFactoryPattern;
// Abstract Factory Pattern

// 상세화된 서브 클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기위한 인터페이스

/* 내가 이해한 내용
    추상팩토리 매서드를 통해 인풋값에 동일한 패턴을 가지되
    내부적인 매서드는 해당 인풋에 맞는 아웃풋을 전달하는 과정
*/

public class Main {
    public static void main(String[] args) {
        ClothesMaterialFactory trouserFactory = new TrouserFactory();
        trouserFactory.createCotton();
        trouserFactory.createPolyester();
        System.out.println("\n");
        ClothesMaterialFactory shirtFactory = new ShirtFactory();
        shirtFactory.createCotton();
        shirtFactory.createPolyester();
    }
}