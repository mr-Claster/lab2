package com.example.lab2.controller;

import com.example.lab2.model.Task;
import com.example.lab2.view.TaskConsoleView;

public class TaskController {
    private Task model;
    private TaskConsoleView view;

    public TaskController(Task model, TaskConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void setTaskTitle(String title) {
        model.setTitle(title);
    }

    public void setTaskCompleted(boolean completed) {
        model.setCompleted(completed);
    }

    public void updateView() {
        view.printTaskDetails(model.getTitle(), model.isCompleted());
    }
}
