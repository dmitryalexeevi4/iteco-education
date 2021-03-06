package part1.lesson02.task01;

import java.util.Scanner;

public class VendingMachine {
    private static Scanner scanner = new Scanner(System.in);
    private static Drink[] drinks = {
            new Drink(1, "Fanta", 45),
            new Drink(2, "Coca-Cola", 45),
            new Drink(3, "Sprite", 45),
            new Drink(4, "Evervess", 50),
            new Drink(5, "Borjomi", 60),
    };

    public static void start() {
        showMenu();
        purchaseOperation();
    }

    private static void showMenu() {
        System.out.println("------------------");
        System.out.println("     \"Меню\"     ");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].getDrinkNumber() + ". " + drinks[i].getDrinkName() + " - " + drinks[i].getDrinkPrice() + "р.");
        }
        System.out.println("------------------");
    }

    private static void purchaseOperation() {
        System.out.println("Внесите сумму: ");
        int insertedMoney = scanner.nextInt();
        int itemNumber = 0;
        if (insertedMoney > 0) {
            System.out.println("Вы внесли: " + insertedMoney);
            System.out.println("Выберите номер напитка: ");
            itemNumber = scanner.nextInt();
        } else if (insertedMoney == 0) {
            System.out.println("Вы не пополнили счет, попробуйте еще раз");
        }
        operationStatusMessage(itemNumber, insertedMoney);
    }

    private static void operationStatusMessage(int number, int money) {
        for (int i = 0; i < drinks.length; i++) {
            if (number == drinks[i].getDrinkNumber() & money >= drinks[i].getDrinkPrice()) {
                System.out.println("Спасибо за покупку, ваша сдача: " + (money - drinks[i].getDrinkPrice()));
            } else if (number == drinks[i].getDrinkNumber() & money < drinks[i].getDrinkPrice()) {
                System.out.println("Недостаточно средств, пополните счет на: " + (drinks[i].getDrinkPrice() - money));
            }
        }
        if (number > drinks.length) {
            System.out.println("Выберите номер из предложенного списка!");
        }
    }
}
