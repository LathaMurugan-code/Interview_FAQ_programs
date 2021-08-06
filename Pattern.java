package practice;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=0;
		int val2=0;
		for(int i=1; i<=5;i++)
		{
			val=i;
			val2 = 2*(i-1);
	    for(int s=5;s>=i;s--)
		{
	     System.out.print(" ");
	     
		}
		for(int j=1;j<=i;j++)
			{
	          System.out.print(val+" ");
	          val++;
				}
		for(int k=1;k<i;k++)
		{
			System.out.print(val2+" ");
			val2--;
		}
			System.out.println();
		}

	}

}
