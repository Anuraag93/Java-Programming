package com.alphabets;

public class AlphabetRDiff {

	public static void main(String[] args) {
		int n=15;
		for (int rows = 0; rows <= n/2; rows++) {
			for (int col = 0; col <=n/2; col++) {
				if(rows==0&&col!=n/2
						||col==0
						||rows==n/2&&col!=n/2
						||col==n/2&&rows!=0&&rows!=n/2)
				System.out.print("R ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for (int rows = 0; rows <= n/2; rows++) {
			for (int col = 0; col <=n/2; col++) {
				if(rows==col||col==0)
				System.out.print("r ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
