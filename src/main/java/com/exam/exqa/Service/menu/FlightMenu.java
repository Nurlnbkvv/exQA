package com.exam.exqa.Service.menu;

import com.exam.exqa.Dao.FlightRepository;
import com.exam.exqa.Model.Flight;
import com.exam.exqa.Service.methodService.FlightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class FlightMenu {
    @Autowired
    private static FlightRepository flightRepository;
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int menuItem;
            System.out.println("Меню рейсов: ");
            System.out.println("1) Добавление рейса");
            System.out.println("2) Удаление рейса");
            System.out.println("3) Изменение рейса");
            System.out.println("4) Поиск рейса по номеру");
            System.out.println("5) Выводе списка рейсов");
            /*
            В выводе списка рейсов должны быть также
            выводы с фильтрами (можно сделать меню)
             */
            System.out.println("0) Выход");

            menuItem = scanner.nextInt();
            if (menuItem == 1) {
                FlightService.addFlight(flightRepository);
            } else if (menuItem == 2) {
                FlightService.dropFlight(flightRepository);
            } else if (menuItem == 3) {
                FlightService.updateFlight(flightRepository);
            } else if (menuItem == 4) {
                FlightService.questFlight(flightRepository);
            } else if (menuItem == 5) {
                FlightService.displayFlight(flightRepository);
            } else if (menuItem == 0) {
                System.out.println("Выход из программы....");
                return;
            } else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }

    }
