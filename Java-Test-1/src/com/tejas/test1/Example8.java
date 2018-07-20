package com.tejas.test1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Example8 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 3, 6, 4, 1, 2 };

		System.out.println("Input Array:\n" + Arrays.toString(a));

		Sol(a);

	}

	private static void Sol(int[] a) {

		int flag = 1;
		Set<Integer> s = new TreeSet<Integer>();

		for (int i : a) {
			s.add(i);
		}

		Object[] sa = s.toArray();
		System.out.println("\nSorted Array:\n" + s);

		for (int i = 0; i < sa.length - 1; i++) {
			if ((int) sa[i] + 1 == (int) sa[i + 1]) {
				flag++;
			} else {
				System.out.println("\nMinimal valie is: " + ((int) sa[i] + 1));
				break;
			}
		}

		if (flag == sa.length) {
			System.out.println("\nMinimal valie is: " + ((int) sa[sa.length - 1] + 1));
		}

	}

}
