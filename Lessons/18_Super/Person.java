public class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void ShowName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}
