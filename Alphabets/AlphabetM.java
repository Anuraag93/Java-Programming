package com.alphabets;

public class AlphabetM {

	public static void main(String[] args) {
		int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if(col==0||col==n-1
						||(rows==col||rows+col==n-1)&&rows<=n/2)
					System.out.print("M ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
