package sixb;

import java.util.Iterator;

public class WorkerIterator implements Iterator<Worker> {
    private Worker worker;

    public WorkerIterator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public boolean hasNext() {
        return worker != null;
    }
    @Override
    public Worker next() {
        Worker current = worker;
        worker = null;
        return current;
    }
}