public class Testing {
    public void main(){
        User user1 = new User();
        User user2 = new User("Sami");
        User user3 = new User("Abc", "abc@gmail.com");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
