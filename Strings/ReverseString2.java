package strings;

import java.util.Scanner;

public class ReverseString2 {
	static String res="";
	static int i=0;
	public static String reverse(String s1) {
		
		if(i==s1.length())
		{
			return res;
	
		}else {
			res = s1.charAt(i)+res;
			i++;
			reverse(s1);
			
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		String rev=reverse(s1);
		System.out.println("the reverse of given string "+s1+" = ");
		System.out.println(rev);
		
	}
}
