package com.example.lab2.view.impl;

import com.example.lab2.model.Topic;
import com.example.lab2.view.ViewInterface;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class JavaFxView implements ViewInterface {
    private final Label titleLabel;
    private final Label contentLabel;

    public JavaFxView(VBox vBox) {
        this.titleLabel = new Label();
        this.contentLabel = new Label();
        vBox.getChildren().addAll(titleLabel, contentLabel);
    }

    @Override
    public void displayTopic(Topic topic) {
        titleLabel.setText("Title: " + topic.getTitle());
        contentLabel.setText("Content: " + topic.getContent());
    }
}
