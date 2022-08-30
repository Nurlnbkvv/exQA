package com.exam.exqa.Dao;

import com.exam.exqa.Model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirportRepository {

    @Autowired
    private DataSource dataSource;

    public void saveAirport(Airport airport) {
        String SQL_SAVE = "INSERT INTO \"qa\".airport (airport_code, city_location, airport_country_code)" +
                "VALUES (?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE)) {
            preparedStatement.setString(1, airport.getAirport_code());
            preparedStatement.setString(2, airport.getCity_location());
            preparedStatement.setString(3, airport.getAirport_country_code());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAirport(String airport_code) {
        String SQL_DELETE = "DELETE FROM \"qa\".airport where airport_code = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)) {
            preparedStatement.setString(1, airport_code);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editUser(Airport airport) {
        String SQL_EDIT = "UPDATE \"qa\".airport set airport_code, city_location, airport_country_code" +
                " WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_EDIT)) {
            preparedStatement.setString(1, airport.getAirport_code());
            preparedStatement.setString(2, airport.getCity_location());
            preparedStatement.setString(3, airport.getAirport_country_code());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SearchAirport(String airport_code) {
        String SQL_SEARCH = "SELECT * FROM \"qa\".airport where airport_code = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SEARCH)) {
            preparedStatement.setString(1, airport_code);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Airport> getAllAirports() {
        List<Airport> airports = new ArrayList<>();
        String SQL_GET_ALL = "SELECT * FROM \"qa\".airport";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_GET_ALL);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Airport airport = new Airport();
                airport.setAirport_code(resultSet.getString("airport_code"));
                airport.setCity_location(resultSet.getString("city_location"));
                airport.setAirport_country_code(resultSet.getString("airport_country_code"));

                airports.add(airport);
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
        return airports;
    }

    public void addAirport(Airport airport) {
        airport.setAirport_code(airport.getAirport_code());
    }

    public void dropAirport(Airport airport) {
        airport.setAirport_code(airport.getAirport_code());
    }

    public void updateAirport(Airport airport) {
        airport.setAirport_code(airport.getAirport_code());
    }

    public void questAirport(Airport airport) {
        airport.setAirport_code(airport.getAirport_code());
    }

    public void displayAirport(Airport airport) {
        airport.setAirport_code(airport.getAirport_code());
    }
}
