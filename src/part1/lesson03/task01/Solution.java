package part1.lesson03.task01;

//Оптимизация пузырьковой сортировки
public class Solution {
    public static void main(String[] args) {
        int[] array = {4, 1, 3, 6, 10};

        for (int element = 0; element < array.length; element++) {
            boolean isSorted = false;
            for (int nextElement = element; nextElement < array.length; nextElement++) {
                if (array[element] > array[nextElement]) {
                    int min = array[element];
                    array[element] = array[nextElement];
                    array[nextElement] = min;
                    isSorted = true;
                }
            }
            if (!isSorted) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                return;
            }
        }
    }
}
