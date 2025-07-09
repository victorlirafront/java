package dataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> filaPrioridade = new PriorityQueue<>();

        addItems(filaPrioridade);
        peekItem(filaPrioridade);
        removeItem(filaPrioridade);
        addMoreItems(filaPrioridade);
        iterateOverQueue(filaPrioridade);
        clearQueue(filaPrioridade);
    }

    // Adiciona itens à fila de prioridade
    public static void addItems(Queue<Integer> fila) {
        fila.add(5);
        fila.add(1);
        fila.add(3);
        System.out.println("Itens adicionados à fila de prioridade: " + fila);
        // A ordem impressa pode não parecer ordenada, mas internamente a menor prioridade vem primeiro
    }

    // Olha o menor item da fila (sem remover)
    public static void peekItem(Queue<Integer> fila) {
        Integer menor = fila.peek();
        if (menor != null) {
            System.out.println("Item com maior prioridade (peek): " + menor);
        } else {
            System.out.println("Fila está vazia.");
        }
    }

    // Remove o item com maior prioridade (menor valor)
    public static void removeItem(Queue<Integer> fila) {
        Integer removido = fila.poll(); // remove o menor valor
        if (removido != null) {
            System.out.println("Item removido (poll): " + removido);
        } else {
            System.out.println("Nenhum item para remover.");
        }
        System.out.println("Fila após remoção: " + fila);
    }

    // Adiciona mais itens à fila
    public static void addMoreItems(Queue<Integer> fila) {
        fila.offer(2);
        fila.offer(4);
        System.out.println("Novos itens adicionados: " + fila);
    }

    // Itera pelos itens da fila
    public static void iterateOverQueue(Queue<Integer> fila) {
        System.out.println("Iterando pelos itens da fila (atenção: não necessariamente em ordem):");
        for (Integer item : fila) {
            System.out.println("- " + item);
        }
    }

    // Limpa a fila
    public static void clearQueue(Queue<Integer> fila) {
        fila.clear();
        System.out.println("Fila limpa. Tamanho atual: " + fila.size());
    }
}
