module com.example.webbrowserproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.webbrowserproject to javafx.fxml;
    exports com.example.webbrowserproject;
}