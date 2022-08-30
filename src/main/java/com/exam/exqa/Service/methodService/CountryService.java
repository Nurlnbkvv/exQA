package com.exam.exqa.Service.methodService;

import com.exam.exqa.Dao.CountryRepository;
import com.exam.exqa.Dao.FlightRepository;
import com.exam.exqa.Model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class CountryService {
    @Autowired
    private CountryService countryService;

    public static void addCountry(CountryRepository countryRepository) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();
        System.out.println("Добавление страны! ");
        System.out.println("Введите код страны: ");
        country.setCountry_code(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Введите название страны: ");
        country.setName_country(scanner.nextLine());
        countryRepository.addCountry(country);
    }

    public static void dropCountry(CountryRepository countryRepository) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();
        System.out.println("Удаление страны! ");
        System.out.println("Введите номер страны: ");
        country.setCountry_code(scanner.nextLine());
        scanner.nextLine();
        CountryRepository.dropCountry(country);
    }

    public static void updateCountry(CountryRepository countryRepository) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();
        System.out.println("Изменение страны! ");
        System.out.println("Введите номер страны: ");
        country.setCountry_code(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменение название страны: ");
        country.setName_country(scanner.nextLine());
        scanner.nextLine();
        countryRepository.updateCountry(country);
    }

    public static void questCountry(CountryRepository countryRepository) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();
        System.out.println("Поиск страны! ");
        System.out.println("Введите номер страны: ");
        country.setCountry_code(scanner.nextLine());
        scanner.nextLine();
        countryRepository.questCountry(country);
    }

    public static void displayCountry(CountryRepository countryRepository) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();
        System.out.println("Показать код страны! ");
        System.out.println("Введите номер страны: ");
        country.setCountry_code(scanner.nextLine());
        scanner.nextLine();
        countryRepository.displayCountry(country);
    }
}

