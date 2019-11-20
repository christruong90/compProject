package com.example.compproject;

import java.text.DateFormat;
import java.util.Date;

public class TaskObject {
    String taskId;
    String task;
    String taskDate;

    public TaskObject() {}

    public TaskObject(String taskId, String task) {
        this.task = taskId;
        this.task = task;
        this.taskDate = DateFormat.getDateTimeInstance().format(new Date());
    }

    public void setTaskId( String taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate() {
        this.taskDate = DateFormat.getDateTimeInstance().format(new Date());
    }

}
