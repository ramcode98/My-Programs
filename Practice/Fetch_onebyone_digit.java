package Practice;

public class Fetch_onebyone_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1252;
		while(no!=0)
		{
			int rem=no%10;
			System.out.print(rem);
			no=no/10;
		}
	}

}
