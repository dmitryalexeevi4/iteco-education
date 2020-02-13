package part1.lesson02.task01;
import java.util.Scanner;

public class Solution {

   public static String[] drink = {"Fanta", "Sprite", "Coca-Cola"};
   public static int[] drinkNumber = {1, 2, 3}, drinkPrice = {40, 50, 60};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        menu();
        System.out.println("Внесите сумму: ");
        int insertedMoney = scanner.nextInt();
        if (insertedMoney > 0) {
            System.out.println("Вы внесли: " + insertedMoney);
        }
        System.out.println("Выберите номер напитка: ");

        int itemNumber = scanner.nextInt();

        result(itemNumber,insertedMoney);
    }

    public static void menu() {
        System.out.println("----------------");
        System.out.println("    \"Меню\"    ");
        System.out.println(drinkNumber[0] + ". " + drink[0] + " - " + drinkPrice[0]);
        System.out.println(drinkNumber[1] + ". " + drink[1] + " - " + drinkPrice[1]);
        System.out.println(drinkNumber[2] + ". " + drink[2] + " - " + drinkPrice[2]);
        System.out.println("----------------");
    }

    public static void result(int number, int price) {
        if (number == drinkNumber[0] & price >= drinkPrice[0]) {
            System.out.println("Спасибо за покупку, ваша сдача: " + (price - drinkPrice[0]));
        } else if (number == drinkNumber[0] & price < drinkPrice[0]) {
            System.out.println("Недостаточно средств, пополните счет на: " + (drinkPrice[0] - price));
        }

        if (number == drinkNumber[1] & price >= drinkPrice[1]) {
            System.out.println("Спасибо за покупку, ваша сдача: " + (price - drinkPrice[1]));
        } else if (number == drinkNumber[1] & price < drinkPrice[1]) {
            System.out.println("Недостаточно средств, пополните счет на: " + (drinkPrice[1] - price));
        }

        if (number == drinkNumber[2] & price >= drinkPrice[2]) {
            System.out.println("Спасибо за покупку, ваша сдача: " + (price - drinkPrice[2]));
        } else if (number == drinkNumber[2] & price < drinkPrice[2]) {
            System.out.println("Недостаточно средств, пополните счет на: " + (drinkPrice[2] - price));
        }

        if (number > drinkNumber.length) {
            System.out.println("Выберите номер из предложенного списка!");
        }
    }
}
