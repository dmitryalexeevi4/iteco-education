package part1.lesson04.task03;

public class Human {
    private String sex;
    private String name;
    private int age;
    private static int humanCount;

    public Human(String sex, String name, int age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
        humanCount++;
    }

    static int getHumanCount() {
        return humanCount;
    }
}
