module com.example.monopol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.monopol to javafx.fxml;
    exports com.example.monopol;
}