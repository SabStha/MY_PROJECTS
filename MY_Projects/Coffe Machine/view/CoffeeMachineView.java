import java.util.Scanner;

public class CoffeeMachineView {
    private Scanner scanner;

    public CoffeeMachineView() {
        scanner = new Scanner(System.in);
    }

    public void displayMainMenu() {
        System.out.println("Welcome to the Coffee Machine!");
        System.out.println("1. Make Espresso");
        System.out.println("2. Make Latte");
        System.out.println("3. Make Cappuccino");
        System.out.println("4. Refill Water");
        System.out.println("5. Refill Coffee Beans");
        System.out.println("6. Refill Milk");
        System.out.println("0. Exit");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public String getCoffeeType() {
        System.out.print("Enter the type of coffee (Espresso, Latte, Cappuccino): ");
        return scanner.next();
    }

    public void displayResources(int waterLevel, int coffeeBeans, int milk) {
        System.out.println("\nCurrent Resources:");
        System.out.println("Water: " + waterLevel + " ml");
        System.out.println("Coffee Beans: " + coffeeBeans + " grams");
        System.out.println("Milk: " + milk + " ml");
        System.out.println();
    }
}
