package isp.lab3.exercise5;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private int credit;
    private Map<Integer, String> products;

    public VendingMachine() {
        credit = 0;
        products = new HashMap<>();
        products.put(1, "Coca-Cola");
        products.put(2, "Pepsi");
        products.put(3, "Fanta");
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void insertCoin(int value) {
        credit += value;
    }

    public String selectProduct(int id) {
        if (!products.containsKey(id)) {
            return "Invalid selection";
        }
        String product = products.get(id);
        if (credit < 100) {
            return "Not enough credit";
        }
        credit -= 100;
        return product;
    }

    public void displayCredit() {
        System.out.println("Credit: " + credit + " cents");
    }

    public void userMenu() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Menu:");
            System.out.println("1. Display products");
            System.out.println("2. Insert coin (5, 10, 25, 100 cents)");
            System.out.println("3. Select product (enter selection id)");
            System.out.println("4. Display credit");
            System.out.println("5. Quit");

            int choice = Helper.getInputInt("Enter choice: ");

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    int coin = Helper.getInputInt("Enter coin value (5, 10, 25, 100): ");
                    if (coin == 5 || coin == 10 || coin == 25 || coin == 100) {
                        insertCoin(coin);
                    } else {
                        System.out.println("Invalid coin");
                    }
                    break;
                case 3:
                    int id = Helper.getInputInt("Enter selection id: ");
                    String product = selectProduct(id);
                    System.out.println(product);
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

