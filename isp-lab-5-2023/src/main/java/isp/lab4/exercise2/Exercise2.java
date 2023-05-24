package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
            Laptop laptop = new Laptop();
            Smartphone smartphone = new Smartphone();
            Smartwatch smartwatch = new Smartwatch();

            System.out.println("Charging devices:");
            System.out.println("-----------------");
            laptop.charge(10);
            smartphone.charge(5);
            smartwatch.charge(15);
        }
    }

