import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ContactBook {

    Path filePath = Path.of("contacts.txt");
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> contactsHashMap = new HashMap<>();

    public void main() {
        LoadContactsFromFile();

        System.out.println("    CONTACT BOOK");

        while (true) {
            System.out.print("\n1. Add contact\n2. Search\n3. Delete\n4. Display contacts\nEnter option: ");

            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
            switch (option) {
                case 1:
                    AddContact();
                    break;
                case 2:
                    SearchContact();
                    break;
                case 3:
                    DeleteContact();
                    break;
                case 4:
                    DisplayContacts();
                    break;
            }
            System.out.print("Exit? (y/n): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Thanks for Using :)");
                break;
            }
        }
    }

    private void LoadContactsFromFile() {
        try {
            String[] contacts = Files.readString(filePath).split(", ");
            for (String c : contacts) {
                String[] values = c.split(": ");
                contactsHashMap.put(values[0], values[1]);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void SaveContactsToFile() {
        String contactsString = "";
        for (Map.Entry<String, String> c : contactsHashMap.entrySet()) {
            contactsString += c.getKey() + ": " + c.getValue() + ", ";
        }
        try {
            Files.writeString(filePath, contactsString);
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void AddContact() {
        System.out.print("Enter name of contact: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String number = scanner.nextLine();

        contactsHashMap.put(name, number);

        SaveContactsToFile();
        System.out.println(name + " Added to contact book.");
    }

    private void SearchContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        if (!contactsHashMap.containsKey(name)) {
            System.out.println("Unable to find any contact with name \"" + name + "\" :(");
            return;
        }
        System.out.println(name + ": " + contactsHashMap.get(name));
    }

    private void DeleteContact() {
        DisplayContacts();

        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();

        if (!contactsHashMap.containsKey(name)) {
            System.out.println("Unable to find any contact with name \"" + name + "\" :(");
            return;
        }
        contactsHashMap.remove(name);

        SaveContactsToFile();
        System.out.println("Delete contact with name: " + name);
    }

    private void DisplayContacts() {
        System.out.println("Contact List:");
        for (Map.Entry<String, String> c : contactsHashMap.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }

}