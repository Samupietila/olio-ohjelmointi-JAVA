package model;

import java.util.HashMap;
public class CurrencyConverter {
    private HashMap<String, Double> currencies;

    public CurrencyConverter() {
        this.currencies = new HashMap<>();
    }
    public double getCurrencyRate(String currency) {
        return this.currencies.get(currency.toUpperCase());
    }
    public void addCurrency(String currency, double rate) {
        this.currencies.put(currency.toUpperCase(), rate);
    }

    public int amountOfCurrencies() {
        return this.currencies.size();
    }
public void printAllCurrencies() {
        for (String currency : this.currencies.keySet()) {
            System.out.println(currency + " - " + this.currencies.get(currency));
        }
    }
}
