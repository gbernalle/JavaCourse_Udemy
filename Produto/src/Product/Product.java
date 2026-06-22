package Product;

public class Product {
  
  private String name;
  private double price;
  private int qtd;

  public Product() { // Construtor padrão
    
  }

  public Product(String name, double price, int qtd) {
    this.name = name;
    this.price = price;
    this.qtd = qtd;
  }

  public Product(String name, double price) { // Só para testar sobrecarga de método
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQtd() {
    return this.qtd;
  }

  public double totalValueInStock() {
    return price * qtd;
  }

  public void addProducts(int qtd) {
    this.qtd += qtd;
  }

  public void removeProducts(int qtd) {
    this.qtd -= qtd;
  }


  public String toString() {
    return name + ", $ "
     + String.format("%.2f", price)
     + ", "
     + qtd
     + " units, Total: $ "
     + String.format("%.2f", totalValueInStock());
  }

}
