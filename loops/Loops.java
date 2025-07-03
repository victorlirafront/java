public class Loops {
    public static void main(String[] args){
        int forLoopResult = callForLoop();

        System.out.println(forLoopResult);
    }

    public static int callForLoop(){
        int result = 0;

        for(int i = 0; i < 10; i++) {
            result += i;
        }

        return result;
    }
}