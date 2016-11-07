package pl.nombritech;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application
{
    public void start(Stage primaryStage)
    {
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CharMan");

        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
