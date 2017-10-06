package strings;

import java.util.Scanner;

public class ReplaceVowel {

	public static String replaceVowel(String s1) {
		String res="";
		char ch[]=s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]='$';
			} 
				res=res+ch[i];
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1 = sc.nextLine();
		System.out.println(replaceVowel(s1));
	}
	
}
