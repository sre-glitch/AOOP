package seven2;

import java.util.PriorityQueue;

public class GenericPriorityQueueFloat<T extends Comparable<T>> {
    private PriorityQueue<T> queue;

    // Constructor
    public GenericPriorityQueueFloat() {
        queue = new PriorityQueue<>();
    }

    public void enqueue(T element) {
        queue.offer(element);
        System.out.println("Enqueued: " + element);
    }

    public T dequeue() {
        T element = queue.poll();
        if (element != null) {
            System.out.println("Dequeued: " + element);
        } else {
            System.out.println("Queue is empty!");
        }
        return element;
    }

    public void displayQueue() {
        System.out.println("Current queue: " + queue);
    }
}