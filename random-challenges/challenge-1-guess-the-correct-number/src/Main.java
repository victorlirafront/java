import entities.Game;
import entities.Player;
import entities.Utils;

import java.util.Random;
import java.util.Scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String playerName = sc.nextLine();

        Player player = new Player(playerName);
        Game game = new Game();

        System.out.println("🎲 Bem-vindo, " + player.getName() + "!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        boolean correct = false;
        while (!correct) {
            int guess = Utils.getValidNumber(sc);
            String result = game.guess(guess);
            System.out.println(result);

            player.incrementAttempts();

            if (guess == game.getSecretNumber()) {
                System.out.println("✅ " + player.getName() + ", você ganhou em " + player.getAttempts() + " tentativas.");
                correct = true;
            }
        }

        sc.close();
    }
}
