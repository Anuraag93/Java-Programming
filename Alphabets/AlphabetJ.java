package com.alphabets;

public class AlphabetJ {

	public static void main(String[] args) {
int n=11;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if(rows==0
						||col==n/2&&rows!=n-1
						||rows==n-1&&col!=n/2&&col!=0&&col<n/2
						||col==0&&rows>n/2&&rows!=n-1)
					System.out.print("J ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
