package Practice;

public class sum_first_last_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={125,135,144,131};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+middle(arr[i]);
		}
		System.out.println(sum);
	}
	static int middle(int no)
	{
		int x=no%10;
		int y=no/100;
		int z=x+y;
		return z;
	}
}
