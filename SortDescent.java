package practice;

public class SortDescent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.print("Second largest "+arr[1]+" ");
	
		}

}
