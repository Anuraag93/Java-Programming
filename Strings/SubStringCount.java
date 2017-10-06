package strings;

import java.util.Scanner;

public class SubStringCount {

	public static void subString(String s1,String s2)
	{
		char c1 [] = s1.toCharArray();
		char c2 []=s2.toCharArray();
		int count=0;
		for (int i = 0; i < c1.length; i++) {
			int j=0;
			int k=i;
			while (j<c2.length&&c1[k]==c2[j]) {
				k++;
				j++;
				
			}
			if (j==c2.length) {
				count++;
			}
		}
		System.out.println("the Substring is repeated "+count+" times");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		System.out.println("Enter the Sub String");
		String s2=sc.nextLine();
		subString(s1, s2);
		
	}
}
