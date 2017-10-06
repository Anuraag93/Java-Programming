package strings;

import java.util.Scanner;

public class CountWordDisplay {
	
	public static String countChar(String s1) {
		char[]ch = s1.toCharArray();

		String res ="";
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			while (i<ch.length && ch[i]!=' ') {
				res=res+ch[i];
				count++;
				i++;
			}
			res=res+count+" ";
			
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		System.out.println(countChar(s1));
		
		
		
	}
}
