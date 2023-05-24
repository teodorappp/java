package isp.lab10.exercise1;

import java.util.Scanner;

public class Exercise1 {

    public static void displayMenu(ATC atc) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("Welcome to Airtraffic Control System command center");
        System.out.println("1. Add aircraft");
        System.out.println("2. Take off command");
        System.out.println("3. Land command");
        System.out.println("4. Show aircrafts");
        System.out.println("5. Exit");

        System.out.print("Enter your command: ");
        String command = scanner.nextLine();
        String aid;
            switch (command) {
                case "1":
                    System.out.print("Enter aircraft id: ");
                    aid = scanner.nextLine();
                    atc.addAircraft(aid);

                    break;
                case "2":
                    System.out.print("Send take off command to aircraft id: ");
                    aid = scanner.nextLine();
                    atc.sendCommand(aid, new AtcCommand("take off"));
                    break;
                case "3":
                    System.out.print("Send land command to aircraft id: ");
                    aid = scanner.nextLine();
                    atc.sendCommand(aid, new AtcCommand("land"));
                    break;
                case "4":
                    atc.showAircrafts();
                    break;
                case "5":
                    System.exit(0);
                    break;

            }

        }

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        ATC atc = new ATC();
        while(true){
            displayMenu(atc);
        }

    }
}
