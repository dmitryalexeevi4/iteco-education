package part1.lesson05.task01;

import java.util.Scanner;

class VendingMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static int itemNumber, availableDeposit;

    final static void start() {
        showMenu();
        purchaseOperation();
    }

    private static void showMenu() {
        System.out.println("------------------");
        System.out.println("     \"Меню\"     ");
        for (Drinks d : Drinks.values()) {
            System.out.println(d.ordinal() + ". " + d.getName() + " - " + d.getPrice() + "р.");
        }
        System.out.println("------------------");
    }

    private static void purchaseOperation() {
        System.out.println("Внесите сумму: ");
        availableDeposit = scanner.nextInt();
        if (availableDeposit > 0) {
            System.out.println("Вы внесли: " + availableDeposit);
            System.out.println("Выберите номер напитка: ");
            itemNumber = scanner.nextInt();
            operationStatusMessage(itemNumber, availableDeposit);
        } else if (availableDeposit == 0) {
            System.out.println("Вы не пополнили счет, попробуйте еще раз");
        }
    }

    private static void operationStatusMessage(int number, int money) {
        for (Drinks d : Drinks.values()) {
            if (number == d.ordinal() & money >= d.getPrice()) {
                System.out.println("Спасибо за покупку, ваша сдача: " + (money - d.getPrice()));
            } else if (number == d.ordinal() & money < d.getPrice()) {
                System.out.println("Недостаточно средств, пополните счет на: " + (d.getPrice() - money));
            }
        }
        if (number >= Drinks.values().length) {
            System.out.println("Выберите номер из предложенного списка!");
        }
    }
}
