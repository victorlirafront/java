package exercises.Exercise_3;

import java.util.Locale;
import java.util.Scanner;

public class Vector3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar ?");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero:");
            vet[i] = sc.nextInt();
        }

        System.out.println("Números negativos");

        for(int i = 0; i < n; i++){
            if(vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
