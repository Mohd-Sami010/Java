public abstract class Shape {

    abstract double Area(); // Abstact Method: Every Child must have this

    void Display() { // Concrete Method
        System.out.println("This is a Shape");
    }
}
