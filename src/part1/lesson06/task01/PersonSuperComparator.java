package part1.lesson06.task01;

import java.util.Comparator;

abstract class PersonSuperComparator implements Comparator {

    static Comparator<Person> nameComparator = new Comparator<Person>() {
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

    static Comparator<Person> ageComparator = new Comparator<Person>() {
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
}
