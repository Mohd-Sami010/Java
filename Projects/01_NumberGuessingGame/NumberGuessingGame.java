import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int selectedNum = random.nextInt(100) + 1;
            int numOfTries = 0;
            int userInput;
            System.out.println("A Number has been Selected from 1 - 100\n");
            do {
                System.out.print("Enter your guess: ");
                userInput = scanner.nextInt();
                scanner.nextLine();

                if (userInput > selectedNum)
                    System.out.println("You entered a Bigger number");
                else if (userInput < selectedNum)
                    System.out.println("You entered a Smaller number");

                numOfTries++;
            } while (userInput != selectedNum);
            System.out.printf("You Guessed the number in %d tries\n", numOfTries);

            System.out.println("Hit enter for another game, or N for exit");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                System.out.println("Thanks For Playing :)");
                break;
            }
        }
        scanner.close();
    }
}