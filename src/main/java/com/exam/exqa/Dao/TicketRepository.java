package com.exam.exqa.Dao;

import com.exam.exqa.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {

    @Autowired
    private DataSource dataSource;

    public void saveTicket(Ticket ticket) {
        String SQL_SAVE = "INSERT INTO \"qa\".ticket (ticket_client_id, ticket_flight_number, ticket_pick_up_time) " +
                "VALUES (?, ?, ?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE)) {
            preparedStatement.setInt(1, ticket.getTicket_client_id());
            preparedStatement.setInt(2, ticket.getTicket_flight_number());
            preparedStatement.setDate(3, (Date) ticket.getTicket_pick_up_time());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTicket(Integer ticket_number) {
        String SQL_DELETE = "DELETE FROM \"qa\".ticket where ticket_number = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)) {
            preparedStatement.setInt(1, ticket_number);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editTicket(Ticket ticket) {
        String SQL_EDIT = "UPDATE \"qa\".ticket set ticket_client_id, ticket_flight_number, ticket_pick_up_time" +
                " WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_EDIT)) {
            preparedStatement.setInt(1, ticket.getTicket_client_id());
            preparedStatement.setInt(2, ticket.getTicket_flight_number());
            preparedStatement.setDate(3, (Date) ticket.getTicket_pick_up_time());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SearchTicket(Integer ticket_number) {
        String SQL_SEARCH = "SELECT * FROM \"qa\".ticket where ticket_number = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SEARCH)) {
            preparedStatement.setInt(1, ticket_number);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String SQL_GET_ALL = "SELECT * FROM \"qa\".ticket";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_GET_ALL);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Ticket ticket = new Ticket();
                ticket.setTicket_client_id(resultSet.getInt("ticket_client_id"));
                ticket.setTicket_flight_number(resultSet.getInt("ticket_flight_number"));
                ticket.setTicket_pick_up_time(Timestamp.valueOf(String.valueOf(resultSet.getTimestamp("ticket_pick_up_time"))));
                ticket.setTicket_number(resultSet.getInt("ticket_number"));

                tickets.add(ticket);
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        ticket.setTicket_number(ticket.getTicket_number());
    }

    public void dropTicket(Ticket ticket) {
        ticket.setTicket_number(ticket.getTicket_number());
    }

    public void updateTicket(Ticket ticket) {
        ticket.setTicket_number(ticket.getTicket_number());
    }

    public void questTicket(Ticket ticket) {
        ticket.setTicket_number(ticket.getTicket_number());
    }

    public void displayTicket(Ticket ticket) {
        ticket.setTicket_number(ticket.getTicket_number());
    }
}