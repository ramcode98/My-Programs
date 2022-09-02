package Practice;

public class Prime {

	public static void main(String[] args) {
		int no=6;
		boolean flag=true;
		for(int i=2;i<6;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Its prime"+no);
		}
		else 
		{
			System.out.println("Its not prime "+no);
		}

	}

}
