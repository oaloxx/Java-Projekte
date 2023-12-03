package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    public HelloApplication() {
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Button Example");

        // Create a button

        TextField textField = new TextField();
        textField.setMaxWidth(405);
        textField.setMaxHeight(130);
        textField.setFont(Font.font(50));
        textField.setTranslateY(-230);


        Button button1 = new Button("%");
        button1.setMaxWidth(100);
        button1.setMaxHeight(90);
        button1.setFont(Font.font(40));
        button1.setTranslateX(-153);
        button1.setTranslateY(250);

        Button button2 = new Button("0");
        button2.setMaxWidth(100);
        button2.setMaxHeight(90);
        button2.setFont(Font.font(40));
        button2.setTranslateX(-51);
        button2.setTranslateY(250);

        button2.setOnAction(e ->{

            String get0 = textField.getText();

            textField.setText(get0+"0");
        });

        Button button3 = new Button(",");
        button3.setMaxWidth(100);
        button3.setMaxHeight(90);
        button3.setFont(Font.font(40));
        button3.setTranslateX(51);
        button3.setTranslateY(250);

        button3.setOnAction(e -> {

            String getComma = textField.getText();

            textField.setText(getComma+".");
        });


        Button button4 = new Button("=");
        button4.setMaxWidth(100);
        button4.setMaxHeight(182);
        button4.setFont(Font.font(40));
        button4.setTranslateX(153);
        button4.setTranslateY(204);
        button4.setStyle("-fx-background-color: #00B2FF;");
        button4.setTextFill(Color.WHEAT);
        button4.setOnAction(e -> {
            String inputvalue = textField.getText();

            // Extrahiere den Wert vor dem letzten Operator
            String[] operators = {"\\+", "-", "\\*", "/"};
            String[] values = null;

            for (String operator : operators) {
                values = inputvalue.split(operator);
                if (values.length > 1) {
                    break;
                }
            }

            String result = values[values.length - 2];

            String inputvalue1 = textField.getText();

            // Extrahiere den Wert nach dem letzten Operator
            String[] operators1 = {"\\+", "-", "\\*", "/"};
            String[] values1 = null;

            for (String operator : operators1) {
                values1 = inputvalue1.split(operator);
                if (values1.length > 1) {
                    break;
                }
            }

            String result1 = values1[values1.length - 1];

            String inputvalue2 = textField.getText();

            // Überprüfe, welcher Operator im Text vorhanden ist
            String operator2 = null;
            if (inputvalue2.contains("+")) {
                operator2 = "+";
            } else if (inputvalue2.contains("-")) {
                operator2 = "-";
            } else if (inputvalue2.contains("*")) {
                operator2 = "*";
            } else if (inputvalue2.contains("/")) {
                operator2 = "/";
            }

            double operand1 = Double.parseDouble(result);
            double operand2 = Double.parseDouble(result1);
            double ergebnis = 0;

            switch (operator2) {
                case "+":
                    ergebnis = operand1 + operand2;
                    break;
                case "-":
                    ergebnis = operand1 - operand2;
                    break;
                case "*":
                    ergebnis = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 != 0) {
                        ergebnis = operand1 / operand2;
                    } else {
                        // Hier kannst du eine Fehlermeldung für die Division durch Null behandeln
                        System.out.println("Fehler: Division durch Null");
                    }
                    break;
            }

            // Das Ergebnis im Textfeld anzeigen
            textField.setText(String.valueOf(ergebnis));
        });





        Button button5 = new Button("3");
        button5.setMaxWidth(100);
        button5.setMaxHeight(90);
        button5.setFont(Font.font(40));
        button5.setTranslateX(51);
        button5.setTranslateY(158);

        button5.setOnAction(e ->{

            String get3 = textField.getText();

            textField.setText(get3+"3");
        });

        Button button6 = new Button("2");
        button6.setMaxWidth(100);
        button6.setMaxHeight(90);
        button6.setFont(Font.font(40));
        button6.setTranslateX(-51);
        button6.setTranslateY(158);

        button6.setOnAction(e -> {

            String get2 = textField.getText();

            textField.setText(get2+"2");
        });

        Button button7 = new Button("1");
        button7.setMaxWidth(100);
        button7.setMaxHeight(90);
        button7.setFont(Font.font(40));
        button7.setTranslateX(-153);
        button7.setTranslateY(158);

        button7.setOnAction(e -> {

            String get1 = textField.getText();

            textField.setText(get1+"1");

        });





        Button button8 = new Button("+");
        button8.setMaxWidth(100);
        button8.setMaxHeight(90);
        button8.setFont(Font.font(40));
        button8.setTranslateX(153);
        button8.setTranslateY(66);
        button8.setTextFill(Color.web("#00B2FF"));
        button8.setStyle("-fx-background-color: #2A2522;");
        button8.setOnAction(e ->{

            String getblus = textField.getText();

            textField.setText(getblus+"+");
        });


        Button button9 = new Button("6");
        button9.setMaxWidth(100);
        button9.setMaxHeight(90);
        button9.setFont(Font.font(40));
        button9.setTranslateX(51);
        button9.setTranslateY(66);

        button9.setOnAction(e ->{

            String get6 = textField.getText();

            textField.setText(get6+"6");
        });

        Button button10 = new Button("5");
        button10.setMaxWidth(100);
        button10.setMaxHeight(90);
        button10.setFont(Font.font(40));
        button10.setTranslateX(-51);
        button10.setTranslateY(66);

        button10.setOnAction(e ->{

            String get5 = textField.getText();

            textField.setText(get5+"5");
        });

        Button button11 = new Button("4");
        button11.setMaxWidth(100);
        button11.setMaxHeight(90);
        button11.setFont(Font.font(40));
        button11.setTranslateX(-153);
        button11.setTranslateY(66);

        button11.setOnAction(e ->{

            String get4 = textField.getText();

            textField.setText(get4+"4");
        });

        Button button12 = new Button("-");
        button12.setMaxWidth(100);
        button12.setMaxHeight(90);
        button12.setFont(Font.font(40));
        button12.setTranslateX(153);
        button12.setTranslateY(-26);
        button12.setTextFill(Color.web("#00B2FF"));
        button12.setStyle("-fx-background-color: #2A2522;");
        button12.setOnAction(e -> {

            String getminus = textField.getText();

            textField.setText(getminus+"-");
        });

        Button button13 = new Button("9");
        button13.setMaxWidth(100);
        button13.setMaxHeight(90);
        button13.setFont(Font.font(40));
        button13.setTranslateX(51);
        button13.setTranslateY(-26);

        button13.setOnAction(e ->{

            String get9 = textField.getText();

            textField.setText(get9+"9");
        });

        Button button14 = new Button("8");
        button14.setMaxWidth(100);
        button14.setMaxHeight(90);
        button14.setFont(Font.font(40));
        button14.setTranslateX(-51);
        button14.setTranslateY(-26);

        button14.setOnAction(e ->{

            String get8 = textField.getText();

            textField.setText(get8+"8");
        });

        Button button15 = new Button("7");
        button15.setMaxWidth(100);
        button15.setMaxHeight(90);
        button15.setFont(Font.font(40));
        button15.setTranslateX(-153);
        button15.setTranslateY(-26);

        button15.setOnAction(e ->{

            String get7 = textField.getText();

            textField.setText(get7+"7");
        });

        Button button16 = new Button("Clear");
        button16.setMaxWidth(100);
        button16.setMaxHeight(90);
        button16.setFont(Font.font(20));
        button16.setTranslateX(153);
        button16.setTranslateY(-118);
        button16.setTextFill(Color.web("#00B2FF"));
        button16.setStyle("-fx-background-color: #2A2522;");
        button16.setOnAction(e -> {

            String getClear = textField.getText();

            String result = getClear.substring(0, getClear.length() - 1);

            textField.setText(result);


        });

        Button button17 = new Button("*");
        button17.setMaxWidth(100);
        button17.setMaxHeight(90);
        button17.setFont(Font.font(20));
        button17.setTranslateX(51);
        button17.setTranslateY(-118);
        button17.setTextFill(Color.web("#00B2FF"));
        button17.setStyle("-fx-background-color: #2A2522;");
        button17.setOnAction(e -> {

            String getMal = textField.getText();

            textField.setText(getMal+"*");
        });

        Button button18 = new Button("/");
        button18.setMaxWidth(100);
        button18.setMaxHeight(90);
        button18.setFont(Font.font(20));
        button18.setTranslateX(-51);
        button18.setTranslateY(-118);
        button18.setTextFill(Color.web("#00B2FF"));
        button18.setStyle("-fx-background-color: #2A2522;");
        button18.setOnAction(e ->{

            String getgeteilt = textField.getText();

            textField.setText(getgeteilt+"/");
        });

        Button button19 = new Button("C");
        button19.setMaxWidth(100);
        button19.setMaxHeight(90);
        button19.setFont(Font.font(20));
        button19.setTranslateX(-153);
        button19.setTranslateY(-118);
        button19.setTextFill(Color.web("#00B2FF"));
        button19.setStyle("-fx-background-color: #2A2522;");

        button19.setOnAction(e -> {
            textField.setText("");
        });


        // Create a layout and add the button to it
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,
                button17,button18,button19,textField);

        // Create a scene and set it on the stage
        Scene scene = new Scene(layout, 420, 600);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
