package com.alphabets;

public class AlphabetP {

	public static void main(String[] args) {
		int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = n/2; col < n; col++) {
				if(col==n/2||(rows==0||rows==n/2)&&col!=n-1||col==n-1&&rows!=0&&rows<n/2)
					System.out.print("P ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
