package com.exam.exqa.Dao;

import com.exam.exqa.Model.Country;
import com.exam.exqa.Model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository {

    @Autowired
    private DataSource dataSource;

    public void saveFlight(Flight flight) {
        String SQL_SAVE = "INSERT INTO \"qa\".flight (airplane_model, departure_time, departure_point, place_of_arrival, flight_duration, number_of_seats) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE)) {
            preparedStatement.setString(1, flight.getAirplane_model());
            preparedStatement.setString(2, flight.getDeparture_time());
            preparedStatement.setString(3, flight.getDeparture_point());
            preparedStatement.setString(4, flight.getPlace_of_arrival());
            preparedStatement.setInt(5, flight.getFlight_duration());
            preparedStatement.setInt(6, flight.getNumber_of_seats());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFlight(Integer flight_number) {
        String SQL_DELETE = "DELETE FROM \"qa\".flight where flight_number = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)) {
            preparedStatement.setInt(1, flight_number);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editUser(Flight flight) {
        String SQL_EDIT = "UPDATE \"qa\".flight set airplane_model, departure_time, departure_point, place_of_arrival, flight_duration, number_of_seats " +
                " WHERE flight_number = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_EDIT)) {
            preparedStatement.setString(1, flight.getAirplane_model());
            preparedStatement.setString(2, flight.getDeparture_time());
            preparedStatement.setString(3, flight.getDeparture_point());
            preparedStatement.setString(4, flight.getPlace_of_arrival());
            preparedStatement.setInt(5, flight.getFlight_duration());
            preparedStatement.setInt(6, flight.getNumber_of_seats());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SearchFlight(Integer flight_number) {
        String SQL_SEARCH = "SELECT * FROM \"qa\".flight where flight_number = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SEARCH)) {
            preparedStatement.setInt(1, flight_number);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        String SQL_GET_ALL = "SELECT * FROM \"qa\".flight where flight_number = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_GET_ALL);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Flight flight = new Flight();
                flight.setAirplane_model(resultSet.getString("airplane_model"));
                flight.setDeparture_time(String.valueOf(resultSet.getDate("departure_time")));
                flight.setDeparture_point(resultSet.getString("departure_point"));
                flight.setPlace_of_arrival(resultSet.getString("place_of_arrival"));
                flight.setFlight_duration(resultSet.getInt("flight_duration"));
                flight.setNumber_of_seats(resultSet.getInt("number_of_seats"));
                flight.setFlight_number(resultSet.getInt("flight_number"));
                flights.add(flight);
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
        return flights;
    }
    public void addFlight(Flight flight) {
        flight.setFlight_number(flight.getFlight_number());
    }

    public void updateFlight(Flight flight) {
        flight.setFlight_number(flight.getFlight_number());
    }

    public void questFlight(Flight flight) {
        flight.setFlight_number(flight.getFlight_number());
    }

    public void displayFlight(Flight flight) {
        flight.setFlight_number(flight.getFlight_number());
    }

    public void dropFlight(Flight flight) {
        flight.setFlight_number(flight.getFlight_number());
    }
}
