package com.tejas.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Input Array:\n" + Arrays.toString(a));

		System.out.println("Enter the number of rotations:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		arrRot(a, n);

	}

	private static void arrRot(int[] a, int n) {

		int temp, previous;
		for (int i = 0; i < n; i++) {
			previous = a[a.length - 1];
			for (int j = 0; j < a.length; j++) {
				temp = a[j];
				a[j] = previous;
				previous = temp;
			}
		}

		System.out.println("Output Array:\n" + Arrays.toString(a));
	}

}
