package com.example.compproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

import androidx.annotation.NonNull;

public class TaskListAdapter extends ArrayAdapter<TaskObject> {
    private Activity context;
    private List<TaskObject> taskList;

    public TaskListAdapter(Activity context, List<TaskObject> taskList) {
        super(context, R.layout.list_layout, taskList);
        this.context = context;
        this.taskList = taskList;
    }

    public TaskListAdapter(Context context, int resource, List<TaskObject> objects, Activity context1, List<TaskObject> taskList) {
        super(context, resource, objects);
        this.context = context1;
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView taskName = listViewItem.findViewById(R.id.textViewTask);
        TextView taskTime = listViewItem.findViewById(R.id.textViewTime);

        TaskObject taskObject = taskList.get(position);
        taskName.setText(taskObject.getTask());
//                + " " + student.getStudentLastName());
        taskTime.setText(taskObject.getTaskDate());

        return listViewItem;
    }

}
