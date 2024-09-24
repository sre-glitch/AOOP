package seven;

import java.util.Arrays;

public class ArrayStack<T> implements GenericStack<T> {
    private Object[] stack;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayStack() {
        stack = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Null elements are not allowed in the stack.");
        }
        if (size == stack.length) {
            stack = Arrays.copyOf(stack, stack.length * 2); 
        }
        stack[size++] = element;
        System.out.println("Added: " + element);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        T element = (T) stack[--size];
        stack[size] = null;

        // Optional: Shrink if size is 1/4th of array length
        if (size > 0 && size == stack.length / 4) {
            stack = Arrays.copyOf(stack, stack.length / 2);
        }

        System.out.println("Removed: " + element);
        return element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        T element = (T) stack[size - 1];
        System.out.println("Current top: " + element);
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
