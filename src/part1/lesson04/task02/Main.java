package part1.lesson04.task02;
//Реализовать класс Calculator
public class Main {
    public static void main(String[] args) {
        System.out.println("Сложение: " + Calculator.plus(1,4));
        System.out.println("Вычитание: " + Calculator.minus(10,1));
        System.out.println("Умножение: " + Calculator.multiply(6,6));
        System.out.println("Деление: " + Calculator.division(35,5));
        System.out.println("Процент от числа: " + Calculator.percent(20,25));
    }
}
