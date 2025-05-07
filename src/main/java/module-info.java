module org.example.rplbo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.rplbo to javafx.fxml;
    exports org.example.rplbo;
}