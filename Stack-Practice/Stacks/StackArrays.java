package Stacks;


public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }
    //Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            return true;
        } else {
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
        }
    }

    //implement pop method
    public void pop(){
        if (isEmpty()){
            System.out.println("The stafk is empty.");
        } else {
            topOfStack--;
        }
    }
    //implement peek
    public void peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        } else {
            System.out.println(arr[topOfStack] + " is at the top of the stack");
        }
    }
    //implement delete a stack
    public void deleteStack(){
        arr = null;
        System.out.println("The stack was successfully deleted.");
    }
    // use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar
    public void palindromeCheck(String word){
        StackArrays wordStack = new StackArrays(word.length());
        for (int i=0; i<word.length(); i++){
            wordStack.push(word.charAt(i));
        }
        String reverseWord = "";
        for (int i=0; i<word.length(); i++){
            reverseWord += (char) wordStack.arr[wordStack.topOfStack];
            wordStack.pop();
        }
        if (word.equals(reverseWord)){
            System.out.println(word + " is a palindroeme");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
    //Implement a stack datastructure using LinkedList instead of Arrays
    // This part of the practice is in the LinkedStack.java file
}
