package com.exam.exqa.Service.methodService;

import com.exam.exqa.Dao.AirportRepository;
import com.exam.exqa.Model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class AirportService {
    @Autowired
    private AirportService airportService;

    public static void addAirport(AirportRepository airportRepository) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Добавление код аэропорта! ");
        System.out.println("Введите код аэропорта: ");
        airport.setAirport_code(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление местоположение города! ");
        System.out.println("Введите местоположение города: ");
        airport.setCity_location(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление код аэропорта страны! ");
        System.out.println("Введите код аэропорта страны");
        airport.setAirport_country_code(scanner.nextLine());
        scanner.nextLine();
        airportRepository.addAirport(airport);
    }

    public static void dropAirport(AirportRepository airportRepository) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Удаление код аэропорта! ");
        System.out.println("Введите код аэропорта: ");
        airport.setAirport_code (scanner.nextLine());
        scanner.nextInt();
        airportRepository.dropAirport(airport);
    }

    public static void updateAirport(AirportRepository airportRepository) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Изменение код аэропорта! ");
        System.out.println("Введите код аэропорта: ");
        airport.setAirport_code(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить местоположение города: ");
        System.out.println("Введите местоположение города: ");
        airport.setCity_location(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить код аэропорта страны: ");
        System.out.println("код аэропорта страны: ");
        airport.setAirport_country_code(scanner.nextLine());
        scanner.nextLine();
        airportRepository.updateAirport(airport);
    }

    public static void questairport(AirportRepository airportRepository) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Поиск код аэропорта! ");
        System.out.println("Введите код аэропорта: ");
        airport.setAirport_code(scanner.nextLine());
        scanner.nextLine();
        airportRepository.questAirport(airport);
    }

    public static void displayairport(AirportRepository airportRepository) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Показать код аэропорта! ");
        System.out.println("Введите код аэропорта: ");
        airport.setAirport_code(scanner.nextLine());
        airportRepository.displayAirport(airport);
    }
}

