package FactoryPattern;

abstract class Company {
    public final Worker hire(String worker) {
        Worker w = hireWorker(worker);
        registerWorker(w);
        return w;
    }

    protected abstract Worker hireWorker(String worker);

    protected abstract void registerWorker(Worker w);
}