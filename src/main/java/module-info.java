module com.example.exercises {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercises to javafx.fxml;
    exports com.example.exercises;
}