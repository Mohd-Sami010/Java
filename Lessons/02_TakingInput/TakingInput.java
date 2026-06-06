import java.util.Scanner;
public class TakingInput {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(n + " * 2 = " + n * 2);
        scanner.close();
    }
}
