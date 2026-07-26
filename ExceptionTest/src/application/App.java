package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
    
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException arrExp) {
            System.out.println("Invalid position! ");
        } catch (InputMismatchException inpMisExp) {
            System.out.println("Not a number! ");
            //inpMisExp.printStackTrace();
        }

        System.out.println("End of program");
        
        sc.close();   
    }
}
