module com.example.problemaspilha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.problemaspilha to javafx.fxml;
    exports com.example.problemaspilha;
}