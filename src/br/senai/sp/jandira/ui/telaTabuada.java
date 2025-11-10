package br.senai.sp.jandira.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class telaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        //Definir o tamanho da tela
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");


        //Criar o root - componente de layour principal
        VBox root = new VBox();
        root.setStyle("-fx-background-color: #ccd5ae");


        //Criamos a cena e colocamos o root nela
        Scene scene = new Scene(root);

        //Criar o header na tela
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: #d4a373");

        //Colocar o conteúdo do header
        Label labelTitulo = new Label("Tabuada");
        labelTitulo.setStyle("-fx-text-fill: white;-fx-font-size: 20;");
        labelTitulo.setStyle("-fx-font-size: 20px;");
        Label labelSubtitulo = new Label("Crie a tabuada que a sua imaginação mandar. ");


        //Colocar os labels dentro do header
        header.getChildren().addAll(labelTitulo, labelSubtitulo);

        //Criar o Grid de formulário
        GridPane gridFormulario = new  GridPane();
        gridFormulario.setPrefHeight(100);
        gridFormulario.setStyle("-fx-background-color: #e9edc9");

        //Criar o conteúdo do GridFormulario
        Label labelMultiplicando = new Label("Multiplicando: ");
        TextField textFieldMultiplicando = new TextField();

        Label labelMenorMultiplicador = new Label("Menor multiplicador: ");
        TextField textFieldMenorMultiplicador = new TextField();

        Label labelMaiorMultiplicador = new Label("Maior multiplicador: ");
        TextField textFieldMaiorMultiplicador = new TextField();

        //Colocar os componentes no grid
        gridFormulario.add(labelMultiplicando, 0, 0);
        gridFormulario.add(textFieldMultiplicando, 1, 0);

        gridFormulario.add(labelMenorMultiplicador, 0, 1);
        gridFormulario.add(textFieldMenorMultiplicador, 1, 1);

        gridFormulario.add(labelMaiorMultiplicador, 0, 2);
        gridFormulario.add(textFieldMaiorMultiplicador, 1, 2);

        //Criar a caixa dos botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: #faedcd");

        //Criar os botões
        Button buttonCalcular = new Button("Calcular");
        Button buttonLimpar = new Button("Limpar");
        Button buttonSair = new Button("Sair");

        //Colocar botoes no boxBotoes
        boxBotoes.getChildren().addAll(buttonCalcular, buttonLimpar, buttonSair);

        //Criar a caixa de resultado

        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: #588157");

        //Criar componentes da boxResultados
        Label labelResultados = new Label("Resultados: ");
        ListView listaTabuada = new ListView();

        //Colocar componentes na boxResultados
        boxResultados.getChildren().addAll(labelResultados,listaTabuada);



        //Adicionar componentes ao root
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultados);


        //Colocamos a cena no palco
        stage.setScene(scene);

        stage.show();

    }
}
