package com.alphabets;

public class AlphabetC {

	public static void main(String[] args) {
		int n=15;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= n/2; col++) {
				if(row==0&&col!=0&&col!=n/2||row==n-1&&col!=0&&col!=n/2||col==0&&row!=0&&row!=n-1||(row==1||row==n-2)&&col==n/2)
					System.out.print("C ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
