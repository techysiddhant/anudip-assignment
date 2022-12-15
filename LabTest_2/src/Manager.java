
public class Manager extends Member {
	private String department;
	// parameterized Constructor
	public Manager(String name,int age,String phoneNumber, String address, double salary, String department) {
		// accessing Member class members
		super(name,age,phoneNumber,address,salary);
		this.department = department;
	}
	// method for print department
	public void getDepartment() {
		System.out.println("Department is "+ department);
	}
}
