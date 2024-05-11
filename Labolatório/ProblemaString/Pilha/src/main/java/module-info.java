module com.example.pilha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pilha to javafx.fxml;
    exports com.example.pilha;
}