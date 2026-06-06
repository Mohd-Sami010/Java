import java.util.Arrays;

public class ArraysInJava {
    public static void main(){
        String[] fruits = {"apple", "orange", "mango", "grape"};

        for (String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println();
        Arrays.sort(fruits);
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println();
        Arrays.fill(fruits, "banana");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
