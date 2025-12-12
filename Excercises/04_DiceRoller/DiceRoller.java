import java.util.Random;
import java.util.Scanner;
public class DiceRoller {
    public void main(){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dice to roll: ");
        int dicesToRoll = scanner.nextInt();
        scanner.close();

        System.out.println("Rolling " + dicesToRoll + " dice...");

        int totalSum = 0;
        for (int i = 0; i< dicesToRoll; i++){
            totalSum += RollDice();
        }
        System.out.println("Total of All: " + totalSum);
    }
    public int RollDice(){
        Random random = new Random();
        int rolledNum = random.nextInt(1, 7);
        DrawDice(rolledNum);
        return rolledNum;
    }
    public void DrawDice(int rolledNum){
        System.out.println(" -------");
        switch (rolledNum){
            case 1:
                System.out.println("|       |\n|   *   |\n|       |");
                break;
            case 2:
                System.out.println("|       |\n| *   * |\n|       |");
                break;
            case 3:
                System.out.println("|   *   |\n|       |\n| *   * |");
                break;
            case 4:
                System.out.println("| *   * |\n|       |\n| *   * |");
                break;
            case 5:
                System.out.println("| *   * |\n|   *   |\n| *   * |");
                break;
            case 6:
                System.out.println("| *   * |\n| *   * |\n| *   * |");
                break;
        }
        System.out.println(" -------");
        System.out.println("You rolled: " + rolledNum);
    }

}
