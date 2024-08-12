package singletonDP;


public class Banking {
	private static Banking instance =null;
	private static double balance=0.0;
	 private Banking() {}
	 
	 public static Banking getInstance() {
		 if(instance==null) {
			 instance=new Banking();
		 }
		 return instance;
	 }
	 public double viewBalance() {
		 return balance;
	 }
	 public void Deposit(double money) {
		 balance+=money;
		 System.out.println("Money successfully added. Current balnce:"+balance);
	 }
	 public void Withdraw (double money) {
		 balance-=money;
		 System.out.println("Money successfully With drawn. Current balnce:"+balance);
	 }
}