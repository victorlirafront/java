package exercises;

public class CalculateTheAverage {
    public static void main(String[] args) {
        // 🔹 Substituindo a entrada do usuário por valores fixos:
        double notaPortugues = 7.5;
        double notaMatematica = 6.0;
        double notaFilosofia = 8.25;

        double media = calcularMedia(notaPortugues, notaMatematica, notaFilosofia);

        // System.out.printf("Média = %.2f%n", media); imprime a média com duas casas decimais.
        // %.2f formata o número e %n adiciona uma quebra de linha.
        System.out.printf("Média = %.2f%n", media);
        System.out.println(media >= 5 ? "Aprovado" : "Reprovado");
    }

    // double... notas permite passar vários double separados por vírgula, como se fosse um array.
    private static double calcularMedia(double... notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
