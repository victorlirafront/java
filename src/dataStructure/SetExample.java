package dataStructure;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        addItems(conjunto);
        addDuplicateItem(conjunto);
        checkInfo(conjunto);
        iterateOverSet(conjunto);
        removeItem(conjunto);
        clearSet(conjunto);
    }

    // Adiciona itens ao conjunto
    public static void addItems(Set<String> conjunto) {
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Laranja");
        System.out.println("Itens adicionados ao conjunto: " + conjunto);
    }

    // Tenta adicionar item duplicado
    public static void addDuplicateItem(Set<String> conjunto) {
        boolean added = conjunto.add("Maçã"); // já existe, não será adicionado
        System.out.println("Tentando adicionar 'Maçã' novamente: " + (added ? "Adicionado" : "Ignorado (duplicado)"));
        System.out.println("Estado atual do conjunto: " + conjunto);
    }

    // Exibe informações do conjunto
    public static void checkInfo(Set<String> conjunto) {
        System.out.println("Tamanho do conjunto: " + conjunto.size());
        System.out.println("Conjunto está vazio? " + conjunto.isEmpty());
        System.out.println("Conjunto contém 'Banana'? " + conjunto.contains("Banana"));
    }

    // Itera pelos itens do conjunto
    public static void iterateOverSet(Set<String> conjunto) {
        System.out.println("Iterando pelo conjunto:");
        for (String item : conjunto) {
            System.out.println("- " + item);
        }
    }

    // Remove um item do conjunto
    public static void removeItem(Set<String> conjunto) {
        boolean removed = conjunto.remove("Laranja");
        System.out.println("Remover 'Laranja': " + (removed ? "Removido" : "Não encontrado"));
        System.out.println("Conjunto após remoção: " + conjunto);
    }

    // Limpa o conjunto
    public static void clearSet(Set<String> conjunto) {
        conjunto.clear();
        System.out.println("Conjunto limpo. Tamanho atual: " + conjunto.size());
    }
}
