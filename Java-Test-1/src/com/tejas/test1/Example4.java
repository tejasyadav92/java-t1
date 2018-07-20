package com.tejas.test1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		System.out.println("Enter the String:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println("Enter the Number :");
		int n = in.nextInt();

		System.out.println(strPattern(str, n));
	}

	private static String strPattern(String str, int n) {

		int len = str.length();
		String fstr = "";

		for (int i = n; n > 0; n--) {
			fstr += str.substring(0, n);
		}
		return fstr;
	}

}
