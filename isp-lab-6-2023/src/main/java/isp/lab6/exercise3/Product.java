package isp.lab6.exercise3;

import java.util.Objects;

class Product {
    public Object name;
    private String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product otherProduct = (Product) obj;
        return Objects.equals(name, otherProduct.name) && price == otherProduct.price;
    }
    public int hashCode() {
        return Objects.hash(name, price);
    }


}
