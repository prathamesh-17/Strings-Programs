package strings;

import java.util.Scanner;

public class RomanToInteger {

	static int value(char r)
	{
		switch(r)
		{
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'M':
			return 1000;
		case 'C':
			return 100;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'D':
			return 500;
		default:
			break;
		}
		return -1;
	}
	
	static int roman(String s)
	{
		int res = 0;
		for(int i=0; i<s.length(); i++)
		{
			int s1 = value(s.charAt(i));
			
			if(i+1 < s.length())
			{
				int s2 = value(s.charAt(i+1));
				
				if(s1>=s2)
				{
					res = res+s1;
				}
				else
				{
					res = res+s2-s1;
					i++;
				}
			}
			else
			{
				res = res+s1;
				i++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s = new String[t];
		for(int i=0; i<t; i++)
		{
			s[i] = sc.next();
		}
		for(int i=0; i<t; i++)
		{
			System.out.println(roman(s[i]));
		}
		sc.close();
	}

}
