package isp.lab6.exercise3;

import java.util.Scanner;

// UserInterface class
class UserInterface {
    private LoginSystem loginSystem;
    private OnlineStore store;

    public UserInterface(LoginSystem loginSystem, OnlineStore store) {
        this.loginSystem = loginSystem;
        this.store = store;
    }

    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("----- Online Shop Menu -----");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        loginSystem.register(username, password);
        System.out.println("User registered successfully!");
    }

    private void loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean loggedIn = loginSystem.login(username, password);
        if (loggedIn) {
            System.out.println("User logged in successfully!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }
}

