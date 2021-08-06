package practice;

public class FibonacciQues { 
	int first = -1;
	int second = 1;
	int third;
	public static void main(String[] args)
	{
		int first = -1;
		int second = 1;
		int third=0;
	while(third<100)
	{
		third = first+second;
		first=second;
		second = third;
		System.out.print(third+" ");
	}
	FibonacciQues f = new FibonacciQues();
	f.findFibonacci(-1, 1);
	f.withoutThird();
	}
	public void findFibonacci(int first,int second)
	{
		if(second<=89)
		{
		third = first+second;
		System.out.println(third+" ");
		findFibonacci(second,third);
		}
		
	}
	public void withoutThird()
	{
		int first = -1;
		int second = 1;
		while(second<=100)
		{
			System.out.println(first+second);
	        second = first+second;
	        first =second-first;
		}
	}
	
}
