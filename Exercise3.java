/*Write a Java program that reads an integer number (between 1 and 255) from the user and prints the binary representation of the number. The answer should be printed as a String.

Note: The output displayed should contain 8 digits and should be padded with leading 0s(zeros), in case the returned String contains less than 8 characters.
*/
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 1 and 255");
		int num=sc.nextInt();
		/*The output displayed should contain 8 digits and should be padded with leading 0s(zeros), 
		in case the returned String contains less than 8 characters*/
		String result=String.format("%8s", Integer.toBinaryString(num)).replace(' ','0');
		System.out.println(result);
		

	}

}
