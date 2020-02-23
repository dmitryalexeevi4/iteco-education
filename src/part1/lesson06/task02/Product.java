package part1.lesson06.task02;

class Product {
    private String product;
    private int quantity;

    Product(String name, int quantity) {
        this.product = name;
        this.quantity = quantity;
    }

    String getProduct() {
        return product;
    }

    void setProduct(String name) {
        this.product = name;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
