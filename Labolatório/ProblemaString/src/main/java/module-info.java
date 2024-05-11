module com.example.problemastring {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.problemastring to javafx.fxml;
    exports com.example.problemastring;
}