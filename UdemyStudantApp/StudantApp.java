package UdemyStudantApp;

public class StudantApp {

	public static void main(String[] args) {
		Student stu1= new Student("Jim","52779842;");
		Student stu2= new Student("Elen","22794527;");
		Student stu3= new Student("Yona","21746724;");
		
		stu1.setCity("Natick");
		stu2.setCity("Framingham");
		
		stu1.setPhone("504-778-3298");
		
		stu1.enroll("Math101");
		stu1.enroll("English");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.pay(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}

class Student{
	private static int iD=1000; 
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses;
	private String city;
    private String state;
    private String phone;
	private static final int costOfCourse= 800;
	private int balance=0;
	
	public Student (String name,String ssn){
		this.name=name;
		this.ssn= ssn;
		iD++;
		setUserId();
		setEmail();
	}
		

	private void setEmail() {
		email = name + "@stuuniversity.com";
				System.out.println("YOUR EMAIL IS: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() *((max - min)));
		//randNum = randNum+ min;
		userId= iD + "" + randNum +ssn.substring(6);
		System.out.println("Your User ID Is: " +userId);
	}
	
	public void enroll(String course) {
		this.courses= this.courses +" " + course;
		balance = balance + costOfCourse;
	}
	
	public void pay(int amount) {
		balance= balance - amount;
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $"+ balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String toString() {
		return "\n"+"[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: " + balance + " ]\n[City: " + city + "]";	
	}
	
}