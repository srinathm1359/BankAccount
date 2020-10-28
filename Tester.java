public class Tester {
  public static void main(String[] args) {
    //Testing getBalance() and getAccountID()
    BankAccount first_account = new BankAccount(123, "Hello!");
    System.out.println(first_account.getBalance());
    System.out.println(first_account.getAccountID());
    //Testing deposit()
    first_account.deposit(12.0);
    System.out.println(first_account.getBalance());
    first_account.deposit(0.0);
    System.out.println(first_account.getBalance());
    first_account.deposit(-3.0);
    System.out.println(first_account.getBalance());
  }

}
