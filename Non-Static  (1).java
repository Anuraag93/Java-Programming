class Sample
{
	int a1 = 58;
	float d1 = 0.8474f;

	public void count()
	{
		System.out.println("This is the count() of Sample Class");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg Starts...");
		Sample ref; // Classname variablename; 
		ref = new Sample();

		Sample ref2 = new Sample();

		ref.a1 = 41;

		System.out.println("ref ="+ref);
		System.out.println("ref2 ="+ref2);


		System.out.println("ref.a1 ="+ref.a1);
		System.out.println("ref.d1 ="+ref.d1);

		ref.count();
		ref.count();

		System.out.println("Prg Ends...");
	}
}
