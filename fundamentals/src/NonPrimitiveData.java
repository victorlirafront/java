import java.util.ArrayList;

public class NonPrimitiveData {
    public static void main(String[] args) {
        // 🧵 1. String
        String name = "Victor";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Starts with V? " + name.startsWith("V"));

        // 🧩 2. Array
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 👤 3. Classe personalizada
        Person person = new Person("Victor", 25);
        person.sayHello();

        // 📚 4. ArrayList
        ArrayList<String> cities = new ArrayList<>();
        cities.add("São Paulo");
        cities.add("Rio de Janeiro");
        cities.add("Curitiba");

        for (String city : cities) {
            System.out.println("City: " + city);
        }

        // ⚙️ 5. Interface + classe que implementa
        Animal dog = new Dog();
        dog.makeSound();
    }
}

// 👤 Classe Person
class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

// ⚙️ Interface + Implementação
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}