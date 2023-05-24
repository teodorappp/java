package isp.lab4.exercise1;

public class Address {
    private String street;
    private String city;
    private Customer customer;

    public Address(String street, String city, Customer customer) {
        this.street = street;
        this.city = city;
        this.customer = customer;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

