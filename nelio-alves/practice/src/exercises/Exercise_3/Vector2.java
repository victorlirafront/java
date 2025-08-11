package exercises.Exercise_3;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vector2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i ++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        scanner.close();
    }
}
