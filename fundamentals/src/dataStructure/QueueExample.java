package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        addItems(fila);
        peekFirstItem(fila);
        removeItem(fila);
        addMoreItems(fila);
        checkInfo(fila);
        iterateOverQueue(fila);
        clearQueue(fila);
    }

    // Adiciona itens à fila
    public static void addItems(Queue<String> fila) {
        fila.add("Item 1");
        fila.add("Item 2");
        fila.add("Item 3");
        System.out.println("Itens adicionados à fila: " + fila);
    }

    // Olha o primeiro item da fila sem remover
    public static String peekFirstItem(Queue<String> fila) {
        String primeiro = fila.peek();
        if (primeiro != null) {
            System.out.println("Primeiro item (peek): " + primeiro);
        } else {
            System.out.println("Fila vazia.");
        }
        return primeiro;
    }

    // Remove o primeiro item da fila
    public static String removeItem(Queue<String> fila) {
        String removido = fila.poll(); // retorna null se a fila estiver vazia
        if (removido != null) {
            System.out.println("Item removido (poll): " + removido);
        } else {
            System.out.println("Nenhum item para remover.");
        }
        return removido;
    }

    // Adiciona mais itens
    public static void addMoreItems(Queue<String> fila) {
        fila.offer("Novo Item"); // alternativa a add, mais segura
        System.out.println("Novo item adicionado. Estado atual da fila: " + fila);
    }

    // Exibe informações da fila
    public static void checkInfo(Queue<String> fila) {
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Fila está vazia? " + fila.isEmpty());
        System.out.println("Contém 'Item 2'? " + fila.contains("Item 2"));
    }

    // Itera pelos itens da fila
    public static void iterateOverQueue(Queue<String> fila) {
        System.out.println("Iterando com for-each:");
        for (String item : fila) {
            System.out.println("- " + item);
        }
    }

    // Limpa a fila
    public static void clearQueue(Queue<String> fila) {
        fila.clear();
        System.out.println("Fila limpa. Tamanho atual: " + fila.size());
    }
}
