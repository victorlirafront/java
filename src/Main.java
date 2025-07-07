import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ana", "Bruno", "Carlos"));
        names.add("Victor");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Nome: " + names.get(i));
        }
    }
}
