package part1.lesson04.task03;
//Счетчик количества, создаваемых объектов
public class Main {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Female", "Elena", 29),
                new Human("Male", "Anton", 26),
                new Human("Female", "Ekaterina", 22)
        };

        System.out.println("Количество созданных объектов (людей) составляет: " + Human.getHumanCount());
    }
}
