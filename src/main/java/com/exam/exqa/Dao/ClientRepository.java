package com.exam.exqa.Dao;

import com.exam.exqa.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {

    @Autowired
    private DataSource dataSource;

    public void saveClient(Client client) {
        String SQL_SAVE = "INSERT INTO \"qa\".client (inn, fio, year_of_birth, gender, nationality) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE)) {
            preparedStatement.setInt(1, client.getInn());
            preparedStatement.setString(2, client.getFio());
            preparedStatement.setInt(3, client.getYear_of_birth());
            preparedStatement.setString(4, client.getGender());
            preparedStatement.setString(5, client.getNationality());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteClient(Integer passport_id) {
        String SQL_DELETE = "DELETE FROM \"qa\".client where passport_id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)) {
            preparedStatement.setInt(1, passport_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editClient(Client client) {
        String SQL_EDIT = "UPDATE \"qa\".client set inn, fio, year_of_birth, gender, nationality" +
                " WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_EDIT)) {
            preparedStatement.setInt(1, client.getInn());
            preparedStatement.setString(2, client.getFio());
            preparedStatement.setInt(3, client.getYear_of_birth());
            preparedStatement.setString(4, client.getGender());
            preparedStatement.setString(5, client.getNationality());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SearchClient(Integer passport_id) {
        String SQL_SEARCH = "SELECT * FROM \"qa\".client where passport_id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SEARCH)) {
            preparedStatement.setInt(1, passport_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        String SQL_GET_ALL = "SELECT * FROM \"qa\".client";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_GET_ALL);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Client client = new Client();
                client.setInn(resultSet.getInt("inn"));
                client.setFio(resultSet.getString("fio"));
                client.setYear_of_birth(resultSet.getInt("year_of_birth"));
                client.setGender(resultSet.getString("gender"));
                client.setNationality(resultSet.getString("nationality"));
                client.setPassport_id(resultSet.getInt("passport_id"));

                clients.add(client);
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
        return clients;
    }

    public void addClient(Client client) {
        client.setPassport_id(client.getPassport_id());
    }

    public void dropClient(Client client) {
        client.setPassport_id(client.getPassport_id());
    }

    public void updateClient(Client client) {
        client.setPassport_id(client.getPassport_id());
    }

    public void questClient(Client client) {
        client.setPassport_id(client.getPassport_id());
    }

    public void displayClient(Client client) {
        client.setPassport_id(client.getPassport_id());
    }
}