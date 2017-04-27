class NoteBook
{
	double price = 100;
	int pages = 500;
	String type = "long book";
	String brand = "classmate";
	public void openBook()
	{
		System.out.println("open the NoteBook");
	}
	public void turnPage()
	{
		System.out.println("turn the Page of NoteBook");
	}
	public void closeBook()
	{
		System.out.println("close the NoteBook");
	}
}

class Pen
{
	double price = 50;
	String brand = "Linc";
	String color = "blue";
	String type = "ball pen";
	
	public void write()
	{
		System.out.println("writing with the Pen ");
	}
	public void draw()
	{
		System.out.println("drawing with the Pen");
	}
	public void refill()
	{
		System.out.println("refilling the Pen ");
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("prg starts...");
		NoteBook nb1 = new NoteBook();

		Pen p1 = new Pen();
		System.out.println("NoteBook ="+nb1);
		System.out.println("Pen ="+p1);

		System.out.println("NoteBook");
		System.out.println("price ="+nb1.price);
		nb1.openBook();
		nb1.turnPage();
		p1.write();
		p1.draw();
		nb1.closeBook();


		System.out.println("prg ends...");
	}
}
