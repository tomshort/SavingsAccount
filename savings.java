public class SavingsAccount {
  
  int balance;
  String name;
  
  public SavingsAccount(int initialBalance, String accountHolder){
    balance = initialBalance;
    name = accountHolder;
  }

  // check balance method
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }

  // deposit method
  public void deposit(int amountToDeposit) {
    int newBalance = balance + amountToDeposit;
    balance = newBalance;
    System.out.println("You just deposited " + amountToDeposit);
  }

  // withdraw method
  public int withdraw(int amountToWithdraw) {
    int newBalance = balance - amountToWithdraw;
    balance = newBalance;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000, "Thomas R Short");
    
    savings.deposit(850);
    savings.checkBalance();
    savings.withdraw(322);
    savings.checkBalance();
    
    System.out.println(savings);
  }   

  // Added functionality with toString()
  public String toString() {
    return "The account holder is " + name + " and the current balance is $" + balance;
  }
  

}