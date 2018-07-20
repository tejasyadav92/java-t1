package com.tejas.test1;

import java.util.Arrays;

public class Example5 {

	public static int scoreup(String[] k, String[] a) {
		int res = 0;

		for (int i = 0; i < k.length; i++) {
			if (a[i] == null) {
				res = res + 0;
			} else if (a[i].equals(k[i])) {
				res = res + 4;
			} else {
				res = res - 1;
			}

		}

		return res;
	}

	public static void main(String[] args) {

		String[] k = new String[] { "a", "a", "b", "b" };
		String[] a = new String[] { "a", "c", "b", "c" };

		System.out.println("Key Array:\n" + Arrays.toString(k));
		System.out.println("Answer Array:\n" + Arrays.toString(a));

		System.out.println("\nThe score is: " + scoreup(k, a));

	}

}
