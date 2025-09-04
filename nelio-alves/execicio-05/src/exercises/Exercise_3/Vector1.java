package exercises.Exercise_3;

import java.util.Locale;
import java.util.Scanner;

public class Vector1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas alturas deseja inserir? ");
        int n = scanner.nextInt();

        double[] heights = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a altura #%d: ", i + 1);
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double average = sum / n;
        System.out.printf("Média das alturas: %.2f%n", average);

        scanner.close();
    }
}
