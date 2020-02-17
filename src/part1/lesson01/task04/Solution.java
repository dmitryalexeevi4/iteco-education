package part1.lesson01.task04;

import java.util.Scanner;

//Арифметическая и геометрическая прогрессия
public class Solution {

    private final static int n = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите шаг: ");
        int b = scanner.nextInt();
        arithmProg(a, b);
        geomProg(a, b);
    }

    private static void arithmProg(int digit, int step) {
        System.out.print("Арифметическая прогрессия: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((digit += step) + " ");
        }
        System.out.println();
    }

    private static void geomProg(int digit, int step) {
        System.out.print("Геометрическая прогрессия: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((digit *= step) + " ");
        }
        System.out.println();
    }
}