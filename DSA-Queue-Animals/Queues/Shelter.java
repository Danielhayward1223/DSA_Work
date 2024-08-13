package Queues;

public class Shelter {
    private Animal [] arr;
    private int backOfQueue;
    private int nItems;
    private int beginningOfQueue;

    public Shelter(int size) {
        this.arr = new Animal[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("The Queue is successfully created wih size of: " + size);
    }

    public boolean isFull(){
        if(backOfQueue == arr.length-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public void enQueue (Animal value){
        if (isFull()){
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }

    }

    public Animal deQueueAny (){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return null;
        } else {
            Animal result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > backOfQueue){
                beginningOfQueue = backOfQueue = -1;
            }
            return result;
        }
    }

    public Animal deQueueDog (){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return null;
        } else {
            for (int i = beginningOfQueue; i <= backOfQueue; i++){
                if (arr[i].getType().equals("Dog")){
                    Animal result = arr[i];
                    for (int j = i; j < backOfQueue; j++){
                        arr[j] = arr[j+1];
                    }
                    backOfQueue--;
                    nItems--;
                    return result;
                }
            }
            return null;
        }
    }

    public Animal deQueueCat (){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return null;
        } else {
            for (int i = beginningOfQueue; i <= backOfQueue; i++){
                if (arr[i].getType().equals("Cat")){
                    Animal result = arr[i];
                    for (int j = i; j < backOfQueue; j++){
                        arr[j] = arr[j+1];
                    }
                    backOfQueue--;
                    nItems--;
                    return result;
                }
            }
            return null;
        }
    }

    public void viewAllAnimals(){
        if (isEmpty()){
            System.out.println("The queue is empty");
        } else {
            for (int i = beginningOfQueue; i <= backOfQueue; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public void deleteQueue(){
        arr = null;
    }
}