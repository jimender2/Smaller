import java.util.Scanner;

/**
 * 
 * @author Jonathan Meredith
 * This program gets two numbers from a user and tells which one is smaller
 */

public class Smaller {

	public static void main(String[] args) {
		
		//Declare Variables
		float num1,
			num2;
		
		//Open scanner
		Scanner scan = new Scanner(System.in);
		
		//Get numbers from the user
		num1 = getNumber(scan);
		num2 = getNumber(scan);
		
		//Close Scanner
		scan.close();
		
		//Compare the two numbers
		smaller(num1, num2);
	}
	
	/**
	 * 
	 * @param scan This passes the scanner method to the getNumber method
	 * @return number This returns the number that we got from the user to the
	 * main method
	 */
	
	public static float getNumber(Scanner scan) {
		//Declare variable
		float number = 1;
		
		//Get number
		System.out.println("Enter a number:");
		number = scan.nextFloat();
		
		//Send back to main
		return number;
	}
	
	/**
	 * 
	 * @param a This is the first number that we got from the user
	 * @param b This is the second number that we got from the user
	 */
	
	public static void smaller(float a, float b) {
		
		//Compare the two numbers
		if (a>b) {
			System.out.println("The smaller number is " + b);
		} else if (a<b) {
			System.out.println("The smaller number is " + a);
		} else if (a==b) {
			System.out.println("The two numbers are equal");
		} else {
			System.out.println("Error");
		}
	}
}
