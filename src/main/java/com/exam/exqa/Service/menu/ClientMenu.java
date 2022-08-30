package com.exam.exqa.Service.menu;

import com.exam.exqa.Dao.ClientRepository;
import com.exam.exqa.Service.methodService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ClientMenu {
    @Autowired
    private static ClientRepository clientRepository;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int menuItem;
            System.out.println("Меню клиентов: ");
            System.out.println("1) Добавление клиента");
            System.out.println("2) Удаление клиента");
            System.out.println("3) Изменение клиента");
            System.out.println("4) Поиск клиента по номеру паспорта");
            System.out.println("5) Выводе списка клиентов");
            System.out.println("0) Выход");

            menuItem = scanner.nextInt();
            if (menuItem == 1) {
                ClientService.addClient(clientRepository);
            } else if (menuItem == 2) {
                ClientService.dropClient(clientRepository);
            } else if (menuItem == 3) {
                ClientService.updateClient(clientRepository);
            } else if (menuItem == 4) {
                ClientService.questClient(clientRepository);
            } else if (menuItem == 5) {
                ClientService.displayClient(clientRepository);
            } else if (menuItem == 0) {
                System.out.println("Выход из программы....");
                return;
            } else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
