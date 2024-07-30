package BookandProgram;

import java.util.HashMap;

public class Program {

    // Method to print all the values in the hashmap using the toString method of Book
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Method to print only the Books whose name contains the given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        System.out.println("Print all values:");
        printValues(hashmap);
        System.out.println("---");

        System.out.println("Print values where name contains 'prejud':");
        printValueIfNameContains(hashmap, "prejud");
    }
}

