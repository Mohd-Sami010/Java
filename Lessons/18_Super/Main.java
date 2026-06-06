public class Main {
    public void main(){
        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 6.7);
        Employee employee = new Employee("Rubeus","Hagrid", 50000);

        person.ShowName();
        student.ShowGPA();;
        employee.ShowSalary();
    }
}
