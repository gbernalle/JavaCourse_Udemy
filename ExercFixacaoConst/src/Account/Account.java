package Account;

public class Account {
  private int accountNumber;
  private String accountHolder;
  private double accountValue;

  public Account() {

  }

  public Account(int accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
  }
  
  public Account(int accountNumber, String accountHolder, double initialDeposit) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    deposit(initialDeposit);
  }

  public int getNumber() {
    return this.accountNumber;
  }

  public String getHolder() {
    return this.accountHolder;
  }

  public void setHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public double getValue() {
    return this.accountValue;
  }

  public void deposit(double accountValue) {
    this.accountValue += accountValue;
  }

  public void withdrawValue(double withdrawValue) {
    System.out.println("Updated account data:");
    this.accountValue -= withdrawValue + 5.0;
  }

  public String getData() {
    return "Account "
        + this.accountNumber
        +", Holder: "
        + this.accountHolder
        +", Balance: $ "
        + String.format("%.2f", getValue())
        + "\n";
  }

}
