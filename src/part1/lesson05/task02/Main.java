package part1.lesson05.task02;

//Абстрактный класс Animal с абстрактным методом getName
class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.getName();

        Animal dog = new Dog();
        dog.getName();

        Animal fish = new Fish();
        fish.getName();

        Animal duck = new Duck();
        duck.getName();
    }
}