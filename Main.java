/**
 * This program tests the BankAccount class and its subclasses.
 */
public class Main {
  public static void main(String[] args) {
    SavingsAccount momsSavings = new SavingsAccount(0.5);

    CheckingAccount harrysChecking = new CheckingAccount(100);
    SavingsAccount amazonMoney = new SavingsAccount(0.6);
    CheckingAccount noMoney = new CheckingAccount(500);
    amazonMoney.deposit(420);
    noMoney.deposit(69);
    System.out.println("amazon money: " + amazonMoney.getBalance());
    System.out.println("broke account money: " + noMoney.getBalance());

    momsSavings.deposit(10000);

    momsSavings.transfer(2000, harrysChecking);
    harrysChecking.withdraw(1500);
    harrysChecking.withdraw(80);

    momsSavings.transfer(1000, harrysChecking);
    harrysChecking.withdraw(400);

    // Simulate end of month
    momsSavings.addInterest();
    harrysChecking.deductFees();

    System.out.println("Mom's savings balance: " + momsSavings.getBalance());
    System.out.println("Expected: 7035");

    System.out.println("Harry's checking balance: " + harrysChecking.getBalance());
    System.out.println("Expected: 1116");
  }
}
