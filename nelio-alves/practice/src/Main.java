import exercises.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Victor", 28, "172.398.000-00");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getCpf());
    }
}