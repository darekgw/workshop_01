package pl.coderslab.ex1;

import java.util.Random;
import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Random rand = new Random();
		int guess = rand.nextInt(101);
		System.out.println(guess);
		int strzal = getInt("Podaj liczbę");
		
		while (guess != strzal) {
			if (strzal < guess) {
				System.out.println("Za mało");
			} else {
				System.out.println("Za dużo");
			}
			strzal = getInt("Podaj liczbę");
		}
		
		
		System.out.println("Zgadłeś");
		}
	
	public static int getInt(String message) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println(message);
    	while(!scan.hasNextInt()) {
    		System.out.println("to miała być liczba");
    		scan.next(); }
    	return scan.nextInt();
    }
}