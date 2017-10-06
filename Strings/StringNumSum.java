package strings;

import java.util.Scanner;

public class StringNumSum {
	public static void main(String[] args) {
		String res = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		
//		String s1 = "T3H2IS I3S S4TR3ING";
		
		char ch[]=s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int sum = 0;
			while(i<ch.length&&ch[i]!=' ')
			{
				if(ch[i]>=48&&ch[i]<=57)
				{
					sum = sum+(ch[i]-48);
				}
				else if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122)
				{
					res = res+ch[i];

				}
				i++;
			}
			res = res+sum+" ";
		}
		System.out.println(res);
	}
}
