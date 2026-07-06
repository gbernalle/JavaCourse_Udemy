package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] prod = new Product[n];

        for (int i = 0; i < prod.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            prod[i] = new Product(name, price);
        }

        double sum = 0; 
        for (int i = 0; i < prod.length; i++) {
            sum += prod[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("Average price = %.2f%n",avg);

        sc.close();
    }
}
