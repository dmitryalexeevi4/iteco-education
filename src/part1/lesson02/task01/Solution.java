package part1.lesson02.task01;
import java.util.Scanner;

public class Solution {

   public static String[] drinks = {"Fanta", "Sprite", "Coca-Cola"};
   public static int[] number = {1, 2, 3}, price = {40, 50, 60};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Внесите сумму: ");
        int insertedMoney = scanner.nextInt();
        if (insertedMoney > 0) {
            System.out.println("Вы внесли: " + insertedMoney);
        }
        System.out.println("Выберите номер напитка: ");
        menu();
        int itemNumber = scanner.nextInt();

        result(itemNumber,insertedMoney);
    }

    public static void menu() {
        System.out.println(number[0] + ". " + drinks[0] + " - " + price[0]);
        System.out.println(number[1] + ". " + drinks[1] + " - " + price[1]);
        System.out.println(number[2] + ". " + drinks[2] + " - " + price[2]);
    }

    public static void result(int itemNumber, int insertedMoney) {
        if (itemNumber == number[0] & insertedMoney >= price[0]) {
            System.out.println("Спасибо за покупку, ваша сдача: " + (insertedMoney - price[0]));
        } else if (itemNumber == number[0] & insertedMoney < price[0]) {
            System.out.println("Недостаточно средств, пополните счет на: " + (price[0] - insertedMoney));
        }

        if (itemNumber == number[1] & insertedMoney >= price[1]) {
            System.out.println("Спасибо за покупку, ваша сдача: " + (insertedMoney - price[1]));
        } else if (itemNumber == number[1] & insertedMoney < price[1]) {
            System.out.println("Недостаточно средств, пополните счет на: " + (price[1] - insertedMoney));
        }

        if (itemNumber == number[2] & insertedMoney >= price[2]) {
            System.out.println("Спасибо за покупку, ваша сдача: " + (insertedMoney - price[2]));
        } else if (itemNumber == number[2] & insertedMoney < price[2]) {
            System.out.println("Недостаточно средств, пополните счет на: " + (price[2] - insertedMoney));
        }

        if (itemNumber > number.length) {
            System.out.println("Выберите номер из предложенного списка!");
        }
    }
}
