package com.example.lab2.view.impl;

import com.example.lab2.controller.TopicController;
import com.example.lab2.model.Topic;
import com.example.lab2.view.ViewInterface;
import java.util.Scanner;
import javafx.stage.Stage;

public class CLIView implements ViewInterface {
    private final TopicController controller;

    public CLIView(TopicController topicController) {
        this.controller = topicController;
    }

    private void displayTopic(Topic topic) {
        System.out.println("Title: " + topic.getTitle());
        System.out.println("Content: " + topic.getContent());
    }

    @Override
    public void processing() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nUpdate Title\n"
                    + "       Content");
            String newTitle = scanner.nextLine();
            String newContent = scanner.nextLine();
            controller.update(newTitle, newContent);
            displayTopic(controller.get());
        }
    }

    @Override
    public void processing(Stage stage) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nUpdate Title\n"
                    + "       Content");
            String newTitle = scanner.nextLine();
            String newContent = scanner.nextLine();
            controller.update(newTitle, newContent);
            displayTopic(controller.get());
        }
    }
}
