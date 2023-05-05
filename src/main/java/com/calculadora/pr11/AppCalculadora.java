package com.calculadora.pr11;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AppCalculadora extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //TECLADO NUMERICO (CENTER)
        //Botones
        Button num1 = new Button("1");
        num1.setPrefHeight(50);
        num1.setPrefWidth(60);
        Button num2 = new Button("2");
        num2.setPrefHeight(50);
        num2.setPrefWidth(60);
        Button num3 = new Button("3");
        num3.setPrefHeight(50);
        num3.setPrefWidth(60);
        Button num4 = new Button("4");
        num4.setPrefHeight(50);
        num4.setPrefWidth(60);
        Button num5 = new Button("5");
        num5.setPrefHeight(50);
        num5.setPrefWidth(60);
        Button num6 = new Button("6");
        num6.setPrefHeight(50);
        num6.setPrefWidth(60);
        Button num7 = new Button("7");
        num7.setPrefHeight(50);
        num7.setPrefWidth(60);
        Button num8 = new Button("8");
        num8.setPrefHeight(50);
        num8.setPrefWidth(60);
        Button num9 = new Button("9");
        num9.setPrefHeight(50);
        num9.setPrefWidth(60);
        Button num0 = new Button("0");
        num0.setPrefHeight(50);
        num0.setPrefWidth(60);
        Button numReset = new Button("Reset");
        numReset.setPrefHeight(50);
        numReset.setPrefWidth(60);
        Label invisible = new Label();

        //Gridpane
        GridPane tecladoNum = new GridPane();
        tecladoNum.setVgap(10);
        tecladoNum.setHgap(25);
        tecladoNum.setPadding(new Insets(10));
        tecladoNum.addRow(0,num1,num2,num3);
        tecladoNum.addRow(1,num4,num5,num6);
        tecladoNum.addRow(2,num7,num8,num9);
        tecladoNum.addRow(3,num0,invisible,numReset);
        //FIN TECLADO NUMERICO (CENTER)

        //OPERADORES (LEFT)
        //RadioButtons
        RadioButton suma = new RadioButton("Suma");
        RadioButton resta = new RadioButton("Resta");
        RadioButton producto = new RadioButton("Producto");
        RadioButton division = new RadioButton("División");
        ToggleGroup ops = new ToggleGroup();
        suma.setToggleGroup(ops);
        resta.setToggleGroup(ops);
        producto.setToggleGroup(ops);
        division.setToggleGroup(ops);

        //VBox
        VBox operadores = new VBox(suma,resta,producto,division);
        operadores.setPadding(new Insets(10));
        operadores.setSpacing(25);
        //FIN OPERADORES (LEFT)

        //BOTON RESULTADO (RIGHT)
        Button resultado = new Button("Resultado");
        resultado.setPrefHeight(50);
        resultado.setPrefWidth(60);
        //FIN BOTON RESULTADO (RIGHT)

        //IMAGEN (TOP)
        Image calc = new Image("C:\\Users\\Daniel\\IdeaProjects\\Pr11\\src\\main\\java\\com\\calculadora\\pr11\\calc.jpg");
        ImageView topImagen = new ImageView(calc);
        //FIN IMAGEN (TOP)

        //VER OPERACIONES (BOTTOM)
        //Labels
        Label etiOperando1 = new Label();
        Label etiOperador = new Label();
        Label etiOperando2 = new Label();
        //HBox
        HBox cajaOperaciones = new HBox(etiOperando1,etiOperador,etiOperando2);
        cajaOperaciones.setPadding(new Insets(10));
        cajaOperaciones.setSpacing(25);
        cajaOperaciones.setAlignment(Pos.CENTER);

        //TitledPane
        TitledPane operaciones = new TitledPane("Resultado",cajaOperaciones);
        //FIN VER OPERACIONES (BOTTOM)

        //BORDERPANE ROOT
        BorderPane root = new BorderPane();
        root.setCenter(tecladoNum);
        BorderPane.setAlignment(tecladoNum,Pos.CENTER);
        root.setLeft(operadores);
        BorderPane.setAlignment(operadores,Pos.CENTER_LEFT);
        root.setRight(resultado);
        BorderPane.setAlignment(resultado, Pos.CENTER_RIGHT);
        BorderPane.setMargin(resultado,new Insets(157,90,30,0));
        root.setTop(topImagen);
        BorderPane.setAlignment(topImagen,Pos.TOP_CENTER);
        root.setBottom(operaciones);
        BorderPane.setAlignment(operaciones,Pos.BOTTOM_CENTER);
        //FIN BORDERPANE ROOT

        //EVENTOS
        //Variable para controlar el estado
        int control = 0;

        //Controlador del teclado numérico
        EventHandler<MouseEvent> handlerTecladoNum = e -> {
            Button b = (Button) e.getSource();

            if (b.getText().equals("1")){

            }
            if (b.getText().equals("2")){

            }
            if (b.getText().equals("3")){

            }
            if (b.getText().equals("4")){

            }
            if (b.getText().equals("5")){

            }
            if (b.getText().equals("6")){

            }
            if (b.getText().equals("7")){

            }
            if (b.getText().equals("8")){

            }
            if (b.getText().equals("9")){

            }
            if (b.getText().equals("0")){

            }
        };
        //FIN EVENTOS

        //ASIGNAR Y MOSTRAR STAGE
        Scene scene = new Scene(root,450,450);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Calculadora Daniel Coll");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}