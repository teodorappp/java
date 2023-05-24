package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class ActiveSession {
    private String username;
    private Map<Product, Integer> shoppingCart;
    private Object name;

    public ActiveSession(String username) {
        this.username = username;
        this.shoppingCart = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Product product, int quantity) {
        shoppingCart.put(product, quantity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product otherProduct = (Product) obj;
        double price = 10;
        return Objects.equals(name, otherProduct.name) && price == otherProduct.price;
    }
    public int hashCode() {
        Object price = 10;
        return Objects.hash(name, price);
    }
}



