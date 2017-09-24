package com.alphabets;

public class AlphabetK {

	public static void main(String[] args) {
	
		int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = n/2; col < n; col++) {
				if(col==n/2||rows+col==n-1||rows==col)
					System.out.print("K ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
