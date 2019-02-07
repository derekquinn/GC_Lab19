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

// lucky numbers will be stored and searched
		Scanner scnr = new Scanner(System.in);
// this app is being written for Tupperware to help their party hosts make bank.
// Hypothetically.
		System.out.println("WELCOME TO THE TUPPERWARE PARTY GAME CENTER\n");
		System.out.println("Please take turns entering your favorite number between 1-10");
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
// print out the number frequencies , profit
		for (int i = 0; i < numberFreq.length; i++) {

			if (numberFreq[i] > 0 && numberFreq[i] == 1) {
				System.out.printf("%d occurs %d time\n", i, numberFreq[i]);
			} else if (numberFreq[i] >= 2) {
				System.out.printf("%d occurs %d times\n", i, numberFreq[i]);
			}

		}

	}

}
