package Stacks;

public class LinkedStack {
    private Node top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (top == null){
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        Node stackNode = new Node();
        stackNode.value = value;
        stackNode.next = top;
        top = stackNode;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The value was successtully removed from the stack");
            top = top.next;
            size--;
        }        
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The value at the top of the stack is: " + top.value);
        }
    }

    public void deleteStack() {
        top = null;
        size = 0;
    }
}