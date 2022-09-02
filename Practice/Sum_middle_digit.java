package Practice;

public class Sum_middle_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={125,128,135,140};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+sumof(arr[i]);
		}
		System.out.println(sum);
	}
	static int sumof(int no)
	{
		int y=(no%100)/10;
	
	return y;
}
}

