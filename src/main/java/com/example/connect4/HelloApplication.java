package com.example.connect4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.IOException;

import static java.util.logging.Logger.global;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group groupcol = new Group();
        Group groupcgame = new Group();
        Scene scenecol = new Scene(groupcol, 700, 500);
        Scene scenegame = new Scene(groupcgame, 800, 600);
        scenegame.setFill(Color.LIGHTCYAN);

        final double[] bc = new double[2];


        int[][] matr = new int[6][7];
        for (int i=0; i < 6; i++){
            for (int j=0;j<7; j++){
                matr[i][j] = 0;
            }
        }
//        for (int i=0; i < 6; i++){
//            for (int j=0;j<7; j++){
//                System.out.println("matr [" + i+ " " + j + "] " + matr[i][j]);
//            }
//        }

        Button roundB = new Button();
        Button roundR = new Button();
        roundB.setLayoutX(20);
        roundB.setLayoutY(20);
        roundB.setStyle(
                "-fx-background-radius: 250em; " +
                        "-fx-min-width: 250px; " +
                        "-fx-min-height: 250px; " +
                        "-fx-max-width: 250px; " +
                        "-fx-max-height: 250px;" +
                        "-fx-background-color: orange"
        );
        roundR.setLayoutX(430);
        roundR.setLayoutY(20);
        roundR.setStyle(
                "-fx-background-radius: 250em; " +
                        "-fx-min-width: 250px; " +
                        "-fx-min-height: 250px; " +
                        "-fx-max-width: 250px; " +
                        "-fx-max-height: 250px;" +
                        "-fx-background-color: blue"
        );

//       roundB.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                System.out.println(mouseEvent.getX());
//                System.out.println(mouseEvent.getY());
//                bc[0] = mouseEvent.getX();
//                bc[1] = mouseEvent.getY();
//            }
//        });
//
//        roundB.setOnMouseDragged(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                roundB.setLayoutX(mouseEvent.getSceneX() - bc[0]);
//                roundB.setLayoutY(mouseEvent.getSceneY() - bc[1]);
//            }
//        });


//        Label pl1 = new Label("Р вЂ™Р Р†Р ВµР Т‘Р С‘ Р С‘Р СРЎРЏ РЎС“РЎР‚Р С•Р Т‘Р С‘Р Р…Р В° 0_0");
//        Label pl2 = new Label("Р В РЎвЂљРЎвЂ№ РЎвЂљР С•Р В¶Р Вµ Р В»РЎвЂ№РЎРѓР В°РЎРЏ Р С–Р Р…Р С‘Р Т‘Р В° D:");
//        pl1.setLayoutX(20);
//        pl1.setLayoutY(290);
//        pl2.setLayoutX(430);
//        pl2.setLayoutY(290);
//        pl1.setMinSize(250, 50);
//        pl1.setMaxSize(250, 50);
//        pl2.setMinSize(250, 50);
//        pl2.setMaxSize(250, 50);
//        pl1.setAlignment(Pos.CENTER);
//        pl1.setStyle("-fx-border-color: black;" + "-fx-font-size: 20");
//        pl2.setAlignment(Pos.CENTER);
//        pl2.setStyle("-fx-border-color: black;" + "-fx-font-size: 20");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t1.setPromptText("Введите имя первого игрока");
        t2.setPromptText("Введите имя второго игрока");
        t1.setLayoutX(20);
        t1.setLayoutY(290);
        t2.setLayoutX(430);
        t2.setLayoutY(290);
        t1.setPrefSize(250, 50);
        t2.setPrefSize(250, 50);
        t1.setAlignment(Pos.CENTER);
        t1.setStyle("-fx-font-size: 16");
        t2.setAlignment(Pos.CENTER);
        t2.setStyle("-fx-font-size: 16");

        Label pl1 = new Label();
        Label pl2 = new Label();
        pl1.setLayoutX(560);
        pl1.setLayoutY(0);
        pl1.setPrefSize(180, 50);
        pl2.setPrefSize(180, 50);
        pl2.setLayoutX(560);
        pl2.setLayoutY(70);
        pl1.setAlignment(Pos.CENTER_LEFT);
        pl1.setStyle("-fx-border-color: black;" + "-fx-font-size: 16");
        pl2.setAlignment(Pos.CENTER_LEFT);
        pl2.setStyle("-fx-border-color: black;" + "-fx-font-size: 16");

        t1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String ppl1 = t1.getText();
                //System.out.println(t1.getText());
                pl1.setText(ppl1);
            }
        });
        t2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String ppl2 = t2.getText();
                //System.out.println(ppl2);
                pl2.setText(ppl2);
            }
        });

//        t1.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                t1.clear();
//            }
//        });
//        t2.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                t2.clear();
//            }
//        });

        Button stb = new Button("Начать игру");
        stb.setLayoutX(300);
        stb.setLayoutY(400);
        stb.setPrefSize(100, 50);

        stb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(scenegame);
            }
        });

        int coordx = 40;
        int coordy = 160;
        Circle c00 = new Circle(40);
        c00.setCenterX(coordx);
        c00.setCenterY(coordy);
        c00.setStyle("-fx-fill: white");
        c00.setStroke(Color.BLACK);
        coordx += 80;
        Circle c01 = new Circle(40);
        c01.setCenterX(coordx);
        c01.setCenterY(coordy);
        c01.setStyle("-fx-fill: white");
        c01.setStroke(Color.BLACK);
        coordx += 80;
        Circle c02 = new Circle(40);
        c02.setCenterX(coordx);
        c02.setCenterY(coordy);
        c02.setStyle("-fx-fill: white");
        c02.setStroke(Color.BLACK);
        coordx += 80;
        Circle c03= new Circle(40);
        c03.setCenterX(coordx);
        c03.setCenterY(coordy);
        c03.setStyle("-fx-fill: white");
        c03.setStroke(Color.BLACK);
        coordx += 80;
        Circle c04 = new Circle(40);
        c04.setCenterX(coordx);
        c04.setCenterY(coordy);
        c04.setStyle("-fx-fill: white");
        c04.setStroke(Color.BLACK);
        coordx += 80;
        Circle c05 = new Circle(40);
        c05.setCenterX(coordx);
        c05.setCenterY(coordy);
        c05.setStyle("-fx-fill: white");
        c05.setStroke(Color.BLACK);
        coordx += 80;
        Circle c06 = new Circle(40);
        c06.setCenterX(coordx);
        c06.setCenterY(coordy);
        c06.setStyle("-fx-fill: white");
        c06.setStroke(Color.BLACK);
        coordx += 80;

        coordx = 40;
        coordy = 240;
        Circle c10 = new Circle(40);
        c10.setCenterX(coordx);
        c10.setCenterY(coordy);
        c10.setStyle("-fx-fill: white");
        c10.setStroke(Color.BLACK);
        coordx += 80;
        Circle c11 = new Circle(40);
        c11.setCenterX(coordx);
        c11.setCenterY(coordy);
        c11.setStyle("-fx-fill: white");
        c11.setStroke(Color.BLACK);
        coordx += 80;
        Circle c12 = new Circle(40);
        c12.setCenterX(coordx);
        c12.setCenterY(coordy);
        c12.setStyle("-fx-fill: white");
        c12.setStroke(Color.BLACK);
        coordx += 80;
        Circle c13= new Circle(40);
        c13.setCenterX(coordx);
        c13.setCenterY(coordy);
        c13.setStyle("-fx-fill: white");
        c13.setStroke(Color.BLACK);
        coordx += 80;
        Circle c14 = new Circle(40);
        c14.setCenterX(coordx);
        c14.setCenterY(coordy);
        c14.setStyle("-fx-fill: white");
        c14.setStroke(Color.BLACK);
        coordx += 80;
        Circle c15 = new Circle(40);
        c15.setCenterX(coordx);
        c15.setCenterY(coordy);
        c15.setStyle("-fx-fill: white");
        c15.setStroke(Color.BLACK);
        coordx += 80;
        Circle c16 = new Circle(40);
        c16.setCenterX(coordx);
        c16.setCenterY(coordy);
        c16.setStyle("-fx-fill: white");
        c16.setStroke(Color.BLACK);
        coordx += 80;

        coordx = 40;
        coordy = 320;
        Circle c20 = new Circle(40);
        c20.setCenterX(coordx);
        c20.setCenterY(coordy);
        c20.setStyle("-fx-fill: white");
        c20.setStroke(Color.BLACK);
        coordx += 80;
        Circle c21 = new Circle(40);
        c21.setCenterX(coordx);
        c21.setCenterY(coordy);
        c21.setStyle("-fx-fill: white");
        c21.setStroke(Color.BLACK);
        coordx += 80;
        Circle c22 = new Circle(40);
        c22.setCenterX(coordx);
        c22.setCenterY(coordy);
        c22.setStyle("-fx-fill: white");
        c22.setStroke(Color.BLACK);
        coordx += 80;
        Circle c23= new Circle(40);
        c23.setCenterX(coordx);
        c23.setCenterY(coordy);
        c23.setStyle("-fx-fill: white");
        c23.setStroke(Color.BLACK);
        coordx += 80;
        Circle c24 = new Circle(40);
        c24.setCenterX(coordx);
        c24.setCenterY(coordy);
        c24.setStyle("-fx-fill: white");
        c24.setStroke(Color.BLACK);
        coordx += 80;
        Circle c25 = new Circle(40);
        c25.setCenterX(coordx);
        c25.setCenterY(coordy);
        c25.setStyle("-fx-fill: white");
        c25.setStroke(Color.BLACK);
        coordx += 80;
        Circle c26 = new Circle(40);
        c26.setCenterX(coordx);
        c26.setCenterY(coordy);
        c26.setStyle("-fx-fill: white");
        c26.setStroke(Color.BLACK);
        coordx += 80;

        coordx = 40;
        coordy = 400;
        Circle c30 = new Circle(40);
        c30.setCenterX(coordx);
        c30.setCenterY(coordy);
        c30.setStyle("-fx-fill: white");
        c30.setStroke(Color.BLACK);
        coordx += 80;
        Circle c31 = new Circle(40);
        c31.setCenterX(coordx);
        c31.setCenterY(coordy);
        c31.setStyle("-fx-fill: white");
        c31.setStroke(Color.BLACK);
        coordx += 80;
        Circle c32 = new Circle(40);
        c32.setCenterX(coordx);
        c32.setCenterY(coordy);
        c32.setStyle("-fx-fill: white");
        c32.setStroke(Color.BLACK);
        coordx += 80;
        Circle c33= new Circle(40);
        c33.setCenterX(coordx);
        c33.setCenterY(coordy);
        c33.setStyle("-fx-fill: white");
        c33.setStroke(Color.BLACK);
        coordx += 80;
        Circle c34 = new Circle(40);
        c34.setCenterX(coordx);
        c34.setCenterY(coordy);
        c34.setStyle("-fx-fill: white");
        c34.setStroke(Color.BLACK);
        coordx += 80;
        Circle c35 = new Circle(40);
        c35.setCenterX(coordx);
        c35.setCenterY(coordy);
        c35.setStyle("-fx-fill: white");
        c35.setStroke(Color.BLACK);
        coordx += 80;
        Circle c36 = new Circle(40);
        c36.setCenterX(coordx);
        c36.setCenterY(coordy);
        c36.setStyle("-fx-fill: white");
        c36.setStroke(Color.BLACK);
        coordx += 80;

        coordx = 40;
        coordy = 480;
        Circle c40 = new Circle(40);
        c40.setCenterX(coordx);
        c40.setCenterY(coordy);
        c40.setStyle("-fx-fill: white");
        c40.setStroke(Color.BLACK);
        coordx += 80;
        Circle c41 = new Circle(40);
        c41.setCenterX(coordx);
        c41.setCenterY(coordy);
        c41.setStyle("-fx-fill: white");
        c41.setStroke(Color.BLACK);
        coordx += 80;
        Circle c42 = new Circle(40);
        c42.setCenterX(coordx);
        c42.setCenterY(coordy);
        c42.setStyle("-fx-fill: white");
        c42.setStroke(Color.BLACK);
        coordx += 80;
        Circle c43= new Circle(40);
        c43.setCenterX(coordx);
        c43.setCenterY(coordy);
        c43.setStyle("-fx-fill: white");
        c43.setStroke(Color.BLACK);
        coordx += 80;
        Circle c44 = new Circle(40);
        c44.setCenterX(coordx);
        c44.setCenterY(coordy);
        c44.setStyle("-fx-fill: white");
        c44.setStroke(Color.BLACK);
        coordx += 80;
        Circle c45 = new Circle(40);
        c45.setCenterX(coordx);
        c45.setCenterY(coordy);
        c45.setStyle("-fx-fill: white");
        c45.setStroke(Color.BLACK);
        coordx += 80;
        Circle c46 = new Circle(40);
        c46.setCenterX(coordx);
        c46.setCenterY(coordy);
        c46.setStyle("-fx-fill: white");
        c46.setStroke(Color.BLACK);
        coordx += 80;

        coordx = 40;
        coordy = 560;
        Circle c50 = new Circle(40);
        c50.setCenterX(coordx);
        c50.setCenterY(coordy);
        c50.setStyle("-fx-fill: white");
        c50.setStroke(Color.BLACK);
        coordx += 80;
        Circle c51 = new Circle(40);
        c51.setCenterX(coordx);
        c51.setCenterY(coordy);
        c51.setStyle("-fx-fill: white");
        c51.setStroke(Color.BLACK);
        coordx += 80;
        Circle c52 = new Circle(40);
        c52.setCenterX(coordx);
        c52.setCenterY(coordy);
        c52.setStyle("-fx-fill: white");
        c52.setStroke(Color.BLACK);
        coordx += 80;
        Circle c53= new Circle(40);
        c53.setCenterX(coordx);
        c53.setCenterY(coordy);
        c53.setStyle("-fx-fill: white");
        c53.setStroke(Color.BLACK);
        coordx += 80;
        Circle c54 = new Circle(40);
        c54.setCenterX(coordx);
        c54.setCenterY(coordy);
        c54.setStyle("-fx-fill: white");
        c54.setStroke(Color.BLACK);
        coordx += 80;
        Circle c55 = new Circle(40);
        c55.setCenterX(coordx);
        c55.setCenterY(coordy);
        c55.setStyle("-fx-fill: white");
        c55.setStroke(Color.BLACK);
        coordx += 80;
        Circle c56 = new Circle(40);
        c56.setCenterX(coordx);
        c56.setCenterY(coordy);
        c56.setStyle("-fx-fill: white");
        c56.setStroke(Color.BLACK);
        coordx += 80;

        Circle fallen = new Circle(40);
        fallen.setLayoutX(40);
        fallen.setLayoutY(80);
        fallen.setStyle("-fx-fill: orange");
        fallen.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                bc[0] = mouseEvent.getX();
                bc[1] = mouseEvent.getY();
            }
        });



        fallen.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getSceneX() - bc[0] <= 520 && mouseEvent.getSceneX() - bc[0] >=40) {
                    if (mouseEvent.getSceneX()<=80 && mouseEvent.getSceneX()>0) {
                        fallen.setLayoutX(40);
                    }
                    if (mouseEvent.getSceneX()<=160 && mouseEvent.getSceneX()>80){
                        fallen.setLayoutX(120);
                    }
                    if (mouseEvent.getSceneX()<=240 && mouseEvent.getSceneX()>160){
                        fallen.setLayoutX(200);
                    }
                    if (mouseEvent.getSceneX()<=320 && mouseEvent.getSceneX()>240){
                        fallen.setLayoutX(280);
                    }
                    if (mouseEvent.getSceneX()<=400 && mouseEvent.getSceneX()>320){
                        fallen.setLayoutX(360);
                    }
                    if (mouseEvent.getSceneX()<=480 && mouseEvent.getSceneX()>400){
                        fallen.setLayoutX(440);
                    }
                    if (mouseEvent.getSceneX()<=560 && mouseEvent.getSceneX()>480){
                        fallen.setLayoutX(520);
                    }
                }
            }
        });






        groupcgame.getChildren().add(pl1);
        groupcgame.getChildren().add(pl2);
        groupcgame.getChildren().add(c00);
        groupcgame.getChildren().add(c01);
        groupcgame.getChildren().add(c02);
        groupcgame.getChildren().add(c03);
        groupcgame.getChildren().add(c04);
        groupcgame.getChildren().add(c05);
        groupcgame.getChildren().add(c06);
        groupcgame.getChildren().add(c10);
        groupcgame.getChildren().add(c11);
        groupcgame.getChildren().add(c12);
        groupcgame.getChildren().add(c13);
        groupcgame.getChildren().add(c14);
        groupcgame.getChildren().add(c15);
        groupcgame.getChildren().add(c16);
        groupcgame.getChildren().add(c20);
        groupcgame.getChildren().add(c21);
        groupcgame.getChildren().add(c22);
        groupcgame.getChildren().add(c23);
        groupcgame.getChildren().add(c24);
        groupcgame.getChildren().add(c25);
        groupcgame.getChildren().add(c26);
        groupcgame.getChildren().add(c30);
        groupcgame.getChildren().add(c31);
        groupcgame.getChildren().add(c32);
        groupcgame.getChildren().add(c33);
        groupcgame.getChildren().add(c34);
        groupcgame.getChildren().add(c35);
        groupcgame.getChildren().add(c36);
        groupcgame.getChildren().add(c40);
        groupcgame.getChildren().add(c41);
        groupcgame.getChildren().add(c42);
        groupcgame.getChildren().add(c43);
        groupcgame.getChildren().add(c44);
        groupcgame.getChildren().add(c45);
        groupcgame.getChildren().add(c46);
        groupcgame.getChildren().add(c50);
        groupcgame.getChildren().add(c51);
        groupcgame.getChildren().add(c52);
        groupcgame.getChildren().add(c53);
        groupcgame.getChildren().add(c54);
        groupcgame.getChildren().add(c55);
        groupcgame.getChildren().add(c56);
        groupcgame.getChildren().add(fallen);
        groupcol.getChildren().add(stb);
        groupcol.getChildren().add(t1);
        groupcol.getChildren().add(t2);
        groupcol.getChildren().add(roundB);
        groupcol.getChildren().add(roundR);
        stage.setTitle("GAME");
        stage.setScene(scenecol);
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//    public void start(Stage stage) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("Colour.fxml"));
//        Scene colour = new Scene(root);
//        stage.setTitle("Game");
//        stage.setScene(colour);
//        stage.show();
//        stage.setResizable(false);