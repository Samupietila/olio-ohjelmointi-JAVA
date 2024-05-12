package dao;

import jakarta.persistence.EntityManager;
import entity.CurrencyConverter;
import jakarta.persistence.NoResultException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDao {
    public void persist(CurrencyConverter currency) {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();

    }

    public List<CurrencyConverter> findAll() {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        List<CurrencyConverter> currencies = em.createQuery("SELECT c FROM CurrencyConverter c", CurrencyConverter.class).getResultList();

        return currencies;
    }

    public CurrencyConverter findById(int id) {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        CurrencyConverter currency = em.find(CurrencyConverter.class, id);

        return currency;
    }

    public void update(CurrencyConverter currency) {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();

    }

    public void delete(CurrencyConverter currency) {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();

    }

    public double findRate(String currency) {
        EntityManager em = datasource.MariaDbConnection.getInstance();
        try {
            CurrencyConverter currencyConverter = em.createQuery("SELECT c FROM CurrencyConverter c WHERE c.code = :currency", CurrencyConverter.class)
                    .setParameter("currency", currency)
                    .getSingleResult();

            return currencyConverter.getRate();
        } catch (NoResultException e) {
            return 0.0;
        }
    }
}

