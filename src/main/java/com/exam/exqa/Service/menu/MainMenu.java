package com.exam.exqa.Service.menu;


import java.util.Scanner;

public class MainMenu {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int menuItem;
            System.out.println("Главное меню: ");
            System.out.println("1) Работа с рейсами");
            System.out.println("2) Работа со странами");
            System.out.println("3) Работа с аэропортом");
            System.out.println("4) Работа с клиентами");
            System.out.println("5) Работа с билетами");
            System.out.println("0) Выход");
            menuItem = scanner.nextInt();
            if (menuItem == 1) {
                FlightMenu.start();
            }else if (menuItem == 2) {
                AirportMenu.start();
            }else if (menuItem == 3) {
                CountryMenu.start();
            }else if (menuItem == 4) {
                ClientMenu.start();
            }else if (menuItem == 5) {
                TicketMenu.start();
            }else if (menuItem == 0) {
                System.out.println("Выход из программы....");
                return;
            }else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
