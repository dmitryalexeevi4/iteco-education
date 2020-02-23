package part1.lesson06.task01;

import java.util.Comparator;

class PersonComparator extends PersonSuperComparator {
    private static final Comparator<Person> nameComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    private static final Comparator<Person> ageComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
          return Integer.compare(o1.getAge(), o2.getAge());
        }
    };

    @Override
    void start(Person o1, Person o2) {
        int nameComparision = nameComparator.compare(o1, o2);
        int ageComparision = ageComparator.compare(o1, o2);
        if (nameComparision == 0 & ageComparision == 0) {
            System.out.println("Имена и возраст совпадают");
        } else if (nameComparision < 0 & ageComparision == 0) {
            System.out.println("Имена не совпадают, возраст совпадает");
        } else if (nameComparision == 0 & ageComparision < 0) {
            System.out.println("Имена совпадают, возраст не совпадает");
        } else {
            System.out.println("Имена и возраст не совпадают");
        }
    }
}
