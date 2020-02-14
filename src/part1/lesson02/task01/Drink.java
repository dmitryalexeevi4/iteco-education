package part1.lesson02.task01;

public class Drink {
    private int drinkNumber;
    private String drinkName;
    private int drinkPrice;

    public Drink(int number, String name, int price) {
        this.drinkNumber = number;
        this.drinkName = name;
        this.drinkPrice = price;
    }

    public int getDrinkNumber() {
        return drinkNumber;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }
}
