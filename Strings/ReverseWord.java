package strings;

import java.util.Scanner;

public class ReverseWord {
	
	public static String reverseEachWord(String s1)
	{
		String res = "";
		char[] ch= s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int start = i;
			while (i<ch.length && ch[i]!=' ') {
				i++;
			}
			int end = i-1;
			while (end>=start) {
				res = res+ ch[end];
				end--;
			}
			res = res+" ";
			
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		String rev = reverseEachWord(s1);
		System.out.println("The reverse of given String "+s1+" = "+rev);
		
		
	}
}
