package strings;

public class Permutation {

	static void permute(String s,int l,int r)
	{
		if(l==r)
			System.out.println(s);
		else
		{
			for(int i=l; i<=r; i++)
			{
				s = swap(s,l,i);
				permute(s,l+1,r);
				s = swap(s,l,i);
			}
		}
	}
	static String swap(String s,int i,int j)
	{
		char temp;
		char[] ar = s.toCharArray();
		temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		return String.valueOf(ar);
	}
	public static void main(String[] args) {
		String a = "ABC";
		permute(a,0,a.length()-1);

	}

}
