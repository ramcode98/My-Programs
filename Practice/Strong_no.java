package Practice;

public class Strong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Strong no");
		}
		else 
		{
			System.out.println("No its not");
		}
			
	}

}
