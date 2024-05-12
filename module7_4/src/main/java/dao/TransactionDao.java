package dao;
import entity.Transaction;
import jakarta.persistence.EntityManager;

public class TransactionDao {
    public void persist(Transaction transaction) {
        EntityManager entityManager = datasource.MariaDbConnection.getInstance();
        entityManager.getTransaction().begin();
        entityManager.persist(transaction);
        entityManager.getTransaction().commit();

    }
}
