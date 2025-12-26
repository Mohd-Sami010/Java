import java.util.Scanner;
public class QuizGame {
    public void main(){
        Scanner scanner = new Scanner(System.in);

        // Questions Arrray ["Example of Bitwise Operator is:", "Keyword used to stop loops:"]
        // 2D Options Array [["+","^","-","%"], ["break", "continue", "quit","All of the above"]]
        // Ans Array [2, 1]

        String questionsArr[] = {
            "Which planet is known as the Red Planet?",
            "What is the capital city of France?",
            "How many legs does a spider have?",
            "Which gas do humans need to breathe to survive?",
            "What is the largest ocean on Earth?",
        };
        String optionsArr[][] = {
            {"Venus", "Mars", "Jupiter", "Saturn"},
            {"Rome", "Madrid", "Paris", "Berlin"},
            {"6", "8", "10", "12"},
            {"Nitrogen", "Carbon Dioxide", "Hydrogen", "Oxygen"},
            {"Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"}
        };
        int correctAnswerArr[] = {2, 3, 2, 4, 3};

        System.out.println("***********************************");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("***********************************\n");
        int score = 0;
        for (int currentQueIndex = 0; currentQueIndex < questionsArr.length; currentQueIndex++){
            System.out.println("Q" + (currentQueIndex+1) + ". " + questionsArr[currentQueIndex]);

            // Print Options
            for (int i = 0; i < 4; i++) System.out.println((i+1) + ". " + optionsArr[currentQueIndex][i]);
            System.out.print("Enter your option number: ");
            
            int answer = scanner.nextInt();
            if (answer == correctAnswerArr[currentQueIndex]){
                score++;
                System.out.println("*********\nCORRECT!\n*********");
            }
            else {
                System.out.println("*********\nWRONG!\n*********");
            }
            System.out.println();
        }
        System.out.println("***********************************");
        System.out.println("Your final score is: " + score + " out of " + questionsArr.length);
        System.out.println("***********************************");
        scanner.close();
    }
}
