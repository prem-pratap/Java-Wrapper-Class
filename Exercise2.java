/*Write a program to receive an integer number as a command line argument, and print the binary, octal and hexadecimal equivalent of the given number.*/

public class Exercise2 {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		System.out.println("Given Number :"+i);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(i));
		System.out.println("Octal equivalent :"+Integer.toOctalString(i));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(i));
	}

}
