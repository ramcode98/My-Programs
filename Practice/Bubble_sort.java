package Practice;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,30,5,100,60};
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
