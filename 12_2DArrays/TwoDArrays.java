public class TwoDArrays {
    public static void main() {
        String[] fruits = { "apple", "orange", "banana", "grape" };
        String[] vegs = { "potato", "tomato", "chilli" };
        String[] meats = { "beef", "fish", "mutton" };

        String[][] groceries = { fruits, vegs, meats };

        for (String[] items : groceries) {
            for (String item : items) {
                System.out.print(item + ", ");
            }
            System.out.println();
        }
    }
}
