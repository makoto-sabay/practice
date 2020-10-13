package generator;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Input the character counts (3-128) :  ");
		int num = getWordCount();

		System.out.println("Do you need lowercase characters? (y or n) :  ");
		String lowercase = getLowercase();
		boolean ul = convertStringToBoolean(lowercase);

		System.out.println("Do you need uppercase characters? (y or n) :  ");
		String uppercase = getUppercase();
		boolean uf = convertStringToBoolean(uppercase);

		System.out.println("Do you need numbers? (y or n) : ");
		String numbers  = getNumbers();
		boolean un = convertStringToBoolean(numbers);

		System.out.println("Do you need symbles? (y or n) : ");
		String symbols  = getSymbols();
		boolean us = convertStringToBoolean(symbols);

		RandomStringGenerator rg = new RandomStringGenerator();
		System.out.print(rg.getPassword(num, ul, uf, un, us));
		rg = null;
	}

	/**
	 * Get the word count
	 *
	 * @return
	 */
	private static int getWordCount() {
		Scanner scan = null;
		int tmp = 8;
		try {
			scan = new Scanner(System.in);
			tmp = scan.nextInt();
		}
		catch (Exception e) {
			tmp = 8;
			System.out.println("Error Occured. Put the word of count as 8.");
		}
		scan = null;
		return(tmp);
	}

	private static String getLowercase() {
		Scanner scan = null;
		String tmp = "n";

		try {
			scan =  new Scanner(System.in);
			tmp = scan.next();

			if(tmp == null) {
				tmp = "n";
			}
			else if(tmp.equals("y") || tmp.equals("Y")) {
				tmp = "y";
			}
			else {
				tmp = "n";
			}
		}
		catch (Exception e) {
			tmp ="n";
			System.out.println("Error Occured. We don't use lowercase.");
		}
		scan = null;
		return tmp;
	}


	private static String getUppercase() {
		Scanner scan = null;
		String tmp = "n";

		try {
			scan = new Scanner(System.in);
			tmp = scan.next();

			if(tmp == null) {
				tmp = "n";
			}
			else if(tmp.equals("y") || tmp.equals("Y")) {
				tmp = "y";
			}
			else {
				tmp = "n";
			}
		}
		catch (Exception e) {
			tmp ="n";
			System.out.println("Error Occured. We don't use uppercase.");
		}
		scan = null;
		return tmp;
	}

	private static String getNumbers() {
		Scanner scan = null;
		String tmp = "n";

		try {
			scan = new Scanner(System.in);
			tmp = scan.next();

			if(tmp == null) {
				tmp = "n";
			}
			else if(tmp.equals("y") || tmp.equals("Y")) {
				tmp = "y";
			}
			else {
				tmp = "n";
			}
		}
		catch (Exception e) {
			tmp = "n";
			System.out.println("Error Occured. We don't use numbers.");
		}

		scan = null;
		return tmp;
	}


	private static String getSymbols() {
		Scanner scan = null;
		String tmp = "n";

		try {
			scan = new Scanner(System.in);
			tmp = scan.next();

			if(tmp == null) {
				tmp = "n";
			}
			else if(tmp.equals("y") || tmp.equals("Y")) {
				tmp ="y";
			}
			else {
				tmp ="n";
			}
		}
		catch (Exception e) {
			tmp = "n";
			System.out.println("Error Occured. We don't use symbols..");
		}
		scan = null;
		return tmp;
	}

	private static boolean convertStringToBoolean(String tmp) {
		boolean flag = false;

		if(tmp == null) {
			flag = false;
		}
		else if(tmp.equals("y") || tmp.equals("Y")) {
			flag = true;
		}
		else {
			flag = false;
		}

		return flag;
	}
}

