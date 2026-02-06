public class Employee extends Person{
    int salary;

    Employee(String firstName, String lastName, int salary){
        super(firstName, lastName);
        this.salary = salary;
    }
    void ShowSalary(){
        System.out.println(this.firstName + "'s salary is $" + salary);
    }
}
