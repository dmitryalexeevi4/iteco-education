package part1.lesson05.task04;

abstract class Human implements Runnable, Swimmable {
    String name;

    String getName() {
        return this.name;
    }

    public void run() {
        System.out.println(this.getName() + " бежит");
    }

    public void swim() {
        System.out.println(this.getName() + " плывет");
    }
}