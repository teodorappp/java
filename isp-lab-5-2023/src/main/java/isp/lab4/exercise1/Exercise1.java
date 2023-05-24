package isp.lab4.exercise1;

public class Exercise1 {
    public static void main(String[] args) {

            Address address = new Address("123 Main Street", "City", null);
            Customer customer = new Customer("C001", "John Doe", "1234567890", address);
            address.setCustomer(customer);
            Product product = new Product("P001", "iPhone 12", 999.99, ProductCategory.ELECTRONICS);
            customer.addProduct(product);


    }
}
