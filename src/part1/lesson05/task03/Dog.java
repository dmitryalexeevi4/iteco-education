package part1.lesson05.task03;

class Dog extends Animal implements Runnable, Swimmable {
    Dog() {
    }

    void getName() {
        System.out.println("Собака");
    }

    public void run() {
        System.out.println("Coбака бежит");
    }

    public void swim() {
        System.out.println("Собака плывет");
    }
}