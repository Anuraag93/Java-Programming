package com.alphabets;

public class AlphabetD {

	public static void main(String[] args) {
		int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col <= n/2; col++) {
				if((rows==0||rows==n-1)&&col!=n/2
						||col==0
						||col==n/2&&rows!=0&&rows!=n-1)
					System.out.print("D ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
