package dao;
import entity.CurrencyConverter;
import java.util.*;
import java.sql.*;
import datasource.MariaDbConnection;

public class CurrencyDao {
    public List<CurrencyConverter> getCurrencies() {
        Connection conn = MariaDbConnection.getConnection();
        List<CurrencyConverter> currencies = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM currencies");
            while (rs.next()) {
                String name = rs.getString(2);
                String code = rs.getString(3);
                String symbol = rs.getString(4);
                double rate = rs.getDouble(5);

                CurrencyConverter currency = new CurrencyConverter(name, code, symbol, rate);
                currencies.add(currency);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            view.CurrencyConverterView.setNoticeLabel("Error in fetching data from database.");
        }
        return currencies;
    }
    public CurrencyConverter getCurrency(int id) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT name, code, symbol, rate  FROM currencies WHERE id=?";

        String name = null;
        String code = null;
        String symbol = null;
        double rate = 0.0;
        int count = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                name = rs.getString(1);
                code = rs.getString(2);
                symbol = rs.getString(3);
                rate = rs.getDouble(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            view.CurrencyConverterView.setNoticeLabel("Error in fetching data from database.");

        }

        if (count==1) {
            return new CurrencyConverter(name, code, symbol, rate);
        }
        else {
            return null;
        }
    }
    public double convertToUSD(double amount, String currency){
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT rate FROM currencies WHERE name=?";
        double rate = 0.0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, currency);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rate = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            view.CurrencyConverterView.setNoticeLabel("Error in fetching data from database.");

        }
        return amount * rate;
    }

    public double convertFromUSD(double amount, String currency){
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT rate FROM currencies WHERE name=?";
        double rate = 0.0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, currency);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rate = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            view.CurrencyConverterView.setNoticeLabel("Error in fetching data from database.");

        }
        return amount / rate;
    }
    public void persist(CurrencyConverter currency) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "INSERT INTO currencies (name, code, symbol, rate) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, currency.getName());
            ps.setString(2, currency.getCode());
            ps.setString(3, currency.getSymbol());
            ps.setDouble(4, currency.getRate());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            view.CurrencyConverterView.setNoticeLabel("Error in fetching data from database.");

        }
    }

    public double getRate(String currency) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT rate FROM currencies WHERE name=?";
        double rate = 0.0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, currency);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rate = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            view.CurrencyConverterView.setNoticeLabel("Error in fetching data from database.");

        }
        return rate;
    }
}

