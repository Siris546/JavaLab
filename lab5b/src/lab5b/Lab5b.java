package lab5b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class Lab5b extends Application {

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("JavaFX UI Controls Example");

        // Label
        Label label = new Label("Enter your name:");

        // TextField
        final TextField textField = new TextField();

        // Button
        Button button = new Button("Submit");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String enteredText = textField.getText();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Hello, " + enteredText + "!");
                alert.showAndWait();
            }
        });

        // RadioButton
        RadioButton radioButton = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        // CheckBox
        CheckBox checkBox = new CheckBox("Agree to terms");

        // Hyperlink
        Hyperlink hyperlink = new Hyperlink("Visit our website");
        hyperlink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getHostServices().showDocument("https://facebook.com");
            }
        });

        // Menu
        Menu menu = new Menu("File");
        MenuItem openMenuItem = new MenuItem("Open");
//        openMenuItem.setOnAction(e - > openFile(primaryStage));
        openMenuItem.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                openFile(primaryStage);
            }
        });
        MenuItem exitMenuItem = new MenuItem("Exit");
//        exitMenuItem.setOnAction(e - > System.exit(0));
        exitMenuItem.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.exit(0);
            }
        });
        menu.getItems().addAll(openMenuItem, exitMenuItem);

        // MenuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        // Tooltip
        Tooltip tooltip = new Tooltip("Click to submit");

        // Layout
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(label, textField, button, radioButton, radioButton2, checkBox, hyperlink);
        hbox.setSpacing(10);

        // Scene
        Scene scene = new Scene(new HBox(10, label, textField, button, radioButton, radioButton2, checkBox, hyperlink), 1100, 200);

        // Adding the MenuBar to the scene
        ((HBox) scene.getRoot()).getChildren().addAll(menuBar);

        // Setting the stage scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openFile(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Selected file: " + file.getAbsolutePath());
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}