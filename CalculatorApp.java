import java.util.Scanner;

class Calculator {

    //  Add method
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide method
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN; // Return "Not a Number"
        }
        return (double) a / b;
    }
}

// User Interface class to interact with the user
public class CalculatorApp {

    private Scanner sc;
    private Calculator calc;

    // Constructor
    public CalculatorApp() {
        sc = new Scanner(System.in);
        calc = new Calculator();
    }

    // Method to perform addition
    public void performAddition() {
        System.out.print("Enter number of values to add (2 or 3): ");
        int count = sc.nextInt();

        if (count == 2) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            double result = calc.add(a, b);
            System.out.println("Result: " + result);
        } else if (count == 3) {
            System.out.print("Enter three integers:\n");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = calc.add(a, b, c);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input! Please enter 2 or 3 numbers only.");
        }
    }

    // Method to perform subtraction
    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int result = calc.subtract(a, b);
        System.out.println("Result: " + result);
    }

    // Method to perform multiplication
    public void performMultiplication() {
        System.out.print("Enter first double value: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double value: ");
        double b = sc.nextDouble();
        double result = calc.multiply(a, b);
        System.out.println("Result: " + result);
    }

    // Method to perform division
    public void performDivision() {
        System.out.print("Enter dividend (integer): ");
        int a = sc.nextInt();
        System.out.print("Enter divisor (integer): ");
        int b = sc.nextInt();
        double result = calc.divide(a, b);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }

    // Main menu
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n=== Welcome to the Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using the Calculator Application!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }

    // Main method
    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.mainMenu();
    }
}
