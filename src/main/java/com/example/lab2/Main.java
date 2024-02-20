package com.example.lab2;

import com.example.lab2.controller.TaskController;
import com.example.lab2.model.Task;
import com.example.lab2.view.TaskConsoleView;

public class Main {
    public static void main(String[] args) {
        Task model = new Task("");
        TaskConsoleView view = new TaskConsoleView();
        TaskController controller = new TaskController(model, view);

        boolean exit = false;
        while (!exit) {
            int option = view.printMenuAndGetOption();
            switch (option) {
                case 1:
                    String title = view.getTaskTitleFromUser();
                    controller.setTaskTitle(title);
                    controller.updateView();
                    break;
                case 2:
                    boolean isCompleted = view.getTaskCompletionStatusFromUser();
                    controller.setTaskCompleted(isCompleted);
                    controller.updateView();
                    break;
                case 3:
                    exit = true;
                    view.showMessage("Exiting Task Manager...");
                    break;
                default:
                    view.showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
