public class TaskList {
    public Task head;
    public Task tail;
    public int size;

    public TaskList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void viewTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public Task addTask(String taskname) {
        Task createdTask = new Task(taskname);
        if (head == null) {
            head = createdTask;
            tail = createdTask;
        } else {
            tail.setNext(createdTask);
            tail = createdTask;
        }
        size++;
        return createdTask;
    }

    public boolean taskComplete(String taskName) {
        Task current = head;
        while (current != null) {
            if (current.getTaskName().equals(taskName)) {
                current.setComplete(true);
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
