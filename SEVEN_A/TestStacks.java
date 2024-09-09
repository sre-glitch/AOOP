package seven;

public class TestStacks {
    public static void main(String[] args) {
        GenericStack<Integer> linkedListStack = new LinkedListStack<>();
        GenericStack<String> arrayStack = new ArrayStack<>();

        System.out.println("Testing LinkedListStack:");
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.peek();
        linkedListStack.pop();
        linkedListStack.peek();
        linkedListStack.pop();

        System.out.println("\nTesting ArrayStack:");
        arrayStack.push("Hello");
        arrayStack.push("World");
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();}}