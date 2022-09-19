package Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("What is your favourite number? Please type the number from the choices available!");
            System.out.println("1. Number 1!");
            System.out.println("2. Number 2!");
            System.out.println("3. Number 3!");
            System.out.println("4. Exit program!");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have chosen number 1.");
                    break;
                case 2:
                    System.out.println("You have chosen number 2.");
                    break;
                case 3:
                    System.out.println("You have chosen number 3.");
                    break;
                case 4:
                    System.out.println("Closing program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have chosen a number that isnt available or does not exist, please choose from the existing ones!\n");
                    break;
            }

        } while (choice != 4);
    }
}
