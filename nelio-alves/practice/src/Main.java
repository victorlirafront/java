import exercises.Exercise_2.Animal;
import exercises.Exercise_2.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog", 2, "Rottweiler");

        dog.fazerSom(); // Saída: Au au!
    }
}