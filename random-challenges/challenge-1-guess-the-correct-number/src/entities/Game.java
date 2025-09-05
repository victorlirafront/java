package entities;

import java.util.Random;


import java.util.Random;

public class Game {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private final int secretNumber;

    public Game() {
        Random random = new Random();
        this.secretNumber = random.nextInt(MAX) + MIN; // 1 a 100
    }

    public String guess(int number) {
        if (number == secretNumber) {
            return "🎉 Parabéns! Você acertou!";
        } else if (number < secretNumber) {
            return "O número é MAIOR!";
        } else {
            return "O número é MENOR!";
        }
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
