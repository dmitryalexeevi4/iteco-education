package part1.lesson04.task01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Программа с методом, заменяющим все вхождения слова "бяка"
class Solution {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        wordReplace(s);
    }

    private static void wordReplace(String word) {
        String badWord = "бяка";
        Pattern pattern = Pattern.compile(badWord);
        Matcher matcher = pattern.matcher(word);

        if (!matcher.find()) {
            System.out.println(word);
        } else {
            System.out.println(word.replace(badWord, "\"вырезано цензурой\""));
        }
    }
}
