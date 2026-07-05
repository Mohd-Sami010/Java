import java.time.LocalDate;

public class Expense {
    public String name;
    public float expense;

    public enum ExpenseType {
        None,
        Food,
        Travel,
        Shopping,
        Bills,
        Health,
        Education,
    }

    public ExpenseType expenseType = ExpenseType.None;
    LocalDate date;

    public Expense(String name, float expense, ExpenseType type, LocalDate date) {
        this.name = name;
        this.expense = expense;
        if (type != null)
            this.expenseType = type;
        else
            this.expenseType = ExpenseType.None;

        if (date != null)
            this.date = date;
        else
            this.date = LocalDate.now();
    }

    public void PrintDetails() {
        System.out.println(name + " Rs." + expense + ", Type: " + expenseType + ", Date: " + date);
    }
}
