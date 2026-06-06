import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(){
        float length;
        float width;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextFloat();

        System.out.print("Enter width: ");
        width = scanner.nextFloat();

        area = length * width;
        System.out.print("Area of Rectangle is: " + area + "cm²");

        scanner.close();
    }
}
