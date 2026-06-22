/*
 * Outra forma de fazer isso (Versão 25) é apagando tudo e colocar:
 * void main(){
 *  IO.println()
 * }
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        exercicio04();
    }

    private static void exercicio01() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n", product1, price1,
                product2,
                price2);

        System.out.printf("\nRecord: %d years old, code %d and gender: %s\n", age, code, gender);

        System.out.printf(
                "\nMeasue with eight decimal places: %.8f\nRouded (three decimal places): %.3f\nUS decimal point %.3f\n",
                measure,
                measure, measure);
    }

    public static void exercicio02() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // Mudar se caso der erro por "," ou "." em caso de ponto flutuante

        System.out.println("Digite um numero");
        int numero = sc.nextInt();
        sc.nextLine(); // Tem que colocar, se não, o próximo captura a quebra de linha
        String val = sc.nextLine();

        System.out.printf("Valor mult por 2: " + numero * 2 + " %s ", val);
    }
    
    public static void exercicio03() {
        Scanner sc = new Scanner(System.in);

        int qtd_minutos = sc.nextInt();
        sc.nextLine();

        if (qtd_minutos < 100)
            System.err.println("Valor a pagar: R$ 50.00");
        else {
            double val_final = ((qtd_minutos - 100) * 2) + 50.00;
            System.out.printf("Valor a pagar: " + val_final + "\n");
        }
        
        sc.close();
    }

    public static void exercicio04() {
        String original = "abcde FGHIJ ABC abc DEFG    ";
    
        System.out.printf(original.toLowerCase());
        System.out.println(original.toUpperCase());
        System.out.println(original.trim() + "-"); //Tira espaços nas bordas
        System.out.println(original.substring(2, 9)); //Nova String mantendo apenas um trecho posicao 2 até 9
        String[] vect = original.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
    

}