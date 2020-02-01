package UdemyTraining;

public class FactorialApp {

	public static void main(String[] args) {

//Create Factorial number
		System.out.println(factorial(7));
	}
public static int factorial(int n) {
	if (n==0) {
	return 1;
}
else if (n==1) {
return 1;

}
	System.out.println(n);
	return factorial (n-1)*n;
	
}

}

