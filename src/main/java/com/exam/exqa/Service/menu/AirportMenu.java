package com.exam.exqa.Service.menu;

import com.exam.exqa.Dao.AirportRepository;
import com.exam.exqa.Model.Airport;
import com.exam.exqa.Model.Flight;
import com.exam.exqa.Service.methodService.AirportService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class AirportMenu {
    @Autowired
    private static AirportRepository airportRepository;
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int menuItem;
            System.out.println("Меню аэропортов: ");
            System.out.println("1) Добавление аэропорта");
            System.out.println("2) Удаление аэропорта");
            System.out.println("3) Изменение аэропорта");
            System.out.println("4) Поиск аэропорта по коду");
            System.out.println("5) Выводе списка аэропортов");
            System.out.println("0) Выход");
             /*
            В выводе списка аэропортов должны быть также
            выводы с фильтрами (можно сделать меню)
             */
            menuItem = scanner.nextInt();
            if (menuItem == 1) {
                AirportService.addAirport(airportRepository);
            } else if (menuItem == 2) {
                AirportService.dropAirport(airportRepository);
            } else if (menuItem == 3) {
                AirportService.updateAirport(airportRepository);
            } else if (menuItem == 4) {
                AirportService.questairport(airportRepository);
            } else if (menuItem == 5) {
                AirportService.displayairport(airportRepository);
            } else if (menuItem == 0) {
                System.out.println("Выход из программы....");
                return;
            } else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
