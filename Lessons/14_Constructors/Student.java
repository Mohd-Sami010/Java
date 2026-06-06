public class Student {
    String name;
    int age;
    double gpa;
    boolean passed;
    
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.passed = true;
    }
    public void Details(){
        System.out.println("Name: " + name +"\nAge: " + age + "\ngpa: " + gpa + "\nPassed: " + passed);
    }
}
