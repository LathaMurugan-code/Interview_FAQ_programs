package practice;
import java.util.Scanner;
public class Primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Primecheck p = new Primecheck();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number");
	int x = sc.nextInt();
	boolean value=p.checkPrimeCheck(x);
	if(value)
	{
		System.out.println("prime no");
	}
	else
		System.out.println("not prime");

	}

	public boolean checkPrimeCheck(int x) {
		// TODO Auto-generated method stub
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
		
		
	}

}
