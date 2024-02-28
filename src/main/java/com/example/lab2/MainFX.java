package com.example.lab2;

import com.example.lab2.controller.impl.TopicControllerImpl;
import com.example.lab2.model.Topic;
import com.example.lab2.view.impl.JavaFxView;
import com.example.lab2.view.ViewInterface;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Content controller");
        primaryStage.setScene(scene);

        VBox vBox = new VBox(10);
        TextField inputTitle = new TextField();
        TextField inputContent = new TextField();
        vBox.getChildren().addAll(inputTitle, inputContent);
        root.getChildren().add(vBox);

        ViewInterface javaFxView = new JavaFxView(vBox);
        Topic topic = new Topic("Initial Title", "Initial Content");
        TopicControllerImpl topicController = new TopicControllerImpl(topic, javaFxView);
        topicController.display();

        primaryStage.show();
        Button updateButton = new Button();
        updateButton.setText("update");
        updateButton.setOnAction(actionEvent -> {
            topicController.update(inputTitle.getText(), inputContent.getText());
            topicController.display();
        });
        vBox.getChildren().add(updateButton);
    }
}
