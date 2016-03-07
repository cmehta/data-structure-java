package com.Practice.Arrays;

public class TestLinearSearch {

	public static void print(int[] a) {
//		System.out.printf("{%d", a[0]);
		System.out.println("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
//			System.out.printf(", %d", a[i]);
			System.out.println(", " + a[i]);
		}
		System.out.println("}");
	}

	public static void print(Object[] a) {
//		System.out.printf("{%s", a[0]);
		System.out.println("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
//			System.out.printf(", %s", a[i]);
			System.out.println(", " + a[i]);
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		int[] a = { 22, 33, 44, 55, 66, 77, 88, 88, 88, 88, 99 };
		print(a);
		System.out.println("search(a, 44): " + search(a, 44));
		System.out.println("search(a, 50): " + search(a, 50));
		System.out.println("search(a, 77): " + search(a, 77));
		System.out.println("search(a, 100): " + search(a, 100));
		System.out.println("search(a, 88): " + search(a, 88));
	}

	public static int search(int[] a, int x) {
		// POSTCONDITIONS: returns an integer i;
		// if i >= 0, then a[i] == x; otherwise x is not in a[];
		for (int i = 0; i < a.length; i++) { // step 1
			// INVARIANT: x is not among a[0]...a[i-1] // step 2
			if (a[i] == x) { // step 3
				return i;
			}
		}
		return -1; // step 4
	}
}
