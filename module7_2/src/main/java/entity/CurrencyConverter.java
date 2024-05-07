package entity;

import java.util.HashMap;
public class CurrencyConverter {

    private String name;
    private String code;
    private String symbol;
    private double rate;

    public CurrencyConverter(String name, String code, String symbol, double rate) {
        this.name = name;
        this.code = code;
        this.symbol = symbol;
        this.rate = rate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
