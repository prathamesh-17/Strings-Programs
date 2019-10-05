package strings;

public class AllSubstrings {

	public static void main(String[] args) {
		int num = 1131214;
		String A = String.valueOf(num);
		int a[] = new int[(A.length()*(A.length()+1))/2];
		int k=0;
		for(int i=0; i<A.length(); i++)
		{
			for(int j=i+1; j<=A.length(); j++)
			{
				a[k++] = Integer.parseInt(A.substring(i, j));
			}
		}
		for(int n:a)
		{
			if(n%11 == 0)
			{
				System.out.print(n+" ");
			}
		}
	}

}
