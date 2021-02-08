package FactoryPattern;

public class Team extends Worker {

    private String worker;

    public Team(String worker) {
        this.worker = worker;
        System.out.println(worker + "를 고용합니다");
    }

    @Override
    public void work() {
        System.out.println(worker + "는(은) 일을 합니다");
        // TODO Auto-generated method stub

    }

    @Override
    public void rest() {
        System.out.println(worker + "는(은) 쉽니다");
        // TODO Auto-generated method stub

    }

    public String getWorker() {
        return worker;
    }
}
