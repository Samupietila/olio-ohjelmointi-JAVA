package controller;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import model.Notebook;
import view.NotebookView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class NotebookController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private Button addButton;

    @FXML
    private VBox notebookList;

    private Map<String, String> notebookContents = new HashMap<>();

    @FXML
    private void updateNotebookList() {
        System.out.println("Updating notebook list");
        String title = titleField.getText();
        String content = contentArea.getText();
        if (title != null && !title.isEmpty()) {
            Label label = new Label(title);
            label.setOnMouseClicked(event -> displayContent(title));
            notebookList.getChildren().add(label);
            notebookContents.put(title, content);
        }
        titleField.clear();
        contentArea.clear();
    }

    private void displayContent(String title) {
        String content = notebookContents.get(title);
        contentArea.setText(content);
    }

    public static void main(String[] args) {
        NotebookView.launch(NotebookView.class);
    }
}