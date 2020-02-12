package part1.lesson01.task04;
import java.util.Scanner;
//Арифметическая и геометрическая прогрессия
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int i = scanner.nextInt();
        System.out.println("Введите второе: ");
        int j = scanner.nextInt();
        arithmProg(i, j);
        geomProg(i, j);
    }
    public static void arithmProg(int a, int d){
        System.out.println("Арифметическая прогрессия: " + (a + " " + (a + d) + " " + (a + d + d) + " " + (a + d + d + d)) + "...");
    }
    public static void geomProg(int b, int q){
        System.out.println("Геометрическая прогрессия: " + (b + " " + (b * q) + " " + (b * q * q) + " " + (b * q * q * q)) + "...");
    }

}