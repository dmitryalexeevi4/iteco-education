package part1.lesson01.task01;
//Поиск минимального из двух чисел
public class Solution {
    public static void main(String[] args){
        min(5,10);
        min(6,1);
    }

    public static void min(int a, int b) {
        if (a < b) {
            System.out.println("Минимальное число: " + a);
        } else if (b < a) {
            System.out.println("Минимальное число: " + b);
        }
    }
}
