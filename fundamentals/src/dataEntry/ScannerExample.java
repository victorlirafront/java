package dataEntry;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double price;

        System.out.print("Digite seu nome: ");
        name = sc.next(); // ou nextLine() se quiser nome completo

        System.out.print("Digite sua idade: ");
        age = sc.nextInt();

        System.out.print("Digite o preço: ");
        price = sc.nextDouble();

        System.out.println("\nNome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Preço: " + price);

        sc.close();
    }
}
