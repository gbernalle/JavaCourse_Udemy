package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        Integer lp = sc.nextInt();
        sc.nextLine();

        Employee emp = new Employee();

        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < lp; i++) {
            System.out.println("\nEmployee #"+(i+1)+":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            emp = new Employee(id, name, salario);
            list.add(emp);
        }

        System.out.print("\nEnter the employee id  that will have salary increase : ");
        lp = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the percentage: ");
        Double perc = sc.nextDouble();

        System.out.print("List of  employees: \n");
        for (Employee employee : list) {
            if (employee.getId().equals(lp)) {
                employee.increaseSalary(perc);
            }
            System.out.println(employee.getId()
                + ", "
                + employee.getName()
                + ", "
                + employee.getSalario()
            );
        }
    }
}
