package dataStructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pushItems(pilha);
        peekTopItem(pilha);
        popItem(pilha);
        pushMoreItems(pilha);
        searchItem(pilha, "Item 2");
        checkInfo(pilha);
        iterateOverStack(pilha);
        clearStack(pilha);
    }

    // Adiciona itens à pilha
    public static void pushItems(Stack<String> pilha) {
        pilha.push("Item 1");
        pilha.push("Item 2");
        pilha.push("Item 3");
        System.out.println("Itens empilhados: " + pilha);
    }

    // Olha o topo da pilha sem remover
    public static String peekTopItem(Stack<String> pilha) {
        if (!pilha.isEmpty()) {
            String topo = pilha.peek();
            System.out.println("Topo da pilha (peek): " + topo);
            return topo;
        } else {
            System.out.println("Pilha vazia.");
            return null;
        }
    }

    // Remove o item do topo
    public static String popItem(Stack<String> pilha) {
        if (!pilha.isEmpty()) {
            String removido = pilha.pop();
            System.out.println("Item removido (pop): " + removido);
            return removido;
        } else {
            System.out.println("Pilha vazia.");
            return null;
        }
    }

    // Empilha mais itens
    public static void pushMoreItems(Stack<String> pilha) {
        pilha.push("Novo Item");
        System.out.println("Novo item empilhado. Estado atual: " + pilha);
    }

    // Procura um item na pilha
    public static void searchItem(Stack<String> pilha, String item) {
        int posicao = pilha.search(item);
        if (posicao != -1) {
            System.out.println("Item '" + item + "' encontrado na posição (do topo): " + posicao);
        } else {
            System.out.println("Item '" + item + "' não encontrado na pilha.");
        }
    }

    // Exibe informações da pilha
    public static void checkInfo(Stack<String> pilha) {
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }

    // Itera pela pilha
    public static void iterateOverStack(Stack<String> pilha) {
        System.out.println("Iterando com for-each:");
        for (String item : pilha) {
            System.out.println("- " + item);
        }

        System.out.println("Iterando do topo até a base:");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            System.out.println("- Item " + i + ": " + pilha.get(i));
        }
    }

    // Limpa a pilha
    public static void clearStack(Stack<String> pilha) {
        pilha.clear();
        System.out.println("Pilha limpa. Tamanho atual: " + pilha.size());
    }
}
