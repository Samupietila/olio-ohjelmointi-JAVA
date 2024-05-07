package controller;
import entity.*;
import dao.*;
import view.CurrencyConverterView;

import java.sql.SQLException;
import java.util.List;

public class CurrencyConverterController {

    private CurrencyConverterView view;
    private CurrencyDao currencyDao;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.currencyDao = new CurrencyDao();
        this.view = view;

    }

    public List<CurrencyConverter> getCurrencies() {
        System.out.println(currencyDao.getCurrencies());
        return currencyDao.getCurrencies();
    }
    public void addCurrency(String name) {
        view.addToConvertToField(name);
        view.addToConvertFromField(name);
    }

    public double convertFromUSD(double amount, String currency) {
        double convertedAmount = 0;
        try {
            double rate = currencyDao.getRate(currency);
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
            double rate = currencyDao.getRate(currency);
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
        currencyDao.getCurrencies().forEach((currency) -> {
            System.out.println(currency);
        });
    }

}
