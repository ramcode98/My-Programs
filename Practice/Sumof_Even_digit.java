package Practice;

public class Sumof_Even_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=345810;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			no=no/10;
		}
		System.out.println(sum);
	}

}
