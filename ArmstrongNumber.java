package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber a = new ArmstrongNumber();
		a.checkno(153);

	}

	public void checkno(int i) {
		// TODO Auto-generated method stub
		int cube=0;
		int temp =i;
		while(temp>0)
		{
			int r = temp%10;
			cube = cube+(r*r*r);
			temp= temp/10;
			}
		if(cube==i)
			System.out.println("Armstrong no");
		else
			System.out.println("not armstrong");
		
	}

}
