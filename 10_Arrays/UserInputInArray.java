import java.util.Scanner;

public class UserInputInArray {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of fruits you want: ");
        int size = scanner.nextInt(); 
        scanner.nextLine();
        String[] fruits = new String[size];

        for (int i=0; i< fruits.length; i++){
            System.out.print("Enter a fruit: ");
            fruits[i] = scanner.nextLine();
        }

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        scanner.close();
    }
}
