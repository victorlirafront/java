package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        declareSpace();
        declareAndInitialize();
        addToArrayUsingCopy();
        useArrayList();
        printArrayReverse();
    }

    // Declara espaço e preenche manualmente
    public static void declareSpace() {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println("\n=== declareSpace ===");
        for (int number : numbers) {
            System.out.println("number: " + number);
        }
    }

    // Declara e inicializa diretamente
    public static void declareAndInitialize() {
        String[] names = {"Ana", "João", "Pedro"};

        System.out.println("\n=== declareAndInitialize ===");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }

    // Simula adicionar elemento a um array fixo
    public static void addToArrayUsingCopy() {
        String[] original = {"Ana", "João", "Pedro"};
        String[] expanded = Arrays.copyOf(original, original.length + 1);
        expanded[expanded.length - 1] = "Maria";

        System.out.println("\n=== addToArrayUsingCopy ===");
        for (String name : expanded) {
            System.out.println("Name: " + name);
        }
    }

    // Usa ArrayList para adicionar dinamicamente
    public static void useArrayList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("João");
        names.add("Pedro");
        names.add("Maria");

        System.out.println("\n=== useArrayList ===");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }

    // Imprime o array de trás para frente
    public static void printArrayReverse() {
        int[] numbers = {10, 20, 30, 40};

        System.out.println("\n=== printArrayReverse ===");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("number: " + numbers[i]);
        }
    }
}
