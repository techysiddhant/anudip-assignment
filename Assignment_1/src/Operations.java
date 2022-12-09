import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initialize numbers
		int num1,num2;
		// initialize operator
		char operator;
		// Taking Input from user
		System.out.print("Enter the First Number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		num2 = sc.nextInt();
		System.out.print("Select Operator from  +,-,%,*,/ ");
		System.out.print("Enter the Operator: ");
		operator = sc.next().charAt(0);
		// call the static method 
		operation(num1,num2,operator);

	}
	// Static method for operations
	public static void operation(int num1,int num2, char operator) {
		// create cases for different operations 
		switch(operator){
			case '+': 
				System.out.println("Addition of Two Numbers is: "+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction of Two Numbers is: "+(num1 - num2));
				break;
			case '*':
				System.out.println("Multiplication of Two Numbers is: "+(num1 * num2));
				break;
			case '/':
				System.out.println("Division of Two Numbers is: "+(num1 / num2));
				break;
			case '%':
				System.out.println("Remainder of Two Numbers is: "+(num1 % num2));
				break;
			default:
				System.out.println("Invalid Operator...");
				break;
		}
	}

}
