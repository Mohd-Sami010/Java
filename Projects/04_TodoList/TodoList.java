import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TodoList {
    Path filePath = Path.of("tasks.txt");
    ArrayList<String> tasksList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    private void GetTasksFromFile() {
        try {
            String[] tasksTextList = Files.readString(filePath).split(",");

            for (String task : tasksTextList) {
                tasksList.add(task);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void SaveTasks() {
        String tasksText = "";
        for (String task : tasksList) {
            tasksText += task + ",";
        }
        try {
            Files.writeString(filePath, tasksText);
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void main() {
        GetTasksFromFile();

        System.out.println("WELCOME TO TO-DO LIST\n");

        if (tasksList.size() > 0)
            ViewTasks();
        while (true) {
            System.out.println("\n1. Add Task\n2. Delete Task\n3. Mark Complete\n4. View tasks");

            System.out.print("Enter you choice: ");
            int optionNumber = scanner.nextInt();
            scanner.nextLine();
            switch (optionNumber) {
                case 1:
                    AddTask();
                    break;
                case 2:
                    DeleteTask();
                    break;
                case 3:
                    MarkComplete();
                    break;
                case 4:
                    ViewTasks();
                    break;
            }
            System.out.print("Exit? (Y/N): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for using Todo list :)");
                break;
            }
        }
    }

    private void AddTask() {
        System.out.print("Enter task name: ");
        String taskName = "0" + scanner.nextLine();

        tasksList.add(taskName);
        SaveTasks();
        System.out.println("Task added to list");
    }

    private void DeleteTask() {
        if (tasksList.size() == 0) {
            System.out.println("No Tasks in list");
            return;
        }
        System.out.println("Choose a task to mark done: ");
        ViewTasks();

        System.out.println("Enter task number: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        tasksList.remove(taskNumber - 1);
        SaveTasks();
        System.out.println("Task have been Deleted\nNew List:");
        ViewTasks();
    }

    private void MarkComplete() {
        if (tasksList.size() == 0) {
            System.out.println("No Tasks in list");
            return;
        }
        System.out.println("Choose a task to mark done: ");
        ViewTasks();

        System.out.print("Enter task number: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        String task = tasksList.get(taskNumber - 1);
        tasksList.set(taskNumber - 1, "1" + task.substring(1, task.length()));
        SaveTasks();
        System.out.println("Task marked as Done\nNew List:");
        ViewTasks();
    }

    private void ViewTasks() {
        if (tasksList.size() == 0) {
            System.out.println("No tasks yet");
            return;
        }
        for (String task : tasksList) {
            if (task.charAt(0) == '0')
                System.out.print("[ ] ");
            else
                System.out.print("[X] ");
            System.out.println(task.substring(1, task.length()));
        }
    }
}