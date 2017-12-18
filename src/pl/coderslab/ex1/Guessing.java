package pl.coderslab.ex1;

import java.util.Random;
import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int number = rand.nextInt(100) + 1;

		int guess = getInt("Guess a number between 1 and 100");

		while (number != guess) {
			if (guess < number) {
				System.out.println("Too low");
			} else {
				System.out.println("Too much");
			}
			guess = getInt("Try again");
		}


		System.out.println("You have guessed!");
	}

	public static int getInt(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		while(!scan.hasNextInt()) {
			System.out.println("It should be a number!");
			scan.next(); }
		return scan.nextInt();
	}
}