public class Printf {
    public void main(){
        String name = "Mohd Sami";
        int age = 18;
        boolean isStudent = true;
        float cgpa = 8.2356f;

        System.out.printf("%s is %d years old and isStudent: %b\nCgpa Scored: %.1f", name, age, isStudent,cgpa);

        // And lot more %_ operators for int & floats
    }
}
