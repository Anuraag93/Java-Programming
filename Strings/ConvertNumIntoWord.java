package strings;

import java.util.Scanner;

public class ConvertNumIntoWord {

	static String [] one = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	static String [] two = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eigthy","ninty"};

	public static void concat (int num,String s1)
	{
		if (num>19) {
			System.out.print(two[num/10]+" "+one[num%10]);
		}
		else
		{
			System.out.print(one[num]);
		}
		if(num>0) {
			System.out.print(s1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int num=sc.nextInt();
		
		concat(num/10000000," crore ");
		concat((num/100000)%100," lakh ");
		concat((num/1000)%100," thousand ");
		concat((num/100)%10," hundred ");
		concat((num)%100," ");
	}
}
