package entities;

public class Employee {
  private Integer id;
  private String name;
  private Double salario;

  public Employee() {
    
  }

  public Employee(int id, String name, double salario) {
    this.id = id;
    this.name = name;
    this.salario = salario;
  }
  
  public Integer getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalario() {
    return salario;
  }

  public void increaseSalary(double perc) {
    salario += ((salario * perc)/100); 
  }

}
