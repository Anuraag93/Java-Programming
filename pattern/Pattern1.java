//Printing an output like
1 1 1 1
2 2 2 2
3 3 3 3

class Pattern1
{
	public static void main(String[] args)
	{
		System.out.println("Prg starts..");
		for(int rows = 1; rows <= 3; rows++)
		{
			for(int col = 1; col <= 4; col++)
			{
				System.out.print(rows+" ");
			}
			System.out.println();
		}

		System.out.println("Prg ends..");

	}
}
