package homework;

import java.util.*;

public class HomeworkMain {
    private static final Map<String, List<String>> contacts = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Телефонный справочник ===");

        while (true) {
            printMenu();
            String command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "ADD":
                    addContact();
                    break;
                case "PRINT_ALL":
                    printAllContacts();
                    break;
                case "GET":
                    getContact();
                    break;
                case "EXIT":
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("Доступные команды:");
        System.out.println("ADD - добавить контакт");
        System.out.println("PRINT_ALL - показать все контакты");
        System.out.println("GET - найти контакт по имени");
        System.out.println("EXIT - выход");
        System.out.print("Введите команду: ");
    }

    private static void addContact() {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine().trim();

        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine().trim();

        if (phone.isEmpty()) {
            System.out.println("Номер телефона не может быть пустым.");
            return;
        }

        // Получаем список номеров для данного имени
        List<String> phoneNumbers = contacts.get(name);

        if (phoneNumbers == null) {
            // Новый контакт
            phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phone);
            contacts.put(name, phoneNumbers);
            System.out.println("Контакт '" + name + "' добавлен с номером " + phone);
        } else {
            // Существующий контакт
            if (phoneNumbers.contains(phone)) {
                System.out.println("Этот номер уже существует для контакта '" + name + "'");
            } else {
                phoneNumbers.add(phone);
                System.out.println("Номер " + phone + " добавлен к контакту '" + name + "'");
            }
        }
    }

    private static void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Телефонный справочник пуст.");
            return;
        }

        System.out.println("=== Все контакты ===");

        // Сортируем имена для красивого вывода
        List<String> sortedNames = new ArrayList<>(contacts.keySet());
        Collections.sort(sortedNames);

        for (String name : sortedNames) {
            List<String> phones = contacts.get(name);
            for (String phone : phones) {
                System.out.println(name + ": " + phone);
            }
        }
    }

    private static void getContact() {
        System.out.print("Введите имя для поиска: ");
        String name = scanner.nextLine().trim();

        List<String> phones = contacts.get(name);

        if (phones == null || phones.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            System.out.println("Номера для контакта '" + name + "':");
            for (String phone : phones) {
                System.out.println(phone);
            }
        }
    }
}
