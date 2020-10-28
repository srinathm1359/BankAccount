public class Tester {
  public static void main(String[] args) {
    //Testing getBalance() and getAccountID()
    BankAccount first_account = new BankAccount(123, "Hello!");
    System.out.println(first_account.getBalance());
    System.out.println(first_account.getAccountID());
  }

}
