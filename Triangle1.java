package triangle;

public class triangle1
{
	public static void main(String[]args)
	{
		System.out.println("prg starts...");
		for(int line = 1;line <= 5;line++)
		{
			for(int space = 4;space >= line;space--)
			{
				System.out.print(" ");
			}
			
			for(int star = 1;star <= line; star++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
			
		}
		System.out.println("prg ends...");
	}
}