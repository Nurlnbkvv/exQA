package com.exam.exqa.Service.methodService;

import com.exam.exqa.Dao.TicketRepository;
import com.exam.exqa.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class TicketService {
    @Autowired
    private TicketService ticketService;

    public static void addTicket(TicketRepository ticketRepository) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        System.out.println("Добавление номер билета! ");
        System.out.println("Введите номер билета: ");
        ticket.setTicket_number(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление идентификатор клиента билета! ");
        System.out.println("Введите идентификатор клиента билета: ");
        ticket.setTicket_client_id(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление номер рейса билета! ");
        System.out.println("Введите номер рейса билета");
        ticket.setTicket_flight_number(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление время получения билетов! ");
        System.out.println("Введите время получения билетов");
        ticket.setTicket_pick_up_time(scanner.nextLine());
        scanner.nextLine();
        ticketRepository.addTicket(ticket);
    }

    public static void dropTicket(TicketRepository ticketRepository) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        System.out.println("Удаление номер билета! ");
        System.out.println("Введите номер билета: ");
        ticket.setTicket_number(scanner.nextInt());
        scanner.nextInt();
        ticketRepository.dropTicket(ticket);
    }

    public static void updateTicket(TicketRepository ticketRepository) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        System.out.println("Изменение номер билета! ");
        System.out.println("Введите номер билета: ");
        ticket.setTicket_number(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить идентификатор клиента билета: ");
        System.out.println("Введите идентификатор клиента билета: ");
        ticket.setTicket_client_id(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить номер рейса билета: ");
        System.out.println("Введите номер рейса билета: ");
        ticket.setTicket_flight_number(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Изменить время получения билетов! ");
        System.out.println("Введите время получения билетов: ");
        ticket.setTicket_pick_up_time(scanner.nextLine());
        scanner.nextLine();
        ticketRepository.updateTicket(ticket);
    }

    public static void questTicket(TicketRepository ticketRepository) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        System.out.println("Поиск номер билета! ");
        System.out.println("Введите номер билета: ");
        ticket.setTicket_number(scanner.nextInt());
        scanner.nextInt();
        ticketRepository.questTicket(ticket);
    }

    public static void displayTicket(TicketRepository ticketRepository) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = new Ticket();
        System.out.println("Показать номер билета! ");
        System.out.println("Введите номер билета: ");
        ticket.setTicket_number(scanner.nextInt());
        ticketRepository.displayTicket(ticket);
    }
}

