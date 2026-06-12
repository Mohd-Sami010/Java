import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    ArrayList<String> tasksList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void main() {

        System.out.println("WELCOME TO TO-DO LIST");

        while (true) {
            System.out.println("1. Add Task\n2. Remove Task\n3. Mark Complete\n4. View tasks");

            System.out.print("Enter you choice: ");
            int optionNumber = scanner.nextInt();
            scanner.nextLine();
            switch (optionNumber) {
                case 1:
                    AddTask();
                    break;
                case 2:
                    RemoveTask();
                    break;
                case 3:
                    MarkComplete();
                    break;
                case 4:
                    ViewTasks();
                    break;
            }
        }
    }

    private void AddTask() {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        tasksList.add(taskName);
    }

    private void RemoveTask() {

    }

    private void MarkComplete() {

    }

    private void ViewTasks() {
        if (tasksList.size() == 0) {
            System.out.println("No tasks yet");
            return;
        }
        for (String task : tasksList) {
            System.out.println(task);
        }
    }
}