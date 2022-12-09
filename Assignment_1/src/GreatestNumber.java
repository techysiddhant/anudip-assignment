import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initialize variable
		int num1,num2,num3;
		// taking input from user
		System.out.print("Enter the First Number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		num2 = sc.nextInt();
		System.out.print("Enter the Third Number: ");
		num3 = sc.nextInt();
		// call the static method
		greatestNum(num1,num2,num3);

	}
	// static method for Greatest Number
	public static void greatestNum(int num1,int num2, int num3) {
		// check the number is greatest or not
		// number1 is greater than number2 then, check
		if(num1>num2) {
			//check number 1 is greater then number3, if yes then print
			if(num1>num3) {
				
				System.out.println("Greatest Number is = "+ num1);
			}
			// else number 3 is greater
			else {
				System.out.println("Greatest Number is = "+ num3);
			}
			
		}
		// number 2 is greater then check for number3
		else {
			
			if(num2>num3) {
				System.out.println("Greatest Number is = "+ num2);
			}else {
				System.out.println("Greatest Number is = "+ num3);
			}
		}
	}

}
