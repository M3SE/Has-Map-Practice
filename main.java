import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");

        String name = map.get("matthew");
            System.out.println(name);

    }
}
