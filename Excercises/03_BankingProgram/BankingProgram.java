import java.util.Scanner;

public class BankingProgram {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        String borderString = "******************************";

        float balance = 0;
        boolean exit = false;
        while (true) {
            System.out.println("");
            System.out.println(borderString);
            System.out.println("BANKING PROGRAM");
            System.out.println(borderString);
            System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println(borderString);
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(borderString);
                    System.out.println("$" + balance);
                    break;
                case 2:
                    System.out.println(borderString);
                    System.out.print("Enter amount to deposit: ");
                    float depositAmount = scanner.nextFloat();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Transaction succesfull!");
                        System.out.println("New Balance: $" + balance);
                    } else {
                        System.out.println("Invalid Amount, Try again later.");
                    }
                    break;
                case 3:
                    System.out.println(borderString);
                    System.out.print("Enter amount to withdraw ");
                    float withdrawAmount = scanner.nextFloat();
                    if (withdrawAmount > 0) {
                        if (balance < withdrawAmount) {
                            System.out.println("Insufficient Balance!");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Transaction succesfull!");
                            System.out.println("New Balance: $" + balance);
                        }
                    } else {
                        System.out.println("Invalid Amount, Try again later.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println(borderString);
                    System.out.print("Thanks for using this program:)");
                    break;
                default:
                    System.out.println(borderString);
                    System.out.print("Enter a valid option");
                    break;
            }
            if (exit) break;
        }
        scanner.close();
    }
}
