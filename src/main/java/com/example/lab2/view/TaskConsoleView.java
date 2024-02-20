package com.example.lab2.view;

import java.util.Scanner;

public class TaskConsoleView {
    private Scanner scanner;

    public TaskConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public int printMenuAndGetOption() {
        System.out.println("\nTask Manager");
        System.out.println("1. Create Task");
        System.out.println("2. Update Task");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");

        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public String getTaskTitleFromUser() {
        System.out.print("Enter task title: ");
        return scanner.nextLine();
    }

    public boolean getTaskCompletionStatusFromUser() {
        System.out.print("Is the task completed? (yes/no): ");
        String input = scanner.nextLine();
        return "yes".equalsIgnoreCase(input);
    }

    public void printTaskDetails(String taskTitle, boolean isCompleted) {
        System.out.println("\nTask Details");
        System.out.println("Title: " + taskTitle);
        System.out.println("Completed: " + (isCompleted ? "Yes" : "No"));
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
