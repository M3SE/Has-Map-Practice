import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    // Constructor
    public IOU() {
        debts = new HashMap<>();
    }

    // Method to save the amount owed and the person owed to the IOU
    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    // Method to return the amount owed to the person whose name is given as a parameter
    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }

    // Main method for testing
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // Output: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Output: 30.0
        System.out.println(mattsIOU.howMuchDoIOweTo("David")); // Output: 0.0

        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // Output: 10.5
    }
}
