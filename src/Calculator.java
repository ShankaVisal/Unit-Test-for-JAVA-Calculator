import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void subtract(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }


}
