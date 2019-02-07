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
// lucky numbers will be stored and searched
		Scanner scnr = new Scanner(System.in);
// this app is being written for Tupperware to help their party hosts make bank.
// Hypothetically.
		System.out.println("WELCOME TO THE TUPPERWARE PARTY GAME CENTER (BETA RELEASE 0.0.2)");
		System.out.println("Please take turns entering your LUCKY number.");
		System.err.println("ONLY NUMBERS BETWEEN 1 - 10");

		for (int i = 0; i < luckyNumbers.length; i++) {

			// collect the lucky numbers

			luckyNumbers[i] = scnr.nextInt();

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

		System.out.println("==== LUCKY NUMBERS BY TUPPERWARE ====");
		System.out.println("============= RESULTS ===============");

		System.out.println(Arrays.asList(hNumberFreq));

	}
} // END MAIN METHOD

//		for (int i = 0; i < luckyNumbers.length; i++) {
//
//// print out the number frequencies , profit
//			if (hNumberFreq.get(luckyNumbers[i]) > 0 && hNumberFreq.get(luckyNumbers[i]) == 1) {
//				System.out.printf("%d OCCURS %d TIME\n", i, hNumberFreq.get(luckyNumbers[i]));
//			} else if ((hNumberFreq.get(luckyNumbers[i]) >= 2)) {
//				System.out.printf("%d OCCURS %d TIMES\n", i, (hNumberFreq.get(luckyNumbers[i])));
//			}
//
//		}
//
//		System.out.println("");
//
//		System.out.println(
//				"Despite their kitschy reputation, Tupperware parties take place in more than 100 countries, \nwith 520,000 happening every year in France alone.");
