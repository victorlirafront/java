public class Loops {
    public static void main(String[] args){
        int callForLoopResult = callForLoop();
        int callWhileLoopResult = callWhileLoop();
        int callDoWhileLoopResult = callDoWhileLoop();

        System.out.println("forLoopResult " + callForLoopResult);
        System.out.println("callWhileLoop " + callWhileLoopResult);
        System.out.println("callDoWhileLoop " + callDoWhileLoopResult);
    }

    public static int callDoWhileLoop(){
        int result = 0;
        int i = 0;

        do {
            result += i;
            i++;
        }while (i < 5);

        return result;
    }

    public static int callForLoop(){
        int result = 0;
        for(int i = 0; i < 10; i++) {
            result += i;
        }
        return result;
    }

    public static int callWhileLoop() {
        int i = 0;
        int result = 0;
        while (i < 5){
            result += i;
            i++;
        }
        return result;
    }
}