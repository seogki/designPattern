package BuilderPattern;

//오브젝트 생성시 값을 추가해서 만드는 패턴 (객체 생성을 깔끔하게 하기 위해 사용)

/* 내가 이해한 내용
객체를 생성할때 생성자 파라미터에 추가하지않고 필요한 내용만 분리해서 추가 */

public class Main {
    public static void main(String[] args) {

        Clothes mondayClothes = new Clothes.Builder("티셔츠", "청바지", "운동화").bag("에코백").hat("볼캡").build();

        Clothes saturdayClothes = new Clothes.Builder("셔츠", "슬랙스", "구두").bag("토트백").socks("검정양말").build();

        System.out.println("월요일\n" + mondayClothes.toString() + "\n");
        System.out.println("토요일\n" + saturdayClothes.toString());
    }
}