package part1.lesson06.task01;

//Класс PersonSuperComparator, который имплементит Comparator, но умеет сравнивать по двум параметрам: возраст и имя.
class Main {
    public static void main(String[] args) {
        Person person = new Person("Dmitry", 24);
        Person person1 = new Person("Maria", 24);

        System.out.println(PersonSuperComparator.nameComparator.compare(person, person1));
        System.out.println(PersonSuperComparator.ageComparator.compare(person, person1));
    }
}
