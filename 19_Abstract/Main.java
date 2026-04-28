public class Main {
    public void main() {

        Circle circle = new Circle(5f);
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        circle.Display();

        System.out.println("Area of Circle: " + circle.Area());
    }
}
