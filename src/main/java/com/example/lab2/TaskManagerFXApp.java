package com.example.lab2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TaskManagerFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Task Manager");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label taskLabel = new Label("Task Title:");
        grid.add(taskLabel, 0, 1);

        TextField taskTextField = new TextField();
        grid.add(taskTextField, 1, 1);

        Label statusLabel = new Label("Completed:");
        grid.add(statusLabel, 0, 2);

        CheckBox taskCompletedCheckbox = new CheckBox();
        grid.add(taskCompletedCheckbox, 1, 2);

        Button btnCreate = new Button("Create Task");
        HBox hbBtnCreate = new HBox(10);
        hbBtnCreate.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnCreate.getChildren().add(btnCreate);
        grid.add(hbBtnCreate, 1, 3);

        Button btnUpdate = new Button("Update Task");
        HBox hbBtnUpdate = new HBox(10);
        hbBtnUpdate.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnUpdate.getChildren().add(btnUpdate);
        grid.add(hbBtnUpdate, 0, 3);

        Button btnExit = new Button("Exit");
        HBox hbBtnExit = new HBox(10);
        hbBtnExit.setAlignment(Pos.BOTTOM_CENTER);
        hbBtnExit.getChildren().add(btnExit);
        grid.add(hbBtnExit, 1, 4);

        Label taskInfoLabel = new Label("Task information will be shown here.");
        grid.add(taskInfoLabel, 0, 5, 2, 1);

        btnCreate.setOnAction(e -> {
            String taskInfo = "Created Task: " + taskTextField.getText() + ", Completed: " + (taskCompletedCheckbox.isSelected() ? "Yes" : "No");
            taskInfoLabel.setText(taskInfo);
        });

        btnUpdate.setOnAction(e -> {
            String taskInfo = "Updated Task: " + taskTextField.getText() + ", Completed: " + (taskCompletedCheckbox.isSelected() ? "Yes" : "No");
            taskInfoLabel.setText(taskInfo);
        });

        btnExit.setOnAction(e -> primaryStage.close());

        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
