package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s = "i like this program very much";
		String ans = "";
		String st[] = s.split(" ");
		for(int i=st.length-1; i>=0; i--)
		{
			ans += st[i] + " ";
		}
		System.out.print(ans);
	}

}
