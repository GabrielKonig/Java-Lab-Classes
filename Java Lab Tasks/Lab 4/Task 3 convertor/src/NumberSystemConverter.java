import java.util.Scanner;

public class NumberSystemConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            displayMenu();
            System.out.print("Enter your choice (A, B, C, D, E, F, W): ");
            option = scanner.nextLine().toUpperCase();

            switch (option) {
                case "A":
                    convertToDecimal();
                    break;
                case "B":
                    convertFromDecimal();
                    break;
                case "C":
                    sumNumbers();
                    break;
                case "D":
                    subtractNumbers();
                    break;
                case "E":
                    multiplyNumbers();
                    break;
                case "F":
                    divideNumbers();
                    break;
                case "W":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from the menu.");
                    break;
            }
        } while (!option.equals("W"));

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("A - Convert from any system to the decimal system");
        System.out.println("B - Convert from the decimal system to another system");
        System.out.println("C - Summing Up Numbers from different systems");
        System.out.println("D - Subtracting Numbers from different systems");
        System.out.println("E - Multiplying numbers from different systems");
        System.out.println("F - Dividing numbers from different systems");
        System.out.println("W - Exit the Program");
    }

    public static void convertToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();
        // Implement conversion logic to decimal
        System.out.println("Converted to decimal: " + number);
    }

    public static void convertFromDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimalNumber = scanner.nextInt();
        // Implement conversion logic from decimal
        System.out.println("Converted from decimal: " + decimalNumber);
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();
        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();
        // Implement addition logic
        System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = ");
    }

    public static void subtractNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();
        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();
        // Implement subtraction logic
        System.out.println("Difference: " + firstNumber + " - " + secondNumber + " = ");
    }

    public static void multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();
        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();
        // Implement multiplication logic
        System.out.println("Product: " + firstNumber + " * " + secondNumber + " = ");
    }

    public static void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();
        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();
        // Implement division logic
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = ");
    }
}
