package exercises.Exercise_2;

public class Dog extends Animal {
    private String raca; // propriedade própria da subclasse

    public Dog(String nome, int idade, String raca) {
        super(nome, idade); // chama o construtor da superclasse
        this.raca = raca;   // inicializa a propriedade própria
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}