
//MEMORY GAME 
import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;







public class MEMORYGAME {
	
	
	
public static void main(String[] args) {
	
		// we create this random number generator that we're gonna use later
		Random random = new Random();
	
		// we define the scanner
		Scanner in = new Scanner(System.in);
	
		// we create an array of size 7 that we're going to use to store
		// the numbers and also array to store entered numbers
		int[] numbers = new int[7];
		int[] enteredNumbers = new int[8];
	
		// go over every number in the array and assign a random number to it
		for (int i = 0; i < numbers.length; i++) {
			
			// nextInt(n) generates a number from 0 to n-1 so if we want a number from 1 to n, we need to add 1 to
			// that number
			numbers[i] = random.nextInt(5) + 1;
		}
	
		// we go through every number and print it. After every number, we print a space to separate the numbers
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	
		// we use the waiting code from the assignment, and we wait for 3000 milliseconds = 3 seconds
		try {
			Thread.sleep(3000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	
		// we print 50 lines, thus clear the screen
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	
		// this is a cool way to write 1st, 2nd, 3rd, 4th and get the input from the user at the same time
		for (int i = 1; i <= 7; i++) {
			System.out.print("Enter the " + i);
			
			if (i == 1)
				System.out.print("st");
			else if (i == 2)
				System.out.print("nd");
			else if (i == 3)
				System.out.print("rd");
			else
				System.out.print("th");
			
			System.out.print(" digit: ");
			
			// here, we get the input from the user. We store it at index [i - 1] because i will range from
			// 1 to 7 and indices go from 0 to 6 inside the enteredNumbers array.
			enteredNumbers[i - 1] = in.nextInt();
		}
	
		// print the correct numbers
		System.out.print("The correct numbers were: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	
		// print the entered numbers
		System.out.print("Your numbers were: ");
		for (int number : enteredNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	
		// first, we define this integer "correct". It will store how many correct numbers we got.
		int correct = 0;
	
		// then, we loop through all the numbers in enteredNumbers and numbers. We compare each of the numbers
		// and if they're the same, we add 1 to "correct"
		for (int i = 0; i < 7; i++) {
			if (numbers[i] == enteredNumbers[i])
				correct++;
		}
	
		// lastly, we calculate the percentage of the correct numbers
		System.out.println("You got " + (correct / 7.0) * 100 + "% correct!");
	}
	
}

	
	
	
