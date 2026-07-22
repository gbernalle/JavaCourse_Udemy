package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Account acc = new Account(1001, "Alex",0.0 ); // Funciona, é só para não dar warnings
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        
        // Upcasting

        Account acc1 = bacc;
        System.out.println(acc1.getBalance()); // Isso é possível por conta do conceito de herança ("É um")

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // Downcasting

        // BusinessAccount acc4 = acc2; // Deu ruim (sem casting) porque por mais que extende,
        // não é possível saber se é um.

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);
        
        //BusinessAccount acc5 = (BusinessAccount) acc3; // Deu ruim porque acc3 na verdade é uma SavingsAccount

        // Para resolver isso, utiliza instanceof
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100);
            System.out.println("Empréstimo feito");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account sobreTest1 = new Account(1006, "Sandro", 1000.0);
        sobreTest1.withdraw(200.0);
        System.out.println(sobreTest1.getBalance());

        Account sobreTest2 = new SavingsAccount(1007, "Shiely", 1000.0, 0.01);
        sobreTest2.withdraw(200.0);
        System.out.println(sobreTest2.getBalance());

        Account sobreTest3 = new BusinessAccount(1008, "Jaspion", 1000.0, 500.0);
        sobreTest3.withdraw(200.0);
        System.out.println(sobreTest3.getBalance());
    }
}
