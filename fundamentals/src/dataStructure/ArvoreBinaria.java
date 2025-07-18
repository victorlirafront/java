package dataStructure;

// Classe que representa um nó da árvore binária
class Node {
    int valor;
    Node esquerda;
    Node direita;

    // Construtor que inicializa o valor do nó
    Node(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

public class ArvoreBinaria {

    public static void main(String[] args) {
        // Criando a raiz da árvore com valor 10
        Node raiz = new Node(10);

        // Adicionando nó à esquerda da raiz com valor 5
        raiz.esquerda = new Node(5);

        // Adicionando nó à direita da raiz com valor 15
        raiz.direita = new Node(15);

        // Imprime a árvore em ordem crescente
        System.out.print("Árvore em ordem: ");
        imprimirEmOrdem(raiz);
    }

    // Método para imprimir a árvore em ordem (left, root, right)
    public static void imprimirEmOrdem(Node node) {
        if (node != null) {
            imprimirEmOrdem(node.esquerda);    // visita subárvore esquerda
            System.out.print(node.valor + " "); // visita nó atual
            imprimirEmOrdem(node.direita);     // visita subárvore direita
        }
    }
}
