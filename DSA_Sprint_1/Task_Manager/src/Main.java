public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];

        users[0] = new User("Daniel");
        users[1] = new User("Kennedy");
        users[2] = new User("John");

        users[0].taskList.addTask("Complete Sprint");
        users[0].taskList.viewTasks();
        users[0].taskList.taskComplete("Complete Sprint");
        users[0].taskList.viewTasks();

    }
}
