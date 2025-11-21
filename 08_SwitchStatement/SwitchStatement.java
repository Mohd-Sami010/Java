import java.util.Random;
public class SwitchStatement {
    public void main(){
        Random random = new Random();
        int diceNum = random.nextInt(1, 7);

        switch (diceNum){
            case 1 -> System.out.println("*");
            case 2 -> System.out.println("*\n *");
            case 3 -> System.out.println(" *\n* *");
            case 4 -> System.out.println("* *\n* *");
            case 5 -> System.out.println("* *\n *\n* *");
            case 6 -> System.out.println("* *\n* *\n* *");
            default -> System.out.print(diceNum);
        }

        // case case1, case2, case3 -> (Use it for using "or" in switch)
    }
}