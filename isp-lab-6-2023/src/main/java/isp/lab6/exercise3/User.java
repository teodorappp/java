package isp.lab6.exercise3;

import java.util.Objects;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean equals(User user) {
        // Implement the equals method logic here
    }

    public int hashCode() {
        Object name;
        Object price;
        return Objects.hash(name, price);
    }

    public User getUsername() {
    }

    public User getPassword() {
    }
}