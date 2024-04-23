package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Dictionary;

public class DictionaryView extends Application {
    private  TextField wordField;
    private TextField meaningField;
    private Label wordLabel;
    private Label meaningLabel;

    private Button addWordButton;
    private Button getMeaningButton;

    private DictionaryController controller;

    public void init() {
        controller = new DictionaryController(this);
    }

    public void start(Stage window) {
        init();
        wordField = new TextField("Giver a word");
        wordField.setPrefWidth(150);
        meaningField = new TextField("Give a meaning");
        meaningField.setPrefWidth(190);

        wordLabel = new Label("Word: ");
        meaningLabel = new Label("Meaning: ");

        addWordButton = new Button("Add word");
        addWordButton.setOnAction((event) -> {
            controller.addWord(wordField.getText(), meaningField.getText());
        });

        getMeaningButton = new Button("Get meaning");
        getMeaningButton.setOnAction((event) -> {
            controller.getMeaning(wordField.getText());
        });

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setSpacing(10);
        vbox.getChildren().addAll(wordField, meaningField, wordLabel, meaningLabel, addWordButton, getMeaningButton);

        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.show();

    }

    public void addWord(String word, String meaning) {

    }

    public void setMeaning(String meaning) {
        this.wordLabel.setText("Word: "+ wordField.getText());
        this.meaningLabel.setText("Meaning: "+meaning);
    }

}
