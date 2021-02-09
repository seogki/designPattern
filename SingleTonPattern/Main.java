package SingleTonPattern;

/* 내가 이해한 내용
    초기 구동시 객체 생성을 진행하고 필요할때마다 해당 객체를 리턴 (오류로 인해 문제가 생기는 경우 새로운 객체를 생성하고 저장)
*/

public class Main {

    public static void main(String[] args) {

        Store store = Store.getStore();
        System.out.println("싱글톤 객체로 전달받은 데이터: " + store.getStoreInfo());
    }
}