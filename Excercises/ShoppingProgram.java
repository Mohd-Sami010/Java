import java.util.Scanner;
public class ShoppingProgram {
    public void main(){
        Scanner scanner = new Scanner(System.in);

        String itemName;
        float itemPrice;
        int itemAmount;

        System.out.print("Enter name of the item: ");
        itemName = scanner.nextLine();

        System.out.print("How much a " + itemName + " cost?: $");
        itemPrice = scanner.nextFloat();

        System.out.print("How many  " + itemName + " bought?: ");
        itemAmount =scanner.nextInt();

        System.out.println("\nYou have bought " + itemAmount + " " + itemName + "/s");
        System.out.println("Your total is: $" + (itemAmount * itemPrice));

        scanner.close();
    }
}
