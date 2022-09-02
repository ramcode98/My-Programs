package Practice;

public class SumofFactorial_evenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=2235;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				int fact=1;
				for(int i=rem;i>=1;i--)
				{
					fact=fact*i;
				}
				sum=sum+fact;
			
			}
			no=no/10;
		}
		System.out.println(sum);
		}
		
	}

