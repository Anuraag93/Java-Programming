package com.alphabets;

public class AlphabetA {

	public static void main(String[] args) {
		int n=11;
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols <= n/2; cols++) {
				if((rows==0&&cols!=0&&cols!=n/2)||(cols==0||cols==n/2)&&rows!=0||rows==n/2)
				System.out.print("A ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
