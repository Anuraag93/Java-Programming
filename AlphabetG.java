package com.alphabets;

public class AlphabetG {

	public static void main(String[] args) {
int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if(rows==0&&col!=0
						||col==0&&rows!=0&&rows!=n-1
						||rows==n-1&&col<=n/2&&col!=0
						||col==n/2&&rows>=n/2
						||rows==n/2&&col>=n/2
						||col==n-1&&rows>=n/2)
					System.out.print("G ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
