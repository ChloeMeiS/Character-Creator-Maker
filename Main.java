package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane root;
    private World world;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();
        setupMenus(primaryStage);

        primaryStage.setTitle("World Builder");
        primaryStage.setScene(new Scene(root, 1000, 750));
        primaryStage.show();
    }

    private void setupMenus(Stage primaryStage) {
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
        exitMenu.setOnAction(actionEvent -> primaryStage.close());

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

        TextField locationName = new TextField();
        TextField capitalName = new TextField();
        TextField population = new TextField();
        TextField size = new TextField();
        TextField language = new TextField();

        capitalName.setDisable(true);
        population.setDisable(true);
        size.setDisable(true);
        language.setDisable(true);

        ChoiceBox<String> measurementType = new ChoiceBox<>();
        measurementType.getItems().addAll("Metric", "Imperial");

        CheckBox isCountryCheck = new CheckBox("Is this location a Country/City?");

        Button locationSubmit = new Button("Add New Location");
        locationSubmit.setDisable(true);

        GridPane gridPane = new GridPane();
        gridPane.addColumn(0, new Label("Name: "), new Label(""), new Label("Capital: "), new Label("Population: "),
                new Label(
                        "Size: "), new Label("Language"));
        gridPane.addColumn(1, locationName, isCountryCheck, capitalName, population, size, language);

        locationName.textProperty().addListener((s, n, o) -> {
            if (locationName.getText().isEmpty() || locationName.getText().isBlank()) {
                locationSubmit.setDisable(true);
            } else {
                locationSubmit.setDisable(false);
            }
        });

        isCountryCheck.selectedProperty().addListener((s, o, n) -> {
            capitalName.setDisable(!n);
            population.setDisable(!n);
            size.setDisable(!n);
            language.setDisable(!n);
        });

        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        Label locationTitle = new Label("Add a New Location");
        locationTitle.setStyle("-fx-font-size: 20px;-fx-font-weight:bold");
        VBox locationRoot = new VBox(10, locationTitle, gridPane, locationSubmit);

        locationRoot.setAlignment(Pos.CENTER);
        locationRoot.setPadding(new Insets(20));

        Scene locationScene = new Scene(locationRoot, 500, 500);
        Stage newStage = new Stage();
        newStage.setScene(locationScene);

        newStage.show();

        locationSubmit.setOnAction(actionEvent -> newStage.close());
    }

    private void createNewSpecies() {
        System.out.println("Main.createNewSpecies");
    }

    private void createNewCharacter() {
        System.out.println("Main.createNewCharacter");

        TextField fName = new TextField();
        TextField lName = new TextField();
        TextField mName = new TextField();

        TextField age = new TextField();
        age.setStyle("-fx-pref-width: 50px");

        TextField birthdayDay = new TextField();

        ChoiceBox<String> birthdayMonth = new ChoiceBox<>();
        birthdayMonth.getItems().addAll("1 - Jan",
                "2 - FEB",
                "3 - MAR",
                "4 - APR",
                "5 - MAY",
                "6 - JUN",
                "7 - JUL",
                "8 - AUG",
                "9 - SEP",
                "10 - OCT",
                "11 - NOV",
                "12 - DEC");

        ChoiceBox<String> gender = new ChoiceBox<>();
        gender.getItems().addAll("Male", "Female", "Other");

        Button characterSubmit = new Button("Add New Character");
        characterSubmit.setDisable(true);

        VBox characterBody = new VBox(10);
        HBox nameBox = new HBox(10, new VBox(new Label("First Name"), fName), new VBox(new Label("Middle Name"),
                mName), new VBox(new Label("Last Name"), lName));

        HBox birthdayBox = new HBox(10, new VBox(new Label("Month"), birthdayMonth), new VBox(new Label("Day"),
                birthdayDay),new VBox(new Label("Age"), age));

        characterBody.getChildren().addAll(nameBox, new Label("Birthday"), birthdayBox);

        Label characterTitle = new Label("Add a New Character");
        characterTitle.setStyle("-fx-font-size: 20px;-fx-font-weight:bold");
        VBox locationRoot = new VBox(10, characterTitle, characterBody, characterSubmit);

        locationRoot.setAlignment(Pos.CENTER);
        locationRoot.setPadding(new Insets(20));

        Scene locationScene = new Scene(locationRoot, 500, 500);
        Stage newStage = new Stage();
        newStage.setScene(locationScene);

        newStage.show();

        characterSubmit.setOnAction(actionEvent -> newStage.close());
    }

    private void createNewWorld() {
        System.out.println("Main.createNewWorld");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
