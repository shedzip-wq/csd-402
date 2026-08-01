/*
	* Author: Sheridan Dela Cruz
	* Date: July 31, 2026
	* Module 11.2
	* Desciption: Desciption: This program demonstrates the use of both GridPane and BorderPane,
    * the BorderPane serves as the main layout structure, and the GridPane
    * is placed in the center region to show how detailed, cell-based layouts work.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        // -----------------------------
        // BorderPane (Main Layout)
        // -----------------------------
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));

        // Top region: simple title bar
        Label title = new Label("JavaFX Layout Demo");
        HBox topBar = new HBox(title);
        topBar.setPadding(new Insets(10));
        root.setTop(topBar);

        // -----------------------------
        // GridPane (Center Layout)
        // -----------------------------
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // Example form fields inside the GridPane
        Label userLabel = new Label("Username:");
        TextField userField = new TextField();

        Label passLabel = new Label("Password:");
        TextField passField = new TextField();

        Button loginButton = new Button("Login");

        // Add items to specific row/column positions
        grid.add(userLabel, 0, 0);
        grid.add(userField, 1, 0);

        grid.add(passLabel, 0, 1);
        grid.add(passField, 1, 1);

        grid.add(loginButton, 1, 2);

        // Place the GridPane in the center of the BorderPane
        root.setCenter(grid);

        // -----------------------------
        // Bottom region (optional)
        // -----------------------------
        Label footer = new Label("BorderPane bottom region");
        HBox bottomBar = new HBox(footer);
        bottomBar.setPadding(new Insets(10));
        root.setBottom(bottomBar);

        // -----------------------------
        // Scene and Stage Setup
        // -----------------------------
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("GridPane + BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}