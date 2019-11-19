import java.text.DateFormat;
import java.util.Date;

public class Task {
    String task;
    String taskDate;

    public Task() {}

    public Task(String task, String taskDate) {
        this.task = task;
        this.taskDate = taskDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String Task) {
        this.task = Task;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date currentDate) {
        this.taskDate = DateFormat.getDateTimeInstance().format(currentDate);
    }

}
