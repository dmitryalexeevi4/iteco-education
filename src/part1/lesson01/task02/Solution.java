package part1.lesson01.task02;
import java.util.Scanner;
//Описание введенного числа
public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Введите число: ");
        i = scanner.nextInt();

        if (i % 2 == 0){
            if (i > 0) {
                System.out.println("Число четное, положительное");
            } else if (i < 0) {
                System.out.println("Число четное, отрицательное");
            }
        } else if (i % 2 != 0) {
            if (i > 0) {
                System.out.println("Число нечетное, положительное");
            } else if (i < 0) {
                System.out.println("Число нечетное, отрицательное");
            }
        }

        if (i == 0) {
            System.out.println("Число нулевое");
        }
    }
}
