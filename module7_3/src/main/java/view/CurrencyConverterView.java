package view;
import controller.CurrencyConverterController;
import entity.CurrencyConverter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;


public class CurrencyConverterView extends Application {
    private ComboBox convertFromField;
    private Label convertFromLabel;
    private TextField convertFromTextField;
    private Label convertFromAmountLabel;
    private ComboBox convertToField;
    private Label convertToLabel;
    private TextField convertToTextField;
    private Label convertToAmountLabel;
    private static Label noticeLabel;
    private Button convertButton;
    private CurrencyConverterController controller;

    private Label InstuctionsLabel;

    public void init() {
        convertFromField = new ComboBox();
        convertToField = new ComboBox();
        controller = new CurrencyConverterController(this);
        List<CurrencyConverter> currencies = controller.getCurrencies();
        for (CurrencyConverter currency : currencies) {
            controller.addCurrency(currency.getName());
        }
    }
    public static void setNoticeLabel(String amount) {
        noticeLabel.setText("Notice: " + amount);
    }

    public void addToConvertFromField(String currency) {
        if (convertFromField == null) {
            convertFromField = new ComboBox<>();
        }
        convertFromField.getItems().add(currency);
    }
    public void addToConvertToField(String currency) {
        if (convertToField == null) {
            convertToField = new ComboBox<>();
        }
        convertToField.getItems().add(currency);

    }
    public void start(Stage window) {
        try{
        init();
        convertFromLabel = new Label("Convert from: ");
        convertFromTextField = new TextField();
        convertFromAmountLabel = new Label("Amount: ");

        convertButton = new Button("Convert");
        convertButton.setOnAction((event) -> {
            try {
                String amountText = convertFromTextField.getText();
                if (amountText.isEmpty()) { amountText = convertToTextField.getText(); }

                if (amountText.isEmpty()) {
                    setNoticeLabel("Amount is empty");
                } else {

                    double amount = Double.parseDouble(amountText);
                    if (convertFromField.getValue() == null || convertToField.getValue() == null) {
                        setNoticeLabel("Currency is empty");

                    } else {
                        String currencyFrom = convertFromField.getValue().toString();
                        double convertedAmount = controller.convertFromUSD(amount, currencyFrom);
                        String currencyTo = convertToField.getValue().toString();
                        convertedAmount = controller.convertToUSD(convertedAmount, currencyTo);
                        convertToTextField.setText(String.valueOf(convertedAmount));
                        setNoticeLabel("Conversion successful!");
                    }

                }
            }catch (NumberFormatException e) {
                setNoticeLabel("Invalid amount format");
            }
            });

        convertToLabel = new Label("Convert to: ");
        convertToTextField = new TextField();
        convertToAmountLabel = new Label("Amount: ");
        noticeLabel = new Label("Notice: ");
        controller.printAllCurrencies();

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);

        GridPane grid = new GridPane();
        grid.add(convertFromLabel, 0, 0);
        grid.add(convertFromField, 1, 0);
        grid.add(convertToLabel, 3, 0);
        grid.add(convertToField, 4, 0);

        grid.add(convertFromAmountLabel, 0, 1);
        grid.add(convertFromTextField, 1, 1);
        grid.add(convertToAmountLabel, 3, 1);
        grid.add(convertToTextField, 4, 1);

        grid.add(convertButton, 2, 2);
        grid.add(noticeLabel, 2, 3);

        VBox vBox = new VBox();
        InstuctionsLabel = new Label("Instructions: \n1. Select currency to convert from and to. \n2. Enter amount to convert. \n3. Click convert button. \n4. Converted amount will be displayed in the 'Amount' field. ");
        vBox.getChildren().addAll(InstuctionsLabel);




        hBox.getChildren().addAll(grid, vBox);


        Scene scene = new Scene(hBox);
        window.setScene(scene);
        window.show();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


}
