package co.grandcircus.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class partTwo_A {

	public static void main(String[] args) {

// array to be searched
		int[] luckyNumbers = new int[11];
// array to store frequencies
		int[] numberFreq = new int[11];
// temporarily holds the frequency values before written to array
		int t = 0;

// lucky numbers will be stored and searchedddd
		Scanner scnr = new Scanner(System.in);
// this app is being written for Tupperware to help their party hosts make bank.
// Hypothetically.
		System.out.println("WELCOME TO THE TUPPERWARE PARTY GAME CENTER (BETA RELEASE 0.0.2) \n");
		System.out.println("Please take turns entering your favorite number (between 1-10)");
// collect the lucky numbers
		for (int i = 0; i < luckyNumbers.length; i++) {

			luckyNumbers[i] = scnr.nextInt();
			// input ends when array reaches 11 in size
		}
		
// use a temporary variable to store and record the frequencies of diff numbz
		for (int i = 0; i < luckyNumbers.length; i++) {
			t = luckyNumbers[i];
			numberFreq[t]++;
		}

		
		System.out.println("==== LUCKY NUMBERS BY TUPPERWARE ====");
		System.out.println("============= RESULTS ===============");
		for (int i = 0; i < numberFreq.length; i++) {
// print out the number frequencies , profit
			if (numberFreq[i] > 0 && numberFreq[i] == 1) {
				System.out.printf("%d OCCURS %d TIME\n", i, numberFreq[i]);
			} else if (numberFreq[i] >= 2) {
				System.out.printf("%d OCCURS %d TIMES\n", i, numberFreq[i]);
			}

		}
		
		System.out.println("");
		
		System.out.println("Despite their kitschy reputation, Tupperware parties take place in more than 100 countries, \nwith 520,000 happening every year in France alone.");

	} // END MAIN METHOD
	


}
