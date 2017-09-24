package com.alphabets;

public class AlphabetO {

	public static void main(String[] args) {
		int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if((rows==0||rows==n-1)&&col!=0&&col!=n-1
					||(col==0||col==n-1)&&rows!=0&&rows!=n-1)
					System.out.print("O ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
