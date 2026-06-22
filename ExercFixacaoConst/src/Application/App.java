package Application;

import java.util.Scanner;

import Account.Account;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char decision = sc.next().charAt(0);

        if (decision == 'y') {
            System.out.print("Enter initial deposit value: ");
            ac = new Account(number, holder, sc.nextDouble());
        } else ac = new Account(number, holder);

        System.out.println("Account data:");
        System.out.print(ac.getData() + "\n");

        System.out.print("Enter a deposit value: ");
        ac.deposit(sc.nextDouble());
        System.out.print("Updated account data: ");
        System.out.print(ac.getData() + "\n");

        System.out.print("Enter a withdraw value: ");
        ac.withdrawValue(sc.nextDouble());
        System.out.print(ac.getData() + "\n");

        sc.close();
    }
}
