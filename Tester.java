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
    //Testing withdraw()
    first_account.withdraw(3.0);
    System.out.println(first_account.getBalance());
    first_account.withdraw(12.0);
    System.out.println(first_account.getBalance());
    first_account.withdraw(-3.0);
    System.out.println(first_account.getBalance());
    //Testing toString()
    System.out.println(first_account.toString());
    /*Testing authenticate()
    System.out.println(first_account.authenticate("Hello!"));
    System.out.println(first_account.authenticate("World"));
    */
    BankAccount second_one = new BankAccount(264, "Hi!");
    //Testing transferTo()
    System.out.println(second_one.getBalance());
    first_account.transferTo(second_one, 4.0, "Hello!");
    System.out.println(second_one.getBalance());
    first_account.transferTo(second_one, 4.0, "Hey");
    System.out.println(second_one.getBalance());
    first_account.transferTo(second_one, 6.0, "Hello!");
    System.out.println(second_one.getBalance());
    first_account.transferTo(second_one, 5.0, "Hello!");
    System.out.println(second_one.getBalance());
  }

}
