package seven;

import java.util.LinkedList;

public class LinkedListStack<T> implements GenericStack<T> {
    private LinkedList<T> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        stack.addFirst(element);
        System.out.println("Pushed: " + element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        T element = stack.removeFirst();
        System.out.println("Popped: " + element);
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        T element = stack.getFirst();
        System.out.println("Top element: " + element);
        return element;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
