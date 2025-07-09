package dataStructure;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
    
        addElements(deque);
        //accessElements(deque);
        //removeElements(deque);
        //useStackBehavior(deque);
        //useQueueBehavior(deque);
        //iterateBothWays(deque);
       // clearDeque(deque);
    }

    // Adiciona elementos no início e fim
    public static void addElements(Deque<String> deque) {
        deque.addFirst("A");
        deque.addLast("B");
        deque.offerFirst("X");  // adiciona na frente de forma segura
        deque.offerLast("Y");   // adiciona no final de forma segura
        System.out.println("Estado atual do deque: " + deque);
    }

    // Acessa elementos nas duas extremidades sem remover
    public static void accessElements(Deque<String> deque) {
        System.out.println("Primeiro (peekFirst): " + deque.peekFirst());
        System.out.println("Último (peekLast): " + deque.peekLast());
    }

    // Remove elementos das extremidades
    public static void removeElements(Deque<String> deque) {
        String removedFirst = deque.pollFirst();
        String removedLast = deque.pollLast();
        System.out.println("Removido do início: " + removedFirst);
        System.out.println("Removido do fim: " + removedLast);
        System.out.println("Estado após remoções: " + deque);
    }

    // Comportamento de pilha (LIFO - Last In, First Out)
    public static void useStackBehavior(Deque<String> deque) {
        // Adiciona "Topo 1" no topo da pilha (como se fosse o primeiro item colocado)
        deque.push("Topo 1");

        // Adiciona "Topo 2" no topo da pilha, então ele fica acima de "Topo 1"
        deque.push("Topo 2");

        // Exibe a pilha após as inserções
        // Esperado: [Topo 2, Topo 1] porque "Topo 2" foi o último a entrar
        System.out.println("Depois de push (estilo pilha): " + deque);

        // Remove o elemento do topo da pilha (último a entrar, primeiro a sair)
        // Esperado: "Topo 2"
        System.out.println("Pop (estilo pilha): " + deque.pop());

        // Exibe a pilha após a remoção do topo
        // Esperado: [Topo 1], já que "Topo 2" foi removido
        System.out.println("Estado após pop: " + deque);
    }

    // Comportamento de fila (FIFO - First In, First Out)
    public static void useQueueBehavior(Deque<String> deque) {
        // Adiciona "Item A" no final da fila
        deque.offer("Item A");

        // Adiciona "Item B" também no final da fila
        // Agora a fila é: [Item A, Item B]
        deque.offer("Item B");

        // Exibe a fila após as inserções
        // Esperado: [Item A, Item B]
        System.out.println("Depois de offer (estilo fila): " + deque);

        // Remove e retorna o primeiro item da fila (o que está na frente)
        // Esperado: "Item A", porque foi o primeiro a entrar
        System.out.println("Poll (estilo fila): " + deque.poll());

        // Exibe a fila após a remoção
        // Esperado: [Item B], já que "Item A" foi removido
        System.out.println("Estado após poll: " + deque);
    }

    // Itera do início ao fim e do fim ao início
    public static void iterateBothWays(Deque<String> deque) {
        System.out.println("Iterando do início ao fim:");
        for (String item : deque) {
            System.out.println("- " + item);
        }

        System.out.println("Iterando do fim ao início:");
        Iterator<String> descending = deque.descendingIterator();
        while (descending.hasNext()) {
            System.out.println("- " + descending.next());
        }
    }

    // Limpa o deque
    public static void clearDeque(Deque<String> deque) {
        deque.clear();
        System.out.println("Deque limpo. Está vazio? " + deque.isEmpty());
    }
}
