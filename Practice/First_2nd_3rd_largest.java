package Practice;

public class First_2nd_3rd_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,30,120,55,80};
		int fl=0;
		int sl=0;
		int tl=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=arr[i];
						
			}
			else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}
			else if(arr[i]>tl)
			{
				tl=arr[i];
			}
		}
		System.out.println(fl);
		System.out.println(sl);
		System.out.println(tl);
	}

}
