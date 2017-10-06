package strings;

import java.util.Scanner;

public class SubString {
	
	public static boolean subString(String s1,String s2)
	{
		char c1 [] = s1.toCharArray();
		char c2 []=s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j=0;
			int k=i;
			while (j<c2.length&&c1[k]==c2[j]) {
				k++;
				j++;
				
			}
			if (j==c2.length) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		System.out.println("Enter the Sub String");
		String s2=sc.nextLine();
		boolean res=subString(s1, s2);
		if (res==true) {
			System.out.println("Yes its a Sub String");
		} else {
			System.out.println("NO its not a Sub String");

		}
		
	}
}
