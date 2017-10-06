package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String s1) {
		String res="";
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			res = ch[i]+res;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		String rev=reverse(s1);
		System.out.println("the reverse of given string "+s1+" = "+rev);
		
	}
}
