import java.util.*;

public class DataStructure {
    public static void main(String[] args) {
        // 🔹 1. Array (nativo)
        int[] numeros = new int[5];
        numeros[0] = 10;
        System.out.println("Array[0]: " + numeros[0]);

        // 🔹 2. Listas
        List<String> lista = new ArrayList<>();
        lista.add("Item 1");

        List<String> listaEncadeada = new LinkedList<>();
        listaEncadeada.add("Linked 1");

        System.out.println("ArrayList: " + lista);
        System.out.println("LinkedList: " + listaEncadeada);

        // 🔹 3. Pilha (Stack)
        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        System.out.println("Pop da pilha: " + pilha.pop());

        // 🔹 4. Fila (Queue)
        Queue<String> fila = new LinkedList<>();
        fila.add("A");
        fila.add("B");
        System.out.println("Removido da fila: " + fila.poll());

        // 🔹 5. Fila Dupla (Deque)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("Deque: " + deque);

        // 🔹 6. Conjuntos (Set)
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Maçã"); // duplicado, não entra
        System.out.println("Conjunto: " + conjunto);

        // 🔹 7. Mapas (Map)
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 1);
        mapa.put("B", 2);
        System.out.println("Mapa: " + mapa);

        // 🔹 8. Priority Queue
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.add(5);
        filaPrioridade.add(1);
        filaPrioridade.add(3);
        System.out.println("Menor prioridade: " + filaPrioridade.poll());

        // 🔹 9. Estrutura de Árvore (exemplo simples de nó binário)
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        System.out.println("Árvore - Raiz: " + root.value);

        // 📘 Extras
        int[] arrayOrdenar = {3, 1, 2};
        Arrays.sort(arrayOrdenar);
        System.out.println("Array ordenado: " + Arrays.toString(arrayOrdenar));

        List<String> nomes = new ArrayList<>(Arrays.asList("Carlos", "Ana", "Bruno"));
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);
        Collections.reverse(nomes);
        System.out.println("Lista reversa: " + nomes);
    }
}

// 🔹 Estrutura simples de árvore binária
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
    }
}
