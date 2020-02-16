package part1.lesson01.task04;

import java.util.Scanner;

//Арифметическая и геометрическая прогрессия
public class Solution {

    public static int n = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int i = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int j = scanner.nextInt();
        arithmProg(i, j);
        geomProg(i, j);
    }

    public static void arithmProg(int firstDigit, int secondDigit) {
        int scannedDigit = firstDigit;
        System.out.print("Арифметическая прогрессия: " + scannedDigit + " ");
        for (firstDigit = scannedDigit; firstDigit < n; firstDigit++) {
            System.out.print((firstDigit + secondDigit) + " ");
            secondDigit++;
        }
        System.out.println();
    }

    public static void geomProg(int firstDigit, int secondDigit) {
        int thirdDigit = secondDigit;
        System.out.print("Геометрическая прогрессия: " + firstDigit + " " + secondDigit + " ");
        for (int i = thirdDigit; i < n; i++) {
            System.out.print(((firstDigit * secondDigit) * thirdDigit) + " ");
            thirdDigit *= secondDigit;
        }
        System.out.println();
    }
}