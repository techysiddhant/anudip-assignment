import java.util.Arrays;

public class Student extends Person{
	// static variable
	static final String institute="UCER";
	long roll;
	String []subjects;																											
	
	//parameterized constructor
	 Student(String name, int age, String phone,long roll, String []subjects){
		 super(name,age,phone);
		
		this.roll = roll;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + " Institute :"+ institute+ ", subjects=" + Arrays.toString(subjects) + ", name=" + name + ", age=" + age
				+ ", phone=" + phone + "]";
	}

	

	
	
}