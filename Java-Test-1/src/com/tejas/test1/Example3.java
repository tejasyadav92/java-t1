package com.tejas.test1;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 1 };
		System.out.println("Input Array:\n" + Arrays.toString(a));

		System.out.print("\nResult: " + seqNum(a));

	}

	public static boolean seqNum(int[] a) {

		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] == 1 && a[i + 1] == 2 && a[i + 2] == 3) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
