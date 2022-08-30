package com.exam.exqa.Service.methodService;

import com.exam.exqa.Dao.ClientRepository;
import com.exam.exqa.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ClientService {
    @Autowired
    private ClientService clientService;

    public static void addClient(ClientRepository clientRepository) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Добавление id паспорта! ");
        System.out.println("Введите id паспорта: ");
        client.setPassport_id(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление ИНН! ");
        System.out.println("Введите ИНН: ");
        client.setInn(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление фамилия, имя, отчество! ");
        System.out.println("Введите фамилия, имя, отчество");
        client.setFio(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление дату рождение! ");
        System.out.println("Введите дату рождение");
        client.setYear_of_birth(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Добавление гендера! ");
        System.out.println("Введите гендер");
        client.setGender(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Добавление национальности! ");
        System.out.println("Введите национальность");
        client.setNationality(scanner.nextLine());
        scanner.nextLine();
        clientRepository.addClient(client);
    }

    public static void dropClient(ClientRepository clientRepository) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Удаление id паспорта! ");
        System.out.println("Введите id паспорта: ");
        client.setPassport_id(scanner.nextInt());
        scanner.nextInt();
        clientRepository.dropClient(client);
    }

    public static void updateClient(ClientRepository clientRepository) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Изменение id паспорта! ");
        System.out.println("Введите id паспорта: ");
        client.setPassport_id(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить ИНН: ");
        System.out.println("Введите ИНН: ");
        client.setInn(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить фамилия, имя, отчество: ");
        System.out.println("Введите фамилия, имя, отчество: ");
        client.setFio(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить дату рождение! ");
        System.out.println("Введите дату рождение: ");
        client.setYear_of_birth(scanner.nextInt());
        scanner.nextInt();
        System.out.println("Изменить гендера! ");
        System.out.println("Введите гендер: ");
        client.setGender(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Изменить национальности! ");
        System.out.println("Введите национальность: ");
        client.setNationality(scanner.nextLine());
        scanner.nextLine();
        clientRepository.updateClient(client);
    }

    public static void questClient(ClientRepository clientRepository) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Поиск id паспорта! ");
        System.out.println("Введите id паспорта: ");
        client.setPassport_id(scanner.nextInt());
        scanner.nextInt();
        clientRepository.questClient(client);
    }

    public static void displayClient(ClientRepository clientRepository) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Показать id паспорта! ");
        System.out.println("Введите id паспорта: ");
        client.setPassport_id(scanner.nextInt());
        clientRepository.displayClient(client);
    }
}
