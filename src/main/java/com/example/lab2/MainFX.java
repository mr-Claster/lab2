package com.example.lab2;

import com.example.lab2.controller.TopicController;
import com.example.lab2.controller.impl.TopicControllerImpl;
import com.example.lab2.model.Topic;
import com.example.lab2.view.ViewInterface;
import com.example.lab2.view.impl.JavaFxView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Topic topic = new Topic("Initial Title", "Initial Content");
        TopicController controller = new TopicControllerImpl(topic);
        ViewInterface cliView = new JavaFxView(controller);
        cliView.processing(primaryStage);
    }
}
