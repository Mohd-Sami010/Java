import java.util.Random;
public class RandomRumbers {
    public void main(){
        Random random = new Random();

        for (int i = 0; i < 5; i++){

            int randomNum = random.nextInt(1, 51);
            
            System.out.println(randomNum);
        }
    }
}
