package Practice;

public class Armstrong_no {

	public static void main(String[] args) {
		int no=153;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("Its not");
		}
	}

}
