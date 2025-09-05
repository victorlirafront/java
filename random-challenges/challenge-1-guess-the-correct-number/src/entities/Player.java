package entities;

public class Player {
    private final String name;
    private int attempts;

    public Player(String name) {
        this.name = name;
        this.attempts = 0;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void incrementAttempts() {
        this.attempts++;
    }
}