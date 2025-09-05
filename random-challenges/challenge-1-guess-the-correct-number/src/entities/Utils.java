package entities;
import java.util.Scanner;

public class Utils {
    public static int getValidNumber(Scanner sc) {
        while (true) {
            System.out.print("Seu palpite: ");
            if (sc.hasNextInt()) {
                int guess = sc.nextInt();
                if (guess >= 1 && guess <= 100) {
                    return guess;
                } else {
                    System.out.println("⚠ Número inválido! Digite entre 1 e 100.");
                }
            } else {
                System.out.println("⚠ Entrada inválida! Digite apenas números.");
                sc.next(); // descarta entrada inválida
            }
        }
    }
}