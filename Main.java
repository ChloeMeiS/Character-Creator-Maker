package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane root;
    private World world;

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

        //File Menu
        Menu fileMenu = new Menu("File");
        Menu newObject = new Menu("New");
        MenuItem openObject = new MenuItem("Open");
        MenuItem exitMenu = new MenuItem("_Exit");

        MenuItem newWorldItem = new MenuItem("World");
        MenuItem newCharacterItem = new MenuItem("Character");
        MenuItem newSpeciesItem = new MenuItem("Species");
        MenuItem newLocItem = new MenuItem("Location");

        setupFileMenuItems(newWorldItem, newCharacterItem, newSpeciesItem, newLocItem);

        newObject.getItems().addAll(newWorldItem, newCharacterItem, newSpeciesItem, newLocItem);

        fileMenu.getItems().addAll(newObject, openObject, new SeparatorMenuItem(), exitMenu);

        //Edit Menu
        Menu editMenu = new Menu("Edit");
        MenuItem editCharacterItem = new MenuItem("Character");
        MenuItem editWorldItem = new MenuItem("World");
        MenuItem editSpeciesItem = new MenuItem("Species");
        MenuItem editLocItem = new MenuItem("Location");

        editMenu.getItems().addAll(editCharacterItem, editWorldItem, editSpeciesItem, editLocItem);

        Menu viewMenu = new Menu("View");
        Menu creditsMenu = new Menu("Credits");

        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu, creditsMenu);

        root.setTop(menuBar);
    }

    private void setupFileMenuItems(MenuItem newWorldItem, MenuItem newCharacterItem, MenuItem newSpeciesItem, MenuItem newLocItem) {
        newWorldItem.setOnAction(actionEvent -> createNewWorld());
        newCharacterItem.setOnAction(actionEvent -> createNewCharacter());
        newSpeciesItem.setOnAction(actionEvent -> createNewSpecies());
        newLocItem.setOnAction(actionEvent -> createNewLocation());
    }

    private void createNewLocation() {
        System.out.println("Main.createNewLocation");
    }

    private void createNewSpecies() {
        System.out.println("Main.createNewSpecies");
    }

    private void createNewCharacter() {
        System.out.println("Main.createNewCharacter");
    }

    private void createNewWorld() {
        System.out.println("Main.createNewWorld");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
