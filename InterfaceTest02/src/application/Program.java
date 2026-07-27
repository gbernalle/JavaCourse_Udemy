package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre os dados do contrato: ");
    System.out.print("Numero: ");
    int number = sc.nextInt();
    
    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    sc.nextLine();

    System.out.print("Valor do contrato: ");
    double totalValue = sc.nextDouble();

    Contract obj = new Contract(number, date, totalValue);
    
    System.out.print("Entre com o numero de parcelas: ");
    int nparc = sc.nextInt();

    ContractService contractService = new ContractService(new PaypalService());
  
    contractService.processContract(obj, nparc);

    System.out.println("Parcelas:");
    for (Installment installment : obj.getInstallment()) {
      System.out.println(installment);
    }

    sc.close();
  }
}
