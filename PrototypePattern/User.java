package PrototypePattern;

public class User implements Cloneable {

    private int totalNum;

    public User() {
        this.totalNum = 0;
    }

    public User(int totalNum) {
        this.totalNum = totalNum;
    }

    public void doLotsOfWorkWithUser() {
        int i = 0;
        int result = 0;
        while (i < 10000) {
            i++;
            result += i;
        }
        this.totalNum = result;
    }

    public int getTotalNumber() {
        return this.totalNum;
    }

    public int addNumber(int num) {
        this.totalNum = this.totalNum + num;
        return this.totalNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int tmpTotalNumber = this.totalNum;

        return new User(tmpTotalNumber);
    }
}