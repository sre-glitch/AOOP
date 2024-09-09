package seven2;

public class QueueMain {
    public static void main(String[] args) {
        // Test with Floats
        System.out.println("\nTesting with Float data type:");
        GenericPriorityQueueFloat<Float> floatQueue = new GenericPriorityQueueFloat<>();
        floatQueue.enqueue(2.5f);
        floatQueue.enqueue(1.1f);
        floatQueue.enqueue(3.3f);
        floatQueue.displayQueue();
        floatQueue.dequeue();
        floatQueue.displayQueue();
    }
}
