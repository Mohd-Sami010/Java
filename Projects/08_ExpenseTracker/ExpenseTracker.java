import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExpenseTracker {
    Path filePath = Path.of("expenses.txt");
    Scanner scanner = new Scanner(System.in);
    ArrayList<Expense> expenses = new ArrayList<>();

    private void LoadExpensesFromFile() {
        try {
            String[] expensesData = Files.readString(filePath).split("\n");
            for (String expenseData : expensesData) {
                String[] values = expenseData.split(", ");
                String name = values[0];
                float expenseAmount = Float.parseFloat(values[1]);
                Expense.ExpenseType type = Expense.ExpenseType.valueOf(values[2]);
                LocalDate date = LocalDate.parse(values[3]);
                Expense expense = new Expense(name, expenseAmount, type, date);
                expenses.add(expense);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        }
    }

    private void SaveExpensesToFile() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Expense expense : expenses) {
                sb.append(expense.name).append(", ")
                        .append(expense.expense).append(", ")
                        .append(expense.expenseType).append(", ")
                        .append(expense.date).append("\n");
            }
            Files.writeString(filePath, sb.toString());
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        }
    }

    public void main() {
        LoadExpensesFromFile();
        System.out.println("\n\tEXPENSE TRACKER");
        while (true) {
            System.out.print("\n1. Add expense\n2. Monthly expense\n3. Expense history\nEnter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    AddExpense();
                    break;
                case 2:
                    ShowMonthlyExpense();
                    break;
                case 3:
                    ExpenseHistory();
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    continue;
            }
            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Thanks for Using :)");
                break;
            }
        }
    }

    private void AddExpense() {
        System.out.println("\nEnter expense [expense name] [expense] [Type] :");
        String expenseString = scanner.nextLine();
        String[] expenseDetails = expenseString.split(" ");
        Expense.ExpenseType type = expenseDetails.length > 2 ? Expense.ExpenseType.valueOf(expenseDetails[2])
                : Expense.ExpenseType.None;

        Expense expense = new Expense(expenseDetails[0], Float.parseFloat(expenseDetails[1]), type, LocalDate.now());

        expenses.add(expense);
        SaveExpensesToFile();
        System.out.print("Expense Added: ");
        expense.PrintDetails();
    }

    private void ShowMonthlyExpense() {
        System.out.print("\nEnter month (1-12): ");
        int month = scanner.nextInt();
        scanner.nextLine();
        float totalExpense = 0;
        System.out.println("\nExpenses for month " + month + ":");
        for (Expense expense : expenses) {
            if (expense.date.getMonthValue() == month) {
                expense.PrintDetails();
                totalExpense += expense.expense;
            }
        }
        System.out.println("Total expense for month " + month + ": Rs." + totalExpense);
    }

    private void ExpenseHistory() {
        System.out.println("\nExpense History:");
        for (Expense expense : expenses) {
            expense.PrintDetails();
        }
    }
}