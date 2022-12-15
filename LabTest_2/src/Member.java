
public class Member {
	// Data member
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;
	// parameterized Constructor
	public Member(String name,int age,String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	// method for print salary
	public void printSalary() {
		System.out.println("Salary is "+ salary);
	}
	public void showDetails() {
		
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Phone Number is "+ phoneNumber);
		System.out.println("Address is "+ address);
	}
}
