package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    TextField textField1;

    @Override
    public void start(Stage primaryStage) throws Exception{

        StringBuilder stringBuilder = new StringBuilder();
        textField1 = new TextField();
        textField1.setPromptText("Write exp");
        textField1.setFocusTraversable(false);
        textField1.setPrefHeight(50);

        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btn0 = new Button("0");





        Button plus = new Button("+");
        plus.setOnAction(event -> {
            setSign(plus);
        });
        Button minus = new Button("-");
        minus.setOnAction(event -> {
            setSign(minus);
        });
        Button multiply = new Button("*");
        multiply.setOnAction(event -> {
            setSign(multiply);
        });
        Button division = new Button("/");
        division.setOnAction(event -> {
            setSign(division);
        });

        Button btnDot = new Button(".");
        Button btnEqual = new Button("=");

        GridPane root = new GridPane();
//add Textfield to pane
        root.add(textField1, 0, 0, 4, 1);
        Button[] arrayButton = {
                btn1, btn2, btn3, plus,
                btn4, btn5, btn6, minus,
                btn7, btn8, btn9, multiply,
                btnDot, btn0, btnEqual, division
        };

        for(int i = 0, column = 0, row = 1; i<arrayButton.length; i++){
            if(i%4==0){
                column = 0;
                row++;
            }

            arrayButton[i].setPrefSize(50,50);
            arrayButton[i].setStyle("-fx-background-color: #f7f7f7");
            arrayButton[i].setDisable(false);
            root.add(arrayButton[i], column, row);
            column++;

        }
        btn0.setOnMouseDragged(event -> {
            style(btn0);
        });
        btn0.setOnAction(event -> {
            setSign(btn0);
        });

        btn1.setOnAction(event -> {
            setSign(btn1);
        });

        btn2.setOnAction(event -> {
            setSign(btn2);
        });

        btn3.setOnAction(event -> {
            setSign(btn3);
        });

        btn4.setOnAction(event -> {
            setSign(btn4);
        });

        btn5.setOnAction(event -> {
            setSign(btn5);
        });


        btn6.setOnAction(event -> {
            setSign(btn6);

        });

        btn7.setOnAction(event -> {
            setSign(btn7);
        });

        btn8.setOnAction(event -> {
            setSign(btn8);
        });

        btn9.setOnAction(event -> {
            setSign(btn9);
        });

        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root);
        scene.getStylesheets().add((getClass().getResource("/css/styles.css")).toExternalForm());
        btn0.setId("button");


        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void setSign(Button btn){
        textField1.setText(textField1.getText() + btn.getText());
    }

    private void style(Button btn){
        btn.setPrefSize(60, 60);
        btn.setStyle("-fx-background-color: white");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
