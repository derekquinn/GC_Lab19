package co.grandcircus.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class partTwo_A {

// ARRAY VERSION OF LAB 19

	public static void main(String[] args) {

// array to be searched
		int[] luckyNumbers = new int[11];
// array to store frequencies
		int[] numberFrequency = new int[11];
// temporarily holds the frequency values before written to array
		int t = 0;

// lucky numbers will be stored and searched
		Scanner scnr = new Scanner(System.in);
// this app is being written for Tupperware to help their party hosts make bank.
// Hypothetically.
		System.out.println("WELCOME TO THE TUPPERWARE PARTY GAME CENTER (BETA RELEASE 0.0.2)");
		System.out.println("Please take turns entering your LUCKY number.");
		System.err.println("ONLY NUMBERS BETWEEN 1 - 10");

// catch the index out of bounds to only allow numbers 1-10

		for (int i = 0; i < luckyNumbers.length; i++) {
//	try {
			// collect the lucky numbers

			luckyNumbers[i] = scnr.nextInt();

//	} catch (IndexOutOfBoundsException e) {
//System.err.println("Lucky numbers can only be 1, 2, 3, 4, 5, 6,7,8,9 or 10.");
		}
		// input ends when array reaches 11 in size
//} TRY CATCH NOT WORKING YET

// use a temporary variable to store and record the frequencies of diff numbz
		for (int i = 0; i < luckyNumbers.length; i++) {
			t = luckyNumbers[i];
			numberFrequency[t]++;
		}

		System.out.println("==== LUCKY NUMBERS BY TUPPERWARE ====");
		System.out.println("============= RESULTS ===============");
		for (int i = 0; i < numberFrequency.length; i++) {
// print out the number frequencies , profit
			if (numberFrequency[i] > 0 && numberFrequency[i] == 1) {
				System.out.printf("%d OCCURS %d TIME\n", i, numberFrequency[i]);
			} else if (numberFrequency[i] >= 2) {
				System.out.printf("%d OCCURS %d TIMES\n", i, numberFrequency[i]);
			}

		}

		System.out.println("");

		System.out.println(
				"Despite their kitschy reputation, Tupperware parties take place in more than 100 countries, \nwith 520,000 happening every year in France alone.");

	} // END MAIN METHOD

}
