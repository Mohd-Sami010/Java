public class Student extends Person {
    double gpa;

    Student(String firstName, String lastname, double gpa){
        super(firstName, lastname);
        this.gpa = gpa;
    }
    void ShowGPA(){
        System.out.println(this.firstName + "'s GPA is " + gpa);
    }
}
