package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class UnNamedCompany extends Company {
    private List<String> workers = new ArrayList<>();

    @Override
    protected Worker hireWorker(String worker) {
        // TODO Auto-generated method stub
        return new Team(worker);
    }

    @Override
    protected void registerWorker(Worker w) {
        // TODO Auto-generated method stub
        workers.add(((Team) w).getWorker());

    }

    public List<String> getWorkers() {
        return workers;
    }
}