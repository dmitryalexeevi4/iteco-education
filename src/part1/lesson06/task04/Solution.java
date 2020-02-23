package part1.lesson06.task04;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

//Метод, возвращающий множество, в котором удалены все элементы четной длины из исходного множества
class Solution {
    public static void main(String[] args) {
        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("foo");
        mySet.add("buzz");
        mySet.add("bar");
        mySet.add("fork");
        mySet.add("bort");
        mySet.add("spoon");
        mySet.add("!");
        mySet.add("dude");

        removeEvenLength(mySet);

        for (String entry : mySet) {
            System.out.print(entry + " ");
        }
    }

    private static void removeEvenLength(Set<String> set) {
        LinkedList<String> holder = new LinkedList<String>();

        for (String string : set) {
            if (!(string.length() % 2 == 0))
                holder.add(string);
        }

        set.clear();
        set.addAll(holder);
    }
}
