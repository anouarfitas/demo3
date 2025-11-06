package org.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox root = new HBox();
        Scene scene = new Scene(root, 320, 240);
        Canvas canvas = new Canvas(320,240);
        canvas.setOnMouseClicked((MouseEvent e) ->{
            Text titre = new Text("weeeeeee la zone");

        });
        root.getChildren().add(canvas);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
