import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    // Constructor
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }

    // Method to add an abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }

    // Main method for testing
    public static void main(String[] args) {
        Abbreviations abbrev = new Abbreviations();

        // Adding abbreviations
        abbrev.addAbbreviation("LOL", "Laugh Out Loud");
        abbrev.addAbbreviation("BRB", "Be Right Back");

        // Finding explanations
        System.out.println("Explanation for LOL: " + abbrev.findExplanationFor("LOL")); // Output: Laugh Out Loud
        System.out.println("Explanation for BRB: " + abbrev.findExplanationFor("BRB")); // Output: Be Right Back
        System.out.println("Explanation for TTYL: " + abbrev.findExplanationFor("TTYL")); // Output: null
    }
}
