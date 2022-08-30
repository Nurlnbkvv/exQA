package com.exam.exqa.Service.menu;

import com.exam.exqa.Dao.CountryRepository;
import com.exam.exqa.Model.Country;
import com.exam.exqa.Service.methodService.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class CountryMenu {
    @Autowired
    private static CountryRepository countryRepository;
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int menuItem;
            System.out.println("Меню стран: ");
            System.out.println("1) Добавление страны");
            System.out.println("2) Удаление страны");
            System.out.println("3) Изменение страны");
            System.out.println("4) Поиск страны по коду");
            System.out.println("5) Выводе списка стран");
            System.out.println("0) Выход");

            menuItem = scanner.nextInt();
            if (menuItem == 1) {
                CountryService.addCountry(countryRepository);
            } else if (menuItem == 2) {
                CountryService.dropCountry(countryRepository);
            } else if (menuItem == 3) {
                CountryService.updateCountry(countryRepository);
            } else if (menuItem == 4) {
                CountryService.questCountry(countryRepository);
            } else if (menuItem == 5) {
                CountryService.displayCountry(countryRepository);
            } else if (menuItem == 0) {
                System.out.println("Выход из программы....");
                return;
            } else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}

