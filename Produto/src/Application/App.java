package Application;

import java.util.Scanner;

import Product.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        int qtd = sc.nextInt();
        
        Product prod = new Product(name, price, qtd);
        System.out.println("Product data: " + prod);
        
        System.out.println("Enter the number of products to be added in stock: ");
        qtd = sc.nextInt();
        prod.addProducts(qtd);

        System.out.println("Updated data: " + prod);

        System.out.println("Enter the number of products to be removed from stock: ");
        qtd = sc.nextInt();
        prod.removeProducts(qtd);
        
        System.out.println("Updated data: " + prod);

        System.out.println(prod.getName());
        sc.close();        
    }
}
