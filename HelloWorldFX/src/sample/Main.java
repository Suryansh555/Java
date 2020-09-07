package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        GridPane nt = new GridPane();
//        nt.setAlignment(Pos.CENTER);
//        nt.setVgap(10);
//        nt.setHgap(10);

//        Label hello = new Label("Welcome to JavaFx");
//        hello.setTextFill(Color.GREEN);
//        hello.setFont(Font.font("Times New Roman" , FontWeight.BOLD , 70));
//        nt.getChildren().add(hello);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
