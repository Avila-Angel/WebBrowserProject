package com.example.webbrowserproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WebBrowserScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome to Angel's Web Browser!");
        stage.setScene(scene);

        stage.setResizable(false); // locks screen size

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}