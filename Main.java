package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane root;


    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();
        setupMenus();

        primaryStage.setTitle("World Builder");
        primaryStage.setScene(new Scene(root, 1000, 750));
        primaryStage.show();
    }

    private void setupMenus() {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");
        Menu creditsMenu = new Menu("Credits");

        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu, creditsMenu);

        root.setTop(menuBar);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
