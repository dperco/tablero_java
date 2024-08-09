package org.example.tablero_java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessBoard extends Application {

    public static final int TILE_SIZE = 10;
    public static final int BOARD_SIZE = 10;

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        for (int y = 0; y < BOARD_SIZE; y++) {
            for (int x = 0; x < BOARD_SIZE; x++) {
                Color color;
                if (y % 2 == 0) {
                    color = x % 2 == 0 ? Color.RED : Color.BLUE;
                } else {
                    color = x % 2 == 0 ? Color.BLUE : Color.RED;
                }
                Rectangle rectangle = new Rectangle(TILE_SIZE, TILE_SIZE, color);
                gridPane.add(rectangle, x, y);
            }
        }

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}