import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        addElements(deque);
        removeElements(deque);
        loopThroughArray(deque);
    }

    public static void removeElements(Deque<String> deque){
       String firstRemovedElement = deque.pollFirst();

       System.out.println("firstRemovedElement " + firstRemovedElement);
    }

    public static void addElements(Deque<String> deque){
        deque.addFirst("A");
        deque.addLast("B");
    }


    public static void loopThroughArray(Deque<String> deque) {
        for (String item : deque) {
            System.out.println(item);
        }
    }
}
