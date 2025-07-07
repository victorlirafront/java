package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        addNewItems(lista);
        getFirstItem(lista);
        setItem(lista, 2, "Item modificado");
        removeItems(lista);
        printInfo(lista);
        iterateOverList(lista);
        clearList(lista);
    }

    // Adiciona novos elementos à lista
    public static void addNewItems(List<String> lista) {
        lista.add("Item 1");
        lista.add("Item 2");
        lista.add("Item 3");
        lista.add(1, "Item inserido no meio");
        System.out.println("Itens adicionados: " + lista);
    }

    // Retorna e imprime o primeiro item da lista
    public static String getFirstItem(List<String> lista) {
        if (lista != null && !lista.isEmpty()) {
            String firstItem = lista.get(0);
            if (firstItem != null && !firstItem.isEmpty()) {
                System.out.println("Primeiro item: " + firstItem);
                return firstItem;
            } else {
                System.out.println("Primeiro item é nulo ou vazio.");
            }
        } else {
            System.out.println("Lista vazia ou nula.");
        }
        return null;
    }

    // Modifica um item pelo índice
    public static void setItem(List<String> lista, int index, String novoValor) {
        if (index >= 0 && index < lista.size()) {
            lista.set(index, novoValor);
            System.out.println("Item na posição " + index + " foi modificado para: " + novoValor);
        } else {
            System.out.println("Índice inválido para modificação.");
        }
    }

    // Remove itens específicos
    public static void removeItems(List<String> lista) {
        lista.remove("Item 2"); // por valor
        if (!lista.isEmpty()) {
            lista.remove(0); // por índice
        }
        System.out.println("Itens removidos. Estado atual: " + lista);
    }

    // Imprime informações da lista
    public static void printInfo(List<String> lista) {
        System.out.println("Contém 'Item 3'? " + lista.contains("Item 3"));
        System.out.println("Índice de 'Item 3': " + lista.indexOf("Item 3"));
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Lista está vazia? " + lista.isEmpty());
    }

    // Duas formas de iterar pela lista
    public static void iterateOverList(List<String> lista) {
        System.out.println("Iterando com for-each:");
        for (String item : lista) {
            System.out.println("- " + item);
        }

        System.out.println("Iterando com for tradicional:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("- Item " + i + ": " + lista.get(i));
        }
    }

    // Limpa a lista
    public static void clearList(List<String> lista) {
        lista.clear();
        System.out.println("Lista limpa. Tamanho atual: " + lista.size());
    }
}
