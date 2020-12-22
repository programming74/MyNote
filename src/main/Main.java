package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static final FXMLLoader run = new FXMLLoader(Main.class.getResource("Home.fxml"));

    public static void main(String[] args) {
        launch(args);
        System.out.close();
    }

    public static Object getLoader() {
        return run.getController();
    }

    @Override
    public void start(Stage frame) throws IOException {
        Parent parent = run.load();
        Scene scene = new Scene(parent);
        frame.setScene(scene);
        //frame.setResizable(false);
        frame.setMaximized(true);
        frame.setTitle("My Note");
        frame.show();
    }
}
