//box of stars with diagonals also stared

class Pattern4
{
	public static void main(String[] args)
	{
		int n = 13;
		for (int row = 0;row < n ;row++)
		{
			for (int col = 0;col < n;col++ )
			{
				if (row == 0||col == 0|| row == n-1||col == n-1||row == n/2|| col == n/2||row == col||row + col == n-1)
				{
					System.out.print("* ");
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
