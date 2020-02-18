package part1.lesson05.task01;

enum Drinks {
    FANTA("Fanta", 45),
    COLA("Coca-Cola", 45),
    SPRITE("Sprite", 45),
    EVERVESS("Evervess", 50),
    BORJOMI("Borjomi", 60);

    private final String name;
    private int price;

    Drinks(String drinkName, int drinkPrice) {
        this.name = drinkName;
        this.price = drinkPrice;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }
}
