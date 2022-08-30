package com.exam.exqa.Service.menu;

import com.exam.exqa.Dao.TicketRepository;
import com.exam.exqa.Model.Client;
import com.exam.exqa.Model.Ticket;
import com.exam.exqa.Service.methodService.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class TicketMenu {
    @Autowired
    private static TicketRepository ticketRepository;
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int menuItem;
            System.out.println("Меню билетов: ");
            System.out.println("1) Добавление билета");
            System.out.println("2) Удаление билета");
            System.out.println("3) Изменение билета");
            System.out.println("4) Поиск билета по номеру");
            System.out.println("5) Выводе списка билета");
            System.out.println("0) Выход");
             /*
            В выводе списка билетов должны быть также
            выводы с фильтрами (можно сделать меню)
             */
            menuItem = scanner.nextInt();
            if (menuItem == 1) {
                TicketService.addTicket(ticketRepository);
            } else if (menuItem == 2) {
                TicketService.dropTicket(ticketRepository);
            } else if (menuItem == 3) {
                TicketService.updateTicket(ticketRepository);
            } else if (menuItem == 4) {
                TicketService.questTicket(ticketRepository);
            } else if (menuItem == 5) {
                TicketService.displayTicket(ticketRepository);
            } else if (menuItem == 0) {
                System.out.println("Выход из программы....");
                return;
            } else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}