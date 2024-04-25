package controller;
import model.CurrencyConverter;
import view.CurrencyConverterView;
public class CurrencyConverterController {
    private CurrencyConverter currencyConverter;
    private CurrencyConverterView view;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.currencyConverter = new CurrencyConverter();
        this.view = view;
    }

    public void addCurrency(String currency, double rate) {
        currencyConverter.addCurrency(currency, rate);
        view.addToConvertToField(currency);
        view.addToConvertFromField(currency);
    }

    public double convertFromUSD(double amount, String currency) {
        System.out.println(amount);
        System.out.println(currency);
        Double rate = currencyConverter.getCurrencyRate(currency);
        System.out.println(rate);
        double convertedAmount = 0;
        try {

            convertedAmount = amount / rate;

        } catch (Exception e) {
            view.setNoticeLabel("Invalid input");
            System.out.println(e);
        }
        return convertedAmount;
    }
    public double convertToUSD(double amount, String currency) {
        System.out.println(amount);
        System.out.println(currency);
        Double rate = currencyConverter.getCurrencyRate(currency);
        System.out.println(rate);
        double convertedAmount = 0;
        try {

            convertedAmount = amount * rate;

        } catch (Exception e) {
            view.setNoticeLabel("Invalid input");
            System.out.println(e);
        }
        return convertedAmount;
    }

    public void printAllCurrencies() {
        System.out.println(currencyConverter.amountOfCurrencies());
        currencyConverter.printAllCurrencies();
    }

}
