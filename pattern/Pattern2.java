//Printing an output like
1 2 3 4
1 2 3 4
1 2 3 4

class Pattern2
{
	public static void main(String[] args)
	{
		System.out.println("Prg starts..");
		for(int rows = 1; rows <= 3; rows++)
		{
			for(int col = 1; col <= 4; col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}

		System.out.println("Prg ends..");

	}
}
