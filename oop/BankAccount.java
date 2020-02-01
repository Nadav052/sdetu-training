package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	//belong to the class not tpo the object
	private static final String routingNumber= "889966";
	//Instance Variable
	private String name;
	private String Ssn;
	String accountType;
	double balance = 0;
			
	//Constructor definition: unique methods
	  //1. They are used to define /setup/initialize properties of an object
	  //2.Constructor are IMPLICITLY called upon instantiation
	  //3. The same name as the class itself
	  //4. constructor have no return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED ");
	}
	//OVERLOADING: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) /*throws Exception*/ {
		//initDeposit, accountType,Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		String Msg;				
		if (initDeposit<1000) {
		    Msg= "ERROR: Minimum deposit must be at lest $1,000";
		    //throw new Exception(Msg);
		} else {
			System.out.println( "INITIAL DEPOSIT OF: $" + initDeposit);
			Msg = "Thanks for your initial deposit of: $"+ initDeposit;
			balance= balance+ initDeposit;
		}
		System.out.println(Msg);
		
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}

	public String getSsn() {
		return Ssn;
	}
	public void setSsn(String ssn) {
		Ssn = ssn;
	}
	//Interface methods
	public void setRate(){
		System.out.println("SETTING RATE");
		
	}
	public void increaseRate(){
		System.out.println("INCREASING RATE");
		
	}
	
	
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	void withdrew(double amount) {
		balance = balance- amount;
		showActivity("Withdrew");
	}
	private void showActivity (String activity){
		System.out.println("YOUR RECENT TRANSECTION: "+ activity);
		System.out.println("YOUR NEW BALANCE IS: $"+ balance);
	}
	void checkBalance() {
		System.out.println("Your Balance is: " + balance);
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[Name: " + name + ".Account Number: " + accountNumber +".Routing Number: "+ routingNumber + ".Balance: $" + balance + "]";
	}
}
