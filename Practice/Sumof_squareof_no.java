package Practice;

public class Sumof_squareof_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1252;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		System.out.println(sum);
	}

}
