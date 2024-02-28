package com.example.lab2.view.impl;

import com.example.lab2.controller.TopicController;
import com.example.lab2.model.Topic;
import com.example.lab2.view.ViewInterface;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxView implements ViewInterface {
    private TopicController topicController;

    public JavaFxView(TopicController topicController) {
        this.topicController = topicController;
    }

    @Override
    public void processing() {

    }

    @Override
    public void processing(Stage stage) {
        Label titleLabel = new Label();
        Label contentLabel = new Label();
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(titleLabel, contentLabel);

        TextField inputTitle = new TextField();
        TextField inputContent = new TextField();
        Button updateButton = new Button("Update");

        vBox.getChildren().addAll(inputTitle, inputContent, updateButton);

        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        Scene scene = new Scene(root, 300, 250);

        updateButton.setOnAction(actionEvent -> {
            topicController.update(inputTitle.getText(), inputContent.getText());
            Topic topic = topicController.get();
            titleLabel.setText("Title: " + topic.getTitle());
            contentLabel.setText("Content: " + topic.getContent());
        });

        stage.setTitle("Content Controller");
        stage.setScene(scene);
        stage.show();
    }
}
