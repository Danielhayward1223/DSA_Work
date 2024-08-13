public class User {
    public String userName;
    public TaskList taskList;

    public User(String username) {
        this.userName = username;
        this.taskList = new TaskList();
    }

    public String getUserName() {
        return userName;
    }

    public void getTasks() {
        taskList.viewTasks();
    }
}