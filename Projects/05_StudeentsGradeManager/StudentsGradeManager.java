import java.util.Scanner;
import java.util.ArrayList;

public class StudentsGradeManager {
    ArrayList<Student> studentsList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void main() {

        System.out.println("    STUDENTS GRADE MAANGER");

        while (true) {
            System.out.print(
                    "\n1. Add students\n2. Average marks\n3. Highest marks\n4. Lowest marks\n5. Show List\nChoose option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    AddStudent();
                    break;
                case 2:
                    AverageMarks();
                    break;
                case 3:
                    HighestMarks();
                    break;
                case 4:
                    LowestMarks();
                    break;
                case 5:
                    PrintList();
                    break;
            }
            System.out.print("Exit? (Y/N): ");
            String exit = scanner.nextLine();

            if (exit.equalsIgnoreCase("y"))
                break;
        }
    }

    private void AddStudent() {
        System.out.print("Enter the number of students to add: ");
        int numOfStds = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfStds; i++) {
            System.out.print("\n" + i + ". Enter Student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student marks: ");
            float marks = scanner.nextFloat();
            scanner.nextLine();

            Student student = new Student(name, marks);
            studentsList.add(student);
        }
        System.out.println(numOfStds + " Students added to list");
    }

    private void AverageMarks() {
        float sum = 0;
        for (Student std : studentsList) {
            sum += std.marks;
        }
        System.out.println("Average marks: " + (sum / studentsList.size()));
    }

    private void HighestMarks() {
        Student highestMarksStd = studentsList.get(0);
        for (Student std : studentsList) {
            if (highestMarksStd.marks < std.marks)
                highestMarksStd = std;
        }
        System.out.println(highestMarksStd.name + " have Highest marks of " + highestMarksStd.marks);
    }

    private void LowestMarks() {
        Student lowestMarksStd = studentsList.get(0);
        for (Student std : studentsList) {
            if (lowestMarksStd.marks > std.marks)
                lowestMarksStd = std;
        }
        System.out.println(lowestMarksStd.name + " have Lowest marks of " + lowestMarksStd.marks);
    }

    private void PrintList() {
        System.out.println("Students:");
        for (Student std : studentsList) {
            System.out.printf("\n%s: %f", std.name, std.marks);
        }
        System.out.println("\n");
    }
}