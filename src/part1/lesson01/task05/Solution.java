package part1.lesson01.task05;
import java.util.Scanner;
//Определение на високосный год
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Високосный год");
        } else if ((year % 400) % 150 == 0) {
            System.out.println("Обычный год");
        } else if (((year % 400) % 150) % 4 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Обычный год");
        }
    }
}
