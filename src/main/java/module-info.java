module com.example.lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.lab2 to javafx.fxml;
    exports com.example.lab2;
    exports com.example.lab2.view;
    opens com.example.lab2.view to javafx.fxml;
    exports com.example.lab2.view.impl;
    opens com.example.lab2.view.impl to javafx.fxml;
}
