module com.learning {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.learning to javafx.fxml;
    exports com.learning;
    exports com.learning.controller;
    opens com.learning.controller to javafx.fxml;
}