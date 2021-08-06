package practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Factorial f = new Factorial();
	f.findfact(5);
	

	}

	public void findfact(int i) {
		// TODO Auto-generated method stub
		int product=1;
		for(int j=i;j>=1;j--)
		{
			product = product*j;
		}
		System.out.println(product);
		
	}

}
