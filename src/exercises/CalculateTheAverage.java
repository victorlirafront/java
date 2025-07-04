package exercises;

import java.util.Scanner;

public class CalculateTheAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaPortugues = lerNota(scanner, "Português");
        double notaMatematica = lerNota(scanner, "Matemática");
        double notaFilosofia = lerNota(scanner, "Filosofia");

        double media = calcularMedia(notaPortugues, notaMatematica, notaFilosofia);

        System.out.printf("Média = %.2f%n", media);
        System.out.println(media >= 5 ? "Aprovado" : "Reprovado");
    }

    private static double lerNota(Scanner scanner, String materia) {
        System.out.print("Digite a nota de " + materia + ": ");
        String entrada = scanner.next().replace(",", ".");
        return Double.parseDouble(entrada);
    }

    private static double calcularMedia(double... notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
