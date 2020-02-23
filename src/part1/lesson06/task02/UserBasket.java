package part1.lesson06.task02;

import java.util.*;

class UserBasket implements Basket {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        products.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        for (int index = 0; index < products.size(); index++) {
            if (products.get(index).getProduct().equals(product)) {
                products.remove(index);
                return;
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (int index = 0; index < products.size(); index++) {
            if (products.get(index).getProduct().equals(product)) {
                products.get(index).setProduct(product);
                products.get(index).setQuantity(quantity);
                return;
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }


    @Override
    public List<String> getProducts() {
        List<String> stringList = new ArrayList<>();
        for (Product product : products) {
            stringList.add(product.getProduct());
        }
        return stringList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product product1 : products) {
            if (product1.getProduct().equals(product)) {
                return product1.getQuantity();
            }
        }
        return 0;
    }
}

