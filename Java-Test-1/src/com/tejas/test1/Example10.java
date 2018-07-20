package com.tejas.test1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Example10 {

	public static void main(String[] args) {

		int[] a = new int[] { 4, 1, 3, 2, 1 };

		System.out.println("Input Array:\n" + Arrays.toString(a));

		System.out.println("\nPermutation?: ");
		Sol(a);

	}

	private static void Sol(int[] a) {

		int flag = 0;
		Set<Integer> s = new TreeSet<Integer>();

		for (int i : a) {
			s.add(i);
		}

		Object[] sa = s.toArray();

		for (int i = 0; i < sa.length - 1; i++) {
			if ((int) sa[i] + 1 == (int) sa[i + 1]) {
				flag++;
			} else {
				System.out.println("0");
				break;
			}
		}
		if (flag == (sa.length - 1)) {
			System.out.println(1);
		}
	}

}
