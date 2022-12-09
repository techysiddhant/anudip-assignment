
public class OddNumbers {

	public static void main(String[] args) {
		int num=20;
		// pass the number and call the method
		OddNum(num);

	}
	// Static method for printing Odd Numbers
	public static void OddNum(int n) {
		
		for(int i=1; i<=n;i++) {
			
			//Logic for odd number, Checking if the number is odd or Not
			if(i%2 !=0) {
				//Printing the odd number
				System.out.print(i+",");
			}
		}
	}

}
