
public class Main {
	public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("sid",22,"7078804029","New Ashok Nagar",554588.9,"IT");
		// instance of Manager class
		Manager mng = new Manager("Siddhant",25,"9599009900","New Delhi",887799.99,"Marketing");
		// now print the salary
		emp.printSalary();
		mng.printSalary();
	}
}
