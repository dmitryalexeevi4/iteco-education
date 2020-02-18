package part1.lesson05.task04;

abstract class Human implements Runnable, Swimmable {
    String name;

    String getName() {
        return this.name;
    }
}