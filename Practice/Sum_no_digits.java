package Practice;

public class Sum_no_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={125,133,451,133};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+sumof(arr[i]);
		}
		System.out.println(sum);
	}
	static int sumof(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}
}
