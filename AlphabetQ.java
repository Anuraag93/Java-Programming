package com.alphabets;

public class AlphabetQ {

	public static void main(String[] args) {
		int n=15;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if((col==0||col==(3*n)/4)&&rows!=0&&rows!=(3*n)/4&&rows<(3*n)/4
					||(rows==0||rows==(3*n)/4)&&col!=0&&col!=(3*n)/4&&col<(3*n)/4
					||col==rows&&rows>=n/2)
					System.out.print("Q ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
