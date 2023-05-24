package isp.lab3.exercise5;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.displayProducts();

        vm.insertCoin(25);
        vm.insertCoin(100);

        String product1 = vm.selectProduct(2);
        System.out.println("Selected product: " + product1);

        vm.insertCoin(10);

        String product2 = vm.selectProduct(4);
        System.out.println("Selected product: " + product2);

        vm.displayCredit();

        vm.userMenu();
    }
}
