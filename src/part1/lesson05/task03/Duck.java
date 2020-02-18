package part1.lesson05.task03;

class Duck extends Animal implements Flyable, Runnable, Swimmable {
    void getName() {
        System.out.println("Утка");
    }

    public void fly() {
        System.out.println("Утка летит");
    }

    public void run() {
        System.out.println("Утка бежит");
    }

    public void swim() {
        System.out.println("Утка плывет");
    }
}