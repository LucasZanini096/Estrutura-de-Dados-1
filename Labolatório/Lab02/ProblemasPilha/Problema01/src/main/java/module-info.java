module com.example.problema01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.problema01 to javafx.fxml;
    exports com.example.problema01;
}