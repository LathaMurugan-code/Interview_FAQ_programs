package practice;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome s = new StringPalindrome();
		s.palindromeCheck("MADAM");
		
		

	}

	public void palindromeCheck(String s) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		char []d = new char[c.length];
		int j=0;
		int count=0;
		for(int i=c.length-1;i>=0;i--)
		{
			d[j]=c[i];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==d[i])
				count++;
		}
		if(count==c.length)
		{
	     System.out.println("String palindrome");
		}
		else
			System.out.println("not palindrome");
		
		
	}

}
