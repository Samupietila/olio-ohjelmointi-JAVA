package controller;

import dao.CurrencyDao;
import entity.CurrencyConverter;
import view.CurrencyConverterView;

import java.util.List;

public class CurrencyConverterController {

    private CurrencyConverterView view;
    private CurrencyDao currencyDao;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.currencyDao = new CurrencyDao();
        this.view = view;

    }

    public List<CurrencyConverter> getCurrencies() {
        System.out.println(currencyDao.findAll());
        return currencyDao.findAll();
    }
    public void addCurrency(String name) {
        view.addToConvertToField(name);
        view.addToConvertFromField(name);
    }

    public double convertFromUSD(double amount, String currency) {
        double convertedAmount = 0;
        try {
            double rate = currencyDao.findRate(currency);
            if (rate != 0) {
                convertedAmount = amount / rate;
            } else {
                view.setNoticeLabel("Invalid rate");
            }
        } catch (Exception e) {
            view.setNoticeLabel("Invalid input");
            System.out.println(e);
        }
        return convertedAmount;
    }
    public double convertToUSD(double amount, String currency) {
        double convertedAmount = 0;
        try {
            double rate = currencyDao.findRate(currency);
            if (rate != 0) {
                convertedAmount = amount * rate;
            } else {
                view.setNoticeLabel("Invalid rate");
            }
        } catch (Exception e) {
            view.setNoticeLabel("Invalid input");
            System.out.println(e);
        }
        return convertedAmount;
    }

    public void printAllCurrencies() {
        currencyDao.findAll().forEach(System.out::println);
    }

}
