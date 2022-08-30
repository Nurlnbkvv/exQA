package com.exam.exqa.Dao;

import com.exam.exqa.Model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CountryRepository {

    @Autowired
    private static DataSource dataSource;

    public void saveCountry(Country country) {
        String SQL_SAVE = "INSERT INTO \"qa\".country (country_code, name_country)" +
                "VALUES (?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE)) {
            preparedStatement.setString(1, country.getCountry_code());
            preparedStatement.setString(2, country.getName_country());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCountry(String country_code) {
        String SQL_DELETE = "DELETE FROM \"qa\".country where country_code = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)) {
            preparedStatement.setString(1, country_code);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editUser(Country country) {
        String SQL_EDIT = "UPDATE \"qa\".country set country_code, name_country" + " WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_EDIT)) {
            preparedStatement.setString(1, country.getCountry_code());
            preparedStatement.setString(2, country.getName_country());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SearchCountry(String country_code) {
        String SQL_SEARCH = "SELECT * FROM \"qa\".country where country_code = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SEARCH)) {
            preparedStatement.setString(1, country_code);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<>();
        String SQL_GET_ALL = "SELECT * FROM \"qa\".country";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_GET_ALL);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Country country = new Country();
                country.setCountry_code(resultSet.getString("country_code"));
                country.setName_country(resultSet.getString("name_country"));
                countries.add(country);
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
        return countries;
    }

    public void addCountry(Country country) {
        country.setCountry_code(country.getCountry_code());
    }

    public static void dropCountry(Country country) {
        country.setCountry_code(country.getCountry_code());
    }

    public void updateCountry(Country country) {
        country.setCountry_code(country.getCountry_code());
    }

    public void questCountry(Country country) {
        country.setCountry_code(country.getCountry_code());
    }

    public void displayCountry(Country country) {
        country.setCountry_code(country.getCountry_code());
    }
}
