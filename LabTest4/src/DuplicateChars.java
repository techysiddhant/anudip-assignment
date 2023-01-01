import java.util.Scanner;

public class DuplicateChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declare string variable
		String str1;
		// declare count variable
		int cnt;
		System.out.print("Enter The String : ");
		// taking use input as string
		str1=sc.nextLine();
		// convert string into character array
		char str[] = str1.toCharArray();
		// count the character
		for(int i=0; i< str.length; i++) {
			// set count
			cnt=1;
			for(int j=i+1; j< str.length; j++) {
				// check the duplicate character
				if(str[i]== str[j]&& str[i]!=' ') {
					cnt++;
					// set visited character to 0 for visited character
					str[j]='0';
				}
			}
			if(cnt >1 && str[i]!='0') {
				System.out.println("Duplicate Charcater in a String : "+str[i]);
			}
		}
		

	}

}
