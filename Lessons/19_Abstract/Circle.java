public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double Area() {
        return Math.PI * radius * radius;
    }
}
