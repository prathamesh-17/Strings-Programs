package strings;

/*
 * Reverse the whole string and then swap the first and last character of each string
 * i/p : This is a string
 * o/p : tihs is a snirtg
 */

public class ReverseAndSwap {

	public static void display(String s)
	{
		String str[] = s.toString().split(" ");
		for(int i=0; i<str.length; i++)
		{
			StringBuilder sb = new StringBuilder(str[i]);
			sb.reverse();
			String temp = String.valueOf(sb.charAt(0));
			String temp1 = String.valueOf(sb.charAt(sb.length()-1));
			sb.replace(0, 1, temp1);
			sb.replace(sb.length()-1, sb.length(), temp);
			System.out.print(sb.toString()+" ");
		}
	}
	public static void main(String[] args) {
		String s = "This tomy bring string";
		display(s);

	}

}
