package part1.lesson05.task03;

class Fish extends Animal implements Swimmable {
    void getName() {
        System.out.println("Рыба");
    }

    public void swim() {
        System.out.println("Рыба плывет");
    }
}