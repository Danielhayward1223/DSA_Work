public class Task {
    public String taskName;
    public boolean status;
    public Task next;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = false;
        this.next = null;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean getStatus() {
        return status;
    }

    public void setDescription(String taskName) {
        this.taskName = taskName;
    }

    public void setComplete(boolean status) {
        this.status = true;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Task Name: " + taskName + "\nStatus: " + status;
    }
}
