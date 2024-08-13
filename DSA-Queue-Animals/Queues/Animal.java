package Queues;

public class Animal {
    private String type;
    private int time;

    public Animal(String type, int time) {
        this.type = type;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public int getTime() {
        return time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Animal info: type = " + type + ", time = " + time;     
    }
}