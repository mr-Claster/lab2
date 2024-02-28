package com.example.lab2;

import com.example.lab2.controller.impl.TopicControllerImpl;
import com.example.lab2.model.Topic;
import com.example.lab2.view.impl.CLIView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic("Initial Title", "Initial Content");
        CLIView cliView = new CLIView();
        TopicControllerImpl controller = new TopicControllerImpl(topic, cliView);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nUpdate Title\n"
                    + "       Content");
            String newTitle = scanner.nextLine();
            String newContent = scanner.nextLine();
            controller.update(newTitle, newContent);
        }
    }
}
