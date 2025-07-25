import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String account = scanner.nextLine();

        System.out.print("Enter the account holder: ");
        String userName = scanner.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String response = scanner.next();
        boolean hasInitialValue = response.equalsIgnoreCase("y");
        
        double balance = 0;


        if(hasInitialValue) {
            System.out.println("Enter initial deposit value:");
            balance += scanner.nextInt();
        }

        //Step 2
        System.out.println("Account Data:");
        System.out.printf("Account %2s, holder: %2s, Balance: $ %2.2f", account, userName, balance);


        scanner.close();
    }
}