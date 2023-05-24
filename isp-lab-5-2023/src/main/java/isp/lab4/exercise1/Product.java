package isp.lab4.exercise1;

public class Product {
    private String productId;
    private String name;
    private double customerPrice;
    private ProductCategory productCategory;
    private Order order;

    public Product(String productId, String name, double customerPrice, ProductCategory productCategory) {
        this.productId = productId;
        this.name = name;
        this.customerPrice = customerPrice;
        this.productCategory = productCategory;
        this.order = null;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCustomerPrice() {
        return customerPrice;
    }

    public void setCustomerPrice(double customerPrice) {
        this.customerPrice = customerPrice;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
