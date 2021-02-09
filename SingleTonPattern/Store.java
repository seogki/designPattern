package SingleTonPattern;

public class Store {

    private static Store store = null;

    private Store() {

    }

    public static Store getStore() {
        return store != null ? store : createStore();
    }

    private static Store createStore() {
        store = new Store();
        return store;
    }

    public String getStoreInfo() {
        return "스토어";
    }
}