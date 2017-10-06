package strings;

import java.util.Scanner;

public class SpiltDemo {
	
	static int index=0;
	public static String[] split(String s1,char c1) {
		String []ar=new String [10];
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String res = "";
			while (i<ch.length&&ch[i]!=c1) {
				res=res+ch[i];
				i++;
			}
			ar[index++]=res;
		}
		return ar;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		String [] ar = split(s1,'s');
		for (int i = 0; i < index; i++) {
			System.out.println(ar[i]);
		}
	}
}
