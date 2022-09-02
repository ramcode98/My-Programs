package Practice;

public class Largest_noin_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={30,50,100,130,70,80};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
