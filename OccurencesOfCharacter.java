package strings;
import java.util.*;

/*
 * Given a string , you have to count the number of occurrences of each character in it. 
 * For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each
 *  character in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5.
 */

public class OccurencesOfCharacter {

	static void occurrence(String s)
	{
		Map<Character,Integer> map = new HashMap<>();
		char str[] = s.toCharArray();
		for(char x:str)
		{
			if(map.containsKey(x))
			{
				int value = map.get(x);
				map.put(x, value+1);
			}
			else
			{
				map.put(x, 1);
			}
		}
		for(char n:map.keySet())
		{
			System.out.print(n+" "+map.get(n)+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		String s = "Java J2EE Java JSP J2EE";
		
		occurrence(s);
	}

}
