package singletonDP;
public class Main {
public static void main(String[] args) {
  Banking user=Banking.getInstance();
  user.viewBalance();
  user.Deposit(1500.0);
  user.Withdraw(455.98);
}
}
