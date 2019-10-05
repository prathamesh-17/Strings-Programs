package strings;

public class Palindrome {

	static boolean palindrome(String s)
	{
		String s1 = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			s1 += s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(s1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) {
		String s = "madam";
		System.out.print(palindrome(s));
		}

}
