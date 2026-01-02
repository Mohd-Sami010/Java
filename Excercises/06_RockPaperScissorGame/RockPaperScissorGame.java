import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    public void main(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] moves = {"rock", "paper", "scissors"};

        while (true){
            System.out.print("Enter you move (rock, paper, scissors): ");
            String playerMove = scanner.nextLine();

            String computerMove = moves[random.nextInt(0,3)];
            System.out.println("Computer move: " + computerMove);

            if (playerMove.equals(computerMove)){
                System.out.println("Draw!");
            }
            else if (playerMove.equals("rock") && computerMove.equals("scissors")){
                System.out.println("You Win!");
            }
            else if (playerMove.equals("paper") && computerMove.equals("rock")){
                System.out.println("You Win!");
            }
            else if (playerMove.equals("scissors") && computerMove.equals("paper")){
                System.out.println("You Win!");
            }
            else{
                System.out.println("You Lose!");
            }

            System.out.print("Play again (yes/no): ");
            String playAgain = scanner.nextLine();
            System.out.println();

            if (playAgain == "no") break;
        }
        System.out.println("Thanks For Playing :)");
        scanner.close();
    }
}
