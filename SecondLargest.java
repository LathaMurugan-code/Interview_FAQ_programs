package practice;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {70,30,10,50,80,20};
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int position = 0;
		int position2 = 0;
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]>firstMax)
			{
				firstMax = arr[i];
				position = i;
			}
			
		}
		System.out.println(firstMax);
		for(int i=0;i<arr.length;i++)
		{   
			if(i==position)
				continue;
			if(arr[i]>secondMax)
			{
				secondMax = arr[i];
			
			}
			
		}
		System.out.println(secondMax);
	}

}
