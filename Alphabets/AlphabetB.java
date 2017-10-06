package com.alphabets;

public class AlphabetB {

	public static void main(String[] args) {
		int n=15;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= n/2; col++) {
				if((row==0||row==n/2||row==n-1)&&col!=n/2
						||col==0
						||col==n/2&&row!=0&&row!=n/2&&row!=n-1)
					System.out.print("B ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
