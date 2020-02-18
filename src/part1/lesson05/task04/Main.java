package part1.lesson05.task04;

//Абстрактный класс "Человек", реализующий интерфейсы «бежать» и «плавать»
class Main {
    public static void main(String[] args) {
        Human male1 = new Male("Дмитрий");
        male1.swim();
        male1.run();

        Human female1 = new Female("Екатерина");
        female1.swim();
        female1.run();
    }
}