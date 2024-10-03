package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * author @ZackaryWaters
 */
public class PA2a {
/**
 * starts and runs programs default constructor
 * @param args
 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/**
		 * Variable declaration including array
		 */
		int[] numbers = new int[5]; 
		int sumPos = 0, sumNeg = 0, sumAll = 0;
		int countPos = 0, countNeg = 0;
		
		System.out.printf("Enter five whole numbers: ");
		for (int i = 0; i < 5; i++) { //for loop iterates through numbers provided and adds to array
			numbers[i] = input.nextInt();
			sumAll += numbers[i]; // adds to the sumAll variable
			if (numbers[i] > 0) { // determines if number is positive and add to sumPos and increments countPos
				sumPos += numbers[i];
				countPos++;
			} else if (numbers[i] <= 0) { // determines if number is negative and adds to sumNeg and increments countNeg
				sumNeg += numbers[i];
				countNeg++;
			}
		}
		
		double avgPos = countPos > 0 ? (double) sumPos/countPos : 0; // determines if countPos is greater than 0 if it is then casts double to the avg calulation
		double avgNeg = countNeg > 0 ? (double) sumNeg/countNeg : 0; // determines if countNeg is greater than 0 if it is then casts double to the avg calulation
		double avgAll = (double) sumAll/5; // casts double for avgAll
		
		if(countPos==1) {
			System.out.printf("The sum of the %d positive number: %d%n", countPos, sumPos);

		} else {
			System.out.printf("The sum of the %d positive numbers: %d%n", countPos, sumPos);

		}
		if(countNeg == 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", countNeg, sumNeg);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", countNeg, sumNeg);
		}
		
		System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
		
		if(countPos==1) {
			System.out.printf("The average of the %d positive number: %.2f%n", countPos, avgPos);
		} else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", countPos, avgPos);
		}
		
		if(countNeg == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", countNeg, avgNeg);
		} else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", countNeg, avgNeg);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
		
		input.close();
	}
}