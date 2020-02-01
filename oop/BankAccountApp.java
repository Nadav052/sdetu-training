package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating new bank account 
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "6543219";
		acc1.setName("Roger huge");
		System.out.println(acc1.getName());
		acc1.setSsn("66338944");
		System.out.println("SSN: "+ acc1.getSsn());
		//acc1.name= " Roger huge";
		acc1.balance= 6000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1875);
		acc1.deposit(1875);
		acc1.deposit(1875);
        acc1.withdrew(2593);
		
		
		System.out.println(acc1.toString());
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "6543218";
		
		BankAccount acc3;
		acc3 = new BankAccount("Saving Acoount",999);
		
		if ( acc3.balance == 0.0 ) {
			//failed
		}
		
		acc3.accountNumber = "6543217";
		acc3.checkBalance();
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance= 1500;
		cd1.name= "Ariel Bigost";
		cd1.accountNumber= "1472955";
		cd1.accountType= "CD Account";
		
		
		
		System.out.println(cd1.toString());
		*/
		
	}
	
	

}
