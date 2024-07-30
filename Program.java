import java.util.HashMap;

public class Program {

    // Method to print all the keys in the hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to print keys that contain the specified text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print values whose keys contain the specified text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        System.out.println("Print all keys:");
        printKeys(hashmap);
        System.out.println("---");

        System.out.println("Print keys containing 'i':");
        printKeysWhere(hashmap, "i");
        System.out.println("---");

        System.out.println("Print values of keys containing '.e':");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
