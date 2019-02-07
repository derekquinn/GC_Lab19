package co.grandcircus.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class partTwo_B {

/// HASH MAP VERSION OF LAB 19

	public static void main(String[] args) {

// array to be searched
		int[] luckyNumbers = new int[11];
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

		HashMap<Integer, Integer> hNumberFreq = new HashMap<Integer, Integer>();
		int count;
		for (int i = 0; i < luckyNumbers.length; i++) {
			if (hNumberFreq.get(luckyNumbers[i]) == null) {
				hNumberFreq.put(luckyNumbers[i], 1);
			} else {
				count = hNumberFreq.get(luckyNumbers[i]);
				count++;
				hNumberFreq.put(luckyNumbers[i], count);
			}
		}
		// input ends when array reaches 11 in size
//} TRY CATCH NOT WORKING YET

// use a temporary variable to store and record the frequencies of diff numbz
		for (int i = 0; i < luckyNumbers.length; i++) {
			t = luckyNumbers[i];
			hNumberFreq[t]++;
		}

		System.out.println("==== LUCKY NUMBERS BY TUPPERWARE ====");
		System.out.println("============= RESULTS ===============");
		for (int i = 0; i < hNumberFreq.length; i++) {
// print out the number frequencies , profit
			if (hNumberFreq[i] > 0 && hNumberFreq[i] == 1) {
				System.out.printf("%d OCCURS %d TIME\n", i, hNumberFreq[i]);
			} else if (hNumberFreq[i] >= 2) {
				System.out.printf("%d OCCURS %d TIMES\n", i, hNumberFreq[i]);
			}

		}

		System.out.println("");

		System.out.println(
				"Despite their kitschy reputation, Tupperware parties take place in more than 100 countries, \nwith 520,000 happening every year in France alone.");

	} // END MAIN METHOD

}
