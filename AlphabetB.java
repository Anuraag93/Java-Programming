class AlphabetB 
{
	public static void main(String[] args) 
	{
		
		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col=0;col <= n/2;col++ )
			{
				if (col == 0||col == n/2&&row != 0&&row != n/2&&row != n-1
					||(row == 0||row == n/2||row == n-1)&&col != n/2)
				{
					System.out.print("B ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
