import java.util.Scanner;

public class Calculator {
    public void main() {
        float num1, num2;
        String operation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1 = scanner.nextFloat();

        System.out.print("Enter 2nd number: ");
        num2 = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Enter Operation to perform (+, -, *, /, p, r): ");
        operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Cannot be divided by zero");
                else
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                break;
            case "p":
                System.out.printf("%f ^ %f = %f", num1, num2, Math.pow(num1, num2));
                break;
            case "r":
                System.out.printf("%f root %f = %f", num1, num2, Math.pow(num1, 1 / num2));
                break;

        }

    }
}