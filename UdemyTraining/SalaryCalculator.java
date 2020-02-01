package UdemyTraining;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Lets create a variable to define our career
		
		
		// Declare a variable
		String career;
		System.out.println("progrem is starting");
		
		//Defined a variable
		career= "Softwere Developer ";
		System.out.println("my careeer is: " +career);
		
		//Declare and defined
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.5;
		
		double salary = hoursPerWeek*weeksPerYear*rate;
		System.out.println("my salary as a "+career+ "at the rate of $ "+ rate+ " per hour is $ "+ salary+ " per year");
		 
		//computer our annual salary
		//rate*hoursPerWeek*weeksPerYear
	}

}
