package part1.lesson06.task01;

//Класс PersonSuperComparator, который имплементит Comparator, но умеет сравнивать по двум параметрам: возраст и имя.
class Main {
    public static void main(String[] args) {
        Person person = new Person("Dmitry", 23);
        Person person1 = new Person("Maria", 23);

        new PersonComparator().start(person, person1);
    }
}
