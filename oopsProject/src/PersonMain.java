public class PersonMain {
	public static void main(String[] args) {
		// subject array
		String []sub = new String[3];
		sub[0]="C";
		sub[1]="C++";
		sub[2]="Java Script";
		// instance of student class
		Student s1 = new Student("Siddhant",22,"7078804029",105,sub);
		Student s2 = new Student("Alok",22,"9099898990",001,sub);
		// print the student details
		System.out.println(s1);
		// print the student details
		System.out.println(s2);
		
	}
}