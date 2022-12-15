
public class Main {
	public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("sid",22,"7078804029","New Ashok Nagar",554588.9,"IT");
		// instance of Manager class
		Manager mng = new Manager("Siddhant",25,"9599009900","New Delhi",887799.99,"Marketing");
		
		System.out.println("Employee Details: ");
		// now print the Employee Details
		emp.showDetails();
		emp.getSpecialization();
		emp.printSalary();
		System.out.println("Manager Details: ");
		// now print the Manager Details
		mng.showDetails();
		mng.getDepartment();
		mng.printSalary();
	}
}
