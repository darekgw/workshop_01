package pl.coderslab.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) {
		
		int amount = 6;
		int range = 49;
		
		System.out.println("Choose " + amount + " numbers out of " + range + ".");
		
		List<Integer> chosenNumbers = new ArrayList<>();
		
		while(true) {
		int number = draw("Choose number");
		if (number >0 && number <= range) {
			
			if(chosenNumbers.size() == 0) {
				System.out.println("Number was added");
				chosenNumbers.add(number);
			} else {
			
			for(int i = 0; i < chosenNumbers.size(); i++) {
				if( chosenNumbers.get(i) == number) {
					System.out.println("You have already chosen this number.");
					break;
				} else { System.out.println("Number was added");
					chosenNumbers.add(number);
					break;
				}
			}
			}
			
		} else {
			System.out.println("You should choose number from 1 to " + range);
		}
		
		
		if(chosenNumbers.size() == amount) {
			break;
		}
		}
		
		Collections.sort(chosenNumbers);
		
		System.out.println("You have chosen following numbers: " + chosenNumbers.toString());
		
		List<Integer> numbersToDrow = new ArrayList<>();
		
		for(int i = 1; i <= range; i++) {
			numbersToDrow.add(i);
		}
		
		Collections.shuffle(numbersToDrow);
		
		List<Integer> drownNumbers = new ArrayList<>();
		
		for(int i = 0; i < amount; i++) {
			drownNumbers.add(numbersToDrow.get(i));
		}

		Collections.sort(drownNumbers);
		
		System.out.println("The following numbers were drown: " + drownNumbers.toString());
		
	}

	
	static int draw(String message) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		
		while(!scan.hasNextInt()) {
			System.out.println("Wrong choice");
			scan.next();
		}
		
		return scan.nextInt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
