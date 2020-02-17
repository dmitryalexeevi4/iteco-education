package part1.lesson04.task02;

class Calculator {

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        return (double) a / b;
    }

    static double percent(int a, int percentFromA) {
        return (a * percentFromA) * 0.01;
    }
}
