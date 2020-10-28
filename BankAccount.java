public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountNumber, String pass) {
    accountID = accountNumber;
    password = pass;
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String pass) {
    password = pass;
  }

  public boolean deposit(double amount) {
    if (amount < 0) {
      return false;
    } else {
      balance += amount;
      return true;
    }

  }
}
