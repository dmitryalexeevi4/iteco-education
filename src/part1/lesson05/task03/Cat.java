package part1.lesson05.task03;

class Cat extends Animal implements Runnable {
    void getName() {
        System.out.println("Кот");
    }

    public void run() {
        System.out.println("Кот бежит");
    }
}