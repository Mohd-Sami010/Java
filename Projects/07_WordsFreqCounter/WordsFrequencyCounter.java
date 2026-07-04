import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsFrequencyCounter {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> wordsFrequency = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (wordsFrequency.containsKey(word)) {
                wordsFrequency.put(word, wordsFrequency.get(word) + 1);
            } else {
                wordsFrequency.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> w : wordsFrequency.entrySet()) {
            System.out.println(w.getKey() + ": " + w.getValue());
        }
    }
}
