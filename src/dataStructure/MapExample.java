package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        addItems(mapa);
        getItem(mapa);
        updateItem(mapa);
        checkInfo(mapa);
        iterateOverMap(mapa);
        removeItem(mapa);
        clearMap(mapa);
    }

    // Adiciona pares chave-valor ao mapa
    public static void addItems(Map<String, Integer> mapa) {
        mapa.put("João", 30);
        mapa.put("Maria", 25);
        mapa.put("Pedro", 40);
        System.out.println("Itens adicionados ao mapa: " + mapa);
    }

    // Obtém um valor associado a uma chave
    public static void getItem(Map<String, Integer> mapa) {
        Integer idade = mapa.get("Maria"); // retorna 25
        if (idade != null) {
            System.out.println("Idade da Maria: " + idade);
        } else {
            System.out.println("Maria não encontrada no mapa.");
        }
    }

    // Atualiza o valor de uma chave existente
    public static void updateItem(Map<String, Integer> mapa) {
        mapa.put("João", 31); // substitui o valor anterior (30)
        System.out.println("Idade de João atualizada: " + mapa.get("João"));
    }

    // Verifica informações do mapa
    public static void checkInfo(Map<String, Integer> mapa) {
        System.out.println("Tamanho do mapa: " + mapa.size());
        System.out.println("Mapa está vazio? " + mapa.isEmpty());
        System.out.println("Contém a chave 'Pedro'? " + mapa.containsKey("Pedro"));
        System.out.println("Contém o valor 25? " + mapa.containsValue(25));
    }

    // Itera sobre os pares chave-valor
    public static void iterateOverMap(Map<String, Integer> mapa) {
        System.out.println("Iterando sobre o mapa:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Remove um item do mapa
    public static void removeItem(Map<String, Integer> mapa) {
        Integer removido = mapa.remove("Pedro");
        if (removido != null) {
            System.out.println("Pedro removido do mapa. Valor era: " + removido);
        } else {
            System.out.println("Pedro não encontrado no mapa.");
        }
        System.out.println("Mapa após remoção: " + mapa);
    }

    // Limpa o mapa
    public static void clearMap(Map<String, Integer> mapa) {
        mapa.clear();
        System.out.println("Mapa limpo. Tamanho atual: " + mapa.size());
    }
}
