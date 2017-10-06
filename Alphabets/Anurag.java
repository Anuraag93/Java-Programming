package com.alphabets;

public class Anurag {

	public static void main(String[] args) {
		int n=7;
		//A
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols <= n/2; cols++) {
				if((rows==0&&cols!=0&&cols!=n/2)||(cols==0||cols==n/2)&&rows!=0||rows==n/2)
				System.out.print("A ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//N
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols++) {
				if(cols==0||rows==cols||cols==n-1)
				System.out.print("N ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//U
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols <= n/2; cols++) {
				if((cols==0||cols==n/2)&&rows!=n-1||rows==n-1&&cols!=0&&cols!=n/2)
				System.out.print("U ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//R
		for (int rows = 0; rows < n; rows++) {
			for (int cols = n/2; cols < n; cols++) {
				if(cols==n/2||(rows==0||rows==n/2)&&cols!=n-1||cols==n-1&&rows!=0&&rows<n/2||rows==cols)
				System.out.print("R ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		//A
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols <= n/2; cols++) {
				if((rows==0&&cols!=0&&cols!=n/2)||(cols==0||cols==n/2)&&rows!=0||rows==n/2)
				System.out.print("A ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();

		//G
		for (int rows = 0; rows < n; rows++) {
			for (int cols = n/2; cols < n; cols++) {
				if(cols==n/2||(rows==0||rows==n/2)&&cols!=n-1||cols==n-1&&rows!=0&&rows<n/2||rows==cols)
					System.out.print("R ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();


	}

}
