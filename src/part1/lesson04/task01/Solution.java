package part1.lesson04.task01;

import java.util.Scanner;

//Программа с методом, заменяющим все вхождения слова "бяка"
class Solution {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);

        wordReplace(scanner.nextLine());
    }

    private static void wordReplace(String word) {
        String badWord = "бяк[а-яА-я]", censored = "\"вырезано цензурой\"";
        System.out.println(word.replaceAll(badWord, censored));

    }
}
