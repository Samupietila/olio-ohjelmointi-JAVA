package application;
import entity.*;
import dao.*;
import java.util.*;
public class CurrencyApp {
    public static void main(String[] args) {
        CurrencyDao dao = new CurrencyDao();
        List<CurrencyConverter> currencies = dao.getCurrencies();
        for (CurrencyConverter currency : currencies) {
            System.out.println(currency.getName() + " - " + currency.getCode() + " - " + currency.getSymbol() + " - " + currency.getRate());
        }

        CurrencyConverter currency = dao.getCurrency(3);
        if (currency != null) {
            System.out.println(currency.getName() + " - " + currency.getCode() + " - " + currency.getSymbol() + " - " + currency.getRate());
        }
        else {
            System.out.println("Currency not found");
        }

        dao.persist(new CurrencyConverter("OravanNahka", "ORV", "O", 0.5));
        dao.persist(new CurrencyConverter("KuukkelinKulta", "KUU", "K", 1.5));
        dao.persist(new CurrencyConverter("KettuKolikko", "KET", "KK", 2.5));
        dao.persist(new CurrencyConverter("KarhunKynsi", "KAR", "K", 3.5));
        dao.persist(new CurrencyConverter("HirvenHirsi", "HIR", "H", 4.5));
        dao.persist(new CurrencyConverter("SudenSilmä", "SUD", "S", 5.5));

        datasource.MariaDbConnection.terminate();
    }
}
