package part1.lesson06.task01;

import java.util.Comparator;

class PersonComparator extends PersonSuperComparator {
    private static final Comparator<Person> nameComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int compare = o1.getName().compareTo(o2.getName());
            if (compare < 0 || compare > 0) {
                return -1;
            } else if (compare == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    };

    private static final Comparator<Person> ageComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int age1 = o1.getAge(), age2 = o2.getAge();
            if (age1 < age2 || age1 > age2) {
                return -1;
            } else if (age1 == age2) {
                return 0;
            } else {
                return 1;
            }
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
