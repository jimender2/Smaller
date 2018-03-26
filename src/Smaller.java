import java.util.Scanner;

/**
 * 
 * @author Jonathan Meredith
 * This program gets two numbers from a user and 
 */

public class Smaller {

	public static void main(String[] args) {
		float num1,
			num2;
		
		Scanner scan = new Scanner(System.in);
		
		num1=getNumber(scan);
		num2=getNumber(scan);
		
		scan.close();
		
		smaller(num1, num2);
	}
	
	/**
	 * 
	 * @param scan This passes the scanner method to the getNumber method
	 * @return number This returns the number that we got from the user to the
	 * main method
	 */
	
	public static float getNumber(Scanner scan) {
		float number = 1;
		System.out.println("Enter a number");
		number = scan.nextFloat();
		return number;
	}
	
	/**
	 * 
	 * @param a This is the first number that we got from the user
	 * @param b This is the second number that we got from the user
	 */
	
	public static void smaller(float a, float b) {
		if (a>b) {
			System.out.println("the smaller number is " + b);
		} else if (a<b) {
			System.out.println("the smaller number is " + a);
		} else if (a==b) {
			System.out.println("The two numbers are equal");
		} else {
			System.out.println("Error");
		}
	}
}
