package strings;

import java.util.Scanner;

public class Anagram {

	public static String removeSpace(String s1)
	{
		String res = "";
		char[] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			{
				res = res +ch[i];
			}
		}
		return res;
	}

	public static  String toUpperCase(String s1)
	{
		String res="";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);

			}
			res = res+ ch[i];
		}

		return res;
	}
	
	public static String sort(String s1) {
		
		String res = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j])
				{
					char c1=ch[i];
					ch[i]=ch[j];
					ch[j]=c1;
				}
			}
			res = res + ch[i];
		}
		return res;
	}
	
	public static boolean compare(String s1,String s2)
	{
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;				
			}
		}		
		return true;
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("the first String is ");
		String s1 = sc.nextLine();
		System.out.println("The Second String is");
		String s2 = sc.nextLine();
		System.out.println("The string are");
		System.out.println(s1);
		System.out.println(s2);
		s1 = removeSpace(s1);
		s2 = removeSpace(s2);
		System.out.println("The String after removing spaces are");
		System.out.println(s1);
		System.out.println(s2);

		if (s1.length()!=s2.length()) {
			System.out.println("The strings are not anagram");
		} else {
			s1=toUpperCase(s1);
			s2=toUpperCase(s2);
			System.out.println("The String after uppercase spaces are");
			System.out.println(s1);
			System.out.println(s2);
			
			s1 = sort(s1);
			s2=sort(s2);
			System.out.println("The String after sorting Characters are");
			System.out.println(s1);
			System.out.println(s2);
			boolean res = compare(s1, s2);
			if (res == true) {
				System.out.println("The strings are anagram");
			}
			else
			{
				System.out.println("the String are not anagram");
			}

		}
		long end = System.currentTimeMillis();
		
		System.out.println("time taken : "+(end-start)+" milli-seconds");
	}
}
