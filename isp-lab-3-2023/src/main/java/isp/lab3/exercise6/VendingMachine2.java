package isp.lab3.exercise6;

import java.util.Collections;

public class VendingMachine2 {

    private static VendingMachine2 instance;
    private int balance;
    private Map<String, Integer> inventory;

    private VendingMachine2() {
        balance = 0;
        inventory = new HashMap();
    }

    public static synchronized VendingMachine2 getInstance() {
        if (instance == null) {
            instance = new VendingMachine2();
        }
        return instance;
    }

    public void addProduct(String name, int quantity) {
    }

    public void insertCoin(int value) {
        balance += value;
    }

    public java.util.Map<String, Integer> purchaseProduct(String name) throws InsufficientBalanceException, OutOfStockException {
        if (!inventory.containsKey(name) || inventory.get(name) == 0) {
            throw new OutOfStockException("Product not available: " + name);
        }
        int price = getProductPrice(name);
        if (balance < price) {
            throw new InsufficientBalanceException("Insufficient balance to purchase product: " + name);
        }
        balance -= price;
        return (Map<String, Integer>) Collections.singletonMap(name, price);
    }

    private int getProductPrice(String name) {
        return 1;
    }
}
