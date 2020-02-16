package part1.lesson03.task02;

import java.util.Random;
import java.util.Scanner;

//Двумерный массив N-чисел
public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println();

        System.out.println("Массив: ");

        Random random = new Random();
        for (int column = 0; column < array.length; column++) {
            for (int row = 0; row < array[column].length; row++) {
                array[column][row] = random.nextInt(3);
            }
        }

        for (int column = 0; column < array.length; column++) {
            for (int row = 0; row < array[column].length; row++) {
                System.out.print(array[column][row]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Сумма диагоналей массива: ");

        int sum = 0;
        for (int column = 0; column < array.length; column++) {
            sum = sum + array[column][column] + array[column][array.length - column - 1];
        }
        System.out.println(sum);
    }
}
