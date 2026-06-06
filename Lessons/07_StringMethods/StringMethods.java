public class StringMethods {
    public void main(){
        String name = "Mohd Sami";

        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("S"));
        System.out.println(name.lastIndexOf("m"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("a", "i"));
        System.out.println(name.isEmpty());
        System.out.println(name.contains("M"));
        System.out.println(name.equals("mohd Sami"));
        System.out.println(name.equalsIgnoreCase("mohd sami"));

        // Substring
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(5));
    }
}
