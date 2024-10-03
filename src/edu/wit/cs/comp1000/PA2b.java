package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * author @ZackaryWaters
 */
public class PA2b {
	/**
	 * main method starts and runs program; default constructor
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double d = b * b - 4 * a * c; // calculates discriminant 
		
		if (d < 0) {
			System.out.printf("Roots: imaginary%n"); 
		} else if (d == 0) { // provides the single root of there is exactly one
			double root = -b / (2 * a);
			System.out.printf("Root: %.2f%n", root);
		} else { // determines the two roots of the discriminant 
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			
			if (root1 > root2) { // reorders the roots if need be to make sure the least valuable one is printed first
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
		input.close();
	}
}
