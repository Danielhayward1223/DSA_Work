package Queues;

public class Main {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        Shelter shelter = new Shelter(5);

        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.peek();
        
        shelter.enQueue(new Dog(1));
        shelter.enQueue(new Cat(2));
        shelter.enQueue(new Dog(3));
        shelter.enQueue(new Cat(4));
        shelter.viewAllAnimals();
        System.out.println("----------------------");
        shelter.deQueueAny();
        shelter.viewAllAnimals();
        System.out.println("----------------------");
        shelter.deQueueDog();
        shelter.viewAllAnimals();
        System.out.println("----------------------");
        shelter.deQueueCat();
        shelter.viewAllAnimals();
    }


    // An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
}