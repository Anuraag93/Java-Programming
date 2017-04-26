class AlphabetA
{
	public static void main(String[] args) 
	{
		int n = 7;
		for (int row = 0;row < n ;row++ )
		{
			for (int col=0;col <= n/2;col++ )
			{
				if (col == 0||col == n/2||row == 0||row == n/2 )
				{
					System.out.print("A ");
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
