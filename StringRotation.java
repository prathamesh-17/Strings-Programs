package strings;

import java.util.Scanner;

public class StringRotation {

	static boolean rotate(String a,String b)
	{
		StringBuilder sb = new StringBuilder(b);
		sb.insert(0, b.charAt(b.length()-2));
		sb.insert(1, b.charAt(b.length()-1));
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		return  (String.valueOf(sb)).equalsIgnoreCase(a);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			String s1 = sc.next();
			String s2 = sc.next();
			if(rotate(s1,s2) == true)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
			
		}
		
			
		sc.close();
		
	}

}


/*
Given two strings a and b. The task is to find if a string 'a' can be obtained by rotating 
another string 'b' by 2 places.
*/