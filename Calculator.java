import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Can not divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Welcome to the Java Console Calculator!");

        while (flag) {

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator. Try again.");
                    continue;
            }


            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = input.next();

            if (!choice.equalsIgnoreCase("yes")) {
                flag = false;
                System.out.println("Thanks for using the my calculator!");
            }
        }

    }
}
