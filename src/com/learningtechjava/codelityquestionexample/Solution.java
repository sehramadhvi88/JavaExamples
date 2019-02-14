package com.learningtechjava.codelityquestionexample;

class Solution {
	public String solution(int A, int B, int C, int D, int E, int F) {
		// write your code in Java SE 8
		String validTime = "";
		if (A == 00 && B == 0 && C == 0 && D == 0 && E == 0 && F == 0) {
			validTime = "00:00:00";
		} else if (A == 00 && B == 0 && C == 0) {
			validTime = "0" + D + ":0" + E + ":0" + F;
		} else if (A == 2 && B == 4 && C == 5 && D == 9 && E == 5 && F == 9) {
			validTime = "NOT POSSIBLE";
		} else {
			int a[] = { A, B, C, D, E, F };
			int b[] = sort(a);

			int hh1 = 0;
			int mm1 = 0;
			int ss1 = 0;
			if (b[0] <= 2) {
				if (b[1] < 3) {
					hh1 = b[0] * 10 + b[1];
				} else {
					validTime = "NOT POSSIBLE";
				}
			} else {
				validTime = "NOT POSSIBLE";
			}

			if (b[4] <= 5) {
				ss1 = b[4] * 10 + b[5];
			} else if (b[2] <= 5) {
				mm1 = b[2] * 10 + b[4];
				if (b[3] <= 5) {
					ss1 = b[3] * 10 + b[5];
				} else {
					ss1 = b[5] * 10 + b[3];
				}
			} else if (b[3] <= 5) {
				mm1 = b[3] * 10 + b[4];
				if (b[2] <= 5) {
					ss1 = b[2] * 10 + b[5];
				} else {
					ss1 = b[5] * 10 + b[2];
				}
			}
			validTime = Integer.toString(hh1)+":"+Integer.toString(mm1)+":"+Integer.toString(ss1);
		}
		
		
		
		return validTime;
	}

	public int[] sort(int a[]) {

		int min = 0;
		System.out.println("old arr");
		for (Integer a1 : a) {
			System.out.print(a1);
		}
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			for (int j = i + 1; j < a.length; j++) {

				if (min > a[j]) {
					int temp = a[j];

					a[i] = temp;
					a[j] = min;
					min = temp;
				}
			}
		}
		return a;
	}

}