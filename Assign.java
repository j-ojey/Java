package inheritance;
import java.util.*;

	  class BankAccount {
	   int acNo;
	   static String acName;
	   String acPhone;
	   String acEmail;
	   double AcBal;

	   
	   public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
	     this.acNo = acNo;
	     this.acName = acName;
	     this.acPhone = acPhone;
	     this.acEmail = acEmail;
	     this.AcBal = AcBal;
	   }
	   
	   public void accountholder() {
		     System.out.println("Account Number: " + acNo);
		     System.out.println("Account Holder Name: " + acName);
		     System.out.println("Account Holder Address: " +acPhone );
		     System.out.println("Account Holder Phone: " + acEmail);
		     System.out.println("Account Holder Balance: " + AcBal);
		   }

		   public void deposit(double amount) {
		     AcBal += amount;
		     System.out.println("Deposited: $" + amount);
		   }

		   public void displayBalance() {
		     System.out.println("Account Holder Address: " + acPhone);
		     System.out.println("Account Number: " + acNo + "  Balance: $" + AcBal);
		   }
		 }

		 class SavingsAccount extends BankAccount {
		   public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
		     super(acNo, acName, acPhone, acEmail, AcBal);
		   }
		 }
		 
		 class CurrentAccount extends BankAccount {
			 public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal ) {
				 super(acNo, acName, acPhone, acEmail, AcBal);
			 }
		 }

public class Assign {

	public static void main(String[] args) {
		System.out.println("");
	      System.out.println("");
	      System.out.println("SAVINGS ACCOUNT DETAILS");
	      SavingsAccount sac = new SavingsAccount(1001, "Ann Kamau", "0720000000", "test@gmail.com", 1000);
	      sac.accountholder();
	      sac.deposit(500);
	      sac.displayBalance();
	      System.out.println("");
	      System.out.println("");
	      
	      System.out.println("");
	      System.out.println("");
	      System.out.println("CURRENT ACCOUNT DETAILS");
	      System.out.println("------------------------");
	      CurrentAccount acc = new CurrentAccount(1002, "Brenda Latisha", "0754636389", "brendalatish@gmail.com", 300);
	      acc.accountholder();
	      acc.deposit(300);
	      acc.displayBalance();
	      

		

	}

}
