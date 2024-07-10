package org.example.testcreatingjar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.example.testcreatingjar.kotlin.Testkotlin;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane content = new Pane();
        Button btn = new Button("Check OS");
        btn.setLayoutX(80);
        btn.setLayoutY(100);
        btn.setPrefSize(100,40);

        int x = new Testkotlin().hello();


        Text text = new Text();
        text.setLayoutY(200);
        text.setLayoutX(80);
        text.setFont(new Font(16));
        btn.setOnAction(actionEvent -> {
            text.setText("Вы используете: " + System.getProperty("os.name") +  "  "+ x);
        });

        content.getChildren().add(btn);
        content.getChildren().add(text);
        content.setLayoutY(200);
        content.setLayoutX(50);
        content.setPrefSize(500,400);
        content.setStyle("-fx-border-color: rgba(169, 169, 169, 0.2);" +
                "-fx-border-width: 1px;" +
                "-fx-border-radius: 6;");


        Pane mainPane = new Pane(content);
        Scene scene = new Scene(mainPane, 800,800);
        stage.setScene(scene);
        stage.setTitle("Testing creation jar");

        stage.show();
    }

    public static void main(String[] args) {
       launch();
    }
}