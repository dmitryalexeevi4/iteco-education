package part1.lesson06.task01;

import java.util.Comparator;

abstract class PersonSuperComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    abstract void сomparision(Person o1, Person o2);
}
