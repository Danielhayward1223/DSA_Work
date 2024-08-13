package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.peek();

        // I had to remove some println statements in StackArrays and LinkedStack so that the console wouldn't be flooded with text.
        // :)

        // Palidrome testing
        stackArrays.palindromeCheck("racecar");
        stackArrays.palindromeCheck("hello");

        // Linked list stack testing
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.isEmpty();
        linkedStack.peek();
        linkedStack.pop();
        linkedStack.peek();


    }
}
