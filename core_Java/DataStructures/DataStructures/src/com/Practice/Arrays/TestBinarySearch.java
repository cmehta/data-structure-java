package com.Practice.Arrays;

/*The binary search runs in O(lgn) time.
 * 
 * (Precondition: s = {s0, s1, . . ., sn–1} is a sorted sequence of n values of the same type as x.)
 * 
 * (Postcondition: either the index i is returned where si = x, or –1 is returned.)
 * 1. Let ss be a subsequence of the sequence s, initially set equal to s.
 * 2. If the subsequence ss is empty, return –1.
 * 3. (Invariant: If x is in the sequence s, then it must be in the subsequence ss.)
 * 4. Let si be the middle element of ss.
 * 5. If si = x, return its index i .
 * 6. If si < x, repeat steps 2–7 on the subsequence that lies above si.
 * 7. Repeat steps 2–7 on the subsequence of ss that lies below si.
 */

public class TestBinarySearch {

	public int search(int[] a, int val) {
		int lo = 0;
		int hi = a.length;

		while (lo < hi) {
			System.out.println(lo + " " + hi);
			int i = (lo + hi) / 2;
			System.out.println(a[i]);
			if (a[i] == val) {
				return i;
			} else if (a[i] < val) {
				lo = i + 1;
			} else if (a[i] > val) {
				hi = i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] a = { 22, 33, 44, 55, 66, 77, 88, 88, 88, 88, 99 };
		int val = 88;
		System.out.println("found at " + new TestBinarySearch().search(a, val));
	}

}
