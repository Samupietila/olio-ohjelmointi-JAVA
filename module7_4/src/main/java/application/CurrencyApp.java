package application;

import dao.CurrencyDao;
import entity.CurrencyConverter;
import java.util.List;

public class CurrencyApp {
    public static void main(String[] args) {
        CurrencyDao dao = new CurrencyDao();
        dao.persist(new CurrencyConverter("uusi", "uus", "u", 1.0));
        List<CurrencyConverter> currencies = dao.findAll();
        for (CurrencyConverter currency : currencies) {
            System.out.println(currency.getName());
        }

        CurrencyConverter currency = dao.findById(1);
        currency.setName("uusi nimi");
        dao.update(currency);

    }
}
