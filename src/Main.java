import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Victor");
        lista.add("Anna");
        loopItems(lista);

        // Apenas para ver o resultado
        System.out.println(lista); // [Victor, James]
    }

    public static void loopItems(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(lista.get(i), "Anna")) {
                lista.set(i, "James");
            }
        }
    }
}
