import java.util.Scanner;
public class MaskChars {
	public static void main(String[] args) {
	
		  Scanner sc = new Scanner(System.in);
		  //taking user input
	        System.out.println("Enter the string ");
	        String inputString = sc.nextLine();
	         
	        if(inputString.length() > 4) {
	            String allExceptLast4 = inputString.substring(0, inputString.length()-4);
	            String repeatString ="X".repeat(allExceptLast4.length());
	            repeatString +=  inputString.substring(inputString.length()-4);
	            System.out.println(repeatString);
	        }
	}

}
		



