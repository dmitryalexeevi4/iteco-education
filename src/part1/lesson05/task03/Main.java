package part1.lesson05.task03;

//Интерфейсы Fly, Run и Swim
class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();

        Dog dog = new Dog();
        dog.run();
        dog.swim();

        Fish fish = new Fish();
        fish.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.run();
        duck.swim();
    }
}