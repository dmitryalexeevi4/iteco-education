package part1.lesson06.task02;

//Реализация класса корзины интернет магазина
class Main {
    private static UserBasket userBasket = new UserBasket();

    public static void main(String[] args) {
        userBasket.addProduct("Хлеб", 10);
        userBasket.addProduct("Сыр", 12);
        userBasket.addProduct("Помидор", 20);

        System.out.println("Добавление продукта в корзину: ");
        userBasket.addProduct("Колбаса", 7);
        operationStatus();

        System.out.println("Удаление продукта из корзины: ");
        userBasket.removeProduct("Хлеб");
        operationStatus();

        System.out.println("Обновление количества продуктов: ");
        userBasket.updateProductQuantity("Колбаса", 9);
        userBasket.updateProductQuantity("Помидор", 11);
        operationStatus();

        //Получение содержимого листа
        System.out.println(userBasket.getProducts());

        //Получение количества продукта
        System.out.println(userBasket.getProductQuantity("Сыр"));

        //Очистка корзины
        userBasket.clear();
    }

    private static void operationStatus() {
        for (String productName : userBasket.getProducts()) {
            System.out.println(productName + " - " + userBasket.getProductQuantity(productName));
        }
        System.out.println("------------------------");
    }
}
