module org.example.tablero_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.tablero_java to javafx.fxml;
    exports org.example.tablero_java;
}