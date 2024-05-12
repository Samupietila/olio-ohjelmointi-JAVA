package entity;
import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "source_currency_id")
    private CurrencyConverter sourceCurrency;

    @ManyToOne
    @JoinColumn(name = "target_currency_id")
    private CurrencyConverter targetCurrency;
    private double sourceAmount;
    public Transaction() {
    }
    public Transaction(CurrencyConverter sourceCurrency, CurrencyConverter targetCurrency, double sourceAmount) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.sourceAmount = sourceAmount;
    }
    public CurrencyConverter getSourceCurrency() {
        return sourceCurrency;
    }
    public void setSourceCurrency(CurrencyConverter sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }
    public CurrencyConverter getTargetCurrency() {
        return targetCurrency;
    }
    public void setTargetCurrency(CurrencyConverter targetCurrency) {
        this.targetCurrency = targetCurrency;
    }
    public double getSourceAmount() {
        return sourceAmount;
    }
    public void setSourceAmount(double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }
}
