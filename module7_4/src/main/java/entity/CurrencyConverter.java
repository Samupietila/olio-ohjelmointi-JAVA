package entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "currencies")

public class CurrencyConverter {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private String symbol;
    private double rate;

    @OneToMany(mappedBy = "sourceCurrency")
    private List<Transaction> sourceTransactions;

    @OneToMany(mappedBy = "targetCurrency")
    private List<Transaction> targetTransactions;


    public CurrencyConverter() {
    }
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
