package com.exam.exqa.Service.methodService;

import com.exam.exqa.Dao.FlightRepository;
import com.exam.exqa.Model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class FlightService {
    @Autowired
    private FlightService flightService;

    public static void addFlight(FlightRepository flightRepository) {
        Scanner scanner = new Scanner(System.in);
        Flight flight = new Flight();
        System.out.println("Добавление рейса! ");
        System.out.println("Введите номер рейса: ");
        flight.setFlight_number(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Добавление модель самолета! ");
        System.out.println("Введите модель самолета: ");
        flight.setAirplane_model(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление время отправления! ");
        System.out.println("Введите время отправления");
        flight.setDeparture_time(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление пункт отправления! ");
        System.out.println("Введите пункт отправления");
        flight.setDeparture_point(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление место_прибытия! ");
        System.out.println("Введите место_прибытия");
        flight.setPlace_of_arrival(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление продолжительность полета! ");
        System.out.println("Введите продолжительность полета");
        flight.setFlight_duration(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление количество мест! ");
        System.out.println("Введите количество мест");
        flight.setNumber_of_seats(scanner.nextInt());
        scanner.nextInt();
        flightRepository.addFlight(flight);
    }

    public static void dropFlight(FlightRepository flightRepository) {
        Scanner scanner = new Scanner(System.in);
        Flight flight = new Flight();
        System.out.println("Удаление рейса! ");
        System.out.println("Введите номер рейса: ");
        flight.setFlight_number(scanner.nextInt());
        scanner.nextInt();
        flightRepository.dropFlight(flight);
    }

    public static void updateFlight(FlightRepository flightRepository) {
        Scanner scanner = new Scanner(System.in);
        Flight flight = new Flight();
        System.out.println("Изменение рейса! ");
        System.out.println("Введите номер рейса: ");
        flight.setFlight_number(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить модель самолета: ");
        System.out.println("Введите модель самолета: ");
        flight.setAirplane_model(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить время отправления: ");
        System.out.println("Введите время отправления: ");
        flight.setDeparture_time(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить пункт отправления! ");
        System.out.println("Введите пункт отправления: ");
        flight.setDeparture_point(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить место_прибытия! ");
        System.out.println("Введите место_прибытия: ");
        flight.setPlace_of_arrival(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить продолжительность полета! ");
        System.out.println("Введите продолжительность полета: ");
        flight.setFlight_duration(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить количество мест! ");
        System.out.println("Введите количество мест: ");
        flight.setFlight_duration(scanner.nextInt());
        scanner.nextInt();
        flightRepository.updateFlight(flight);
    }

    public static void questFlight(FlightRepository flightRepository) {
        Scanner scanner = new Scanner(System.in);
        Flight flight = new Flight();
        System.out.println("Поиск рейса! ");
        System.out.println("Введите номер рейса: ");
        flight.setFlight_number(scanner.nextInt());
        scanner.nextInt();
        flightRepository.questFlight(flight);
    }

    public static void displayFlight(FlightRepository flightRepository) {
        Scanner scanner = new Scanner(System.in);
        Flight flight = new Flight();
        System.out.println("Показать рейс! ");
        System.out.println("Введите номер рейса: ");
        flight.setFlight_number(scanner.nextInt());
        flightRepository.displayFlight(flight);
    }
}
