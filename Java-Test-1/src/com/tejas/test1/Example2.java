package com.tejas.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		System.out.println("Enter the file name:");
		Scanner in = new Scanner(System.in);
		String fname = in.nextLine();

		File f = new File(fname);
		List<Integer> ilist = new ArrayList<Integer>();

		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {
				ilist.add(s.nextInt());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Input elements are:\n" + ilist);

		System.out.println("\n 1. Mean\n 2. Median\n 3. Mode\nEnter your Choice:");
		int choice = in.nextInt();

		switch (choice) {

		case 1: {
			System.out.print("\nMean is:");
			mean(ilist);
			break;
		}
		case 2: {
			System.out.print("\nMedian is:");
			median(ilist);
			break;
		}
		case 3: {
			System.out.print("\nMode is:");
			mode(ilist);
			break;
		}
		default: {
			System.out.println("\nWrong option");
			break;
		}
		}

	}

	private static int mode(List<Integer> ilist) {
		int mode = ilist.get(0);

		int maxCount = 0;

		for (int i = 0; i < ilist.size(); i++) {
			int value = ilist.get(i);
			int count = 1;
			for (int j = 0; j < ilist.size(); j++) {
				if (ilist.get(j) == value)
					count++;
				if (count > maxCount) {
					mode = value;
					maxCount = count;
				}

			}

		}
		return mode;

	}

	private static void median(List<Integer> ilist) {
		int mid = ilist.size() / 2;
		if (ilist.size() % 2 == 1) {
			System.out.println(ilist.get(mid));
		} else {
			System.out.println(ilist.get(mid - 1) + ilist.get(mid) / 2);
		}
	}

	private static void mean(List<Integer> ilist) {

		double sum = 0, mean = 0;
		for (int i : ilist) {
			sum = sum + i;
		}
		mean = sum / ilist.size();
		System.out.println(mean);
	}

}
