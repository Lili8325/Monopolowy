module com.example.monopol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.monopol to javafx.fxml;
    exports com.example.monopol;
}