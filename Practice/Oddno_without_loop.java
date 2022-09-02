package Practice;

public class Oddno_without_loop {
	static void Demo(int no)
	{
		if(no<=10)
		{
			if(no%2==1)
			{
				System.out.println(no);
			}
			no++;
			Demo(no);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo(1);
	}

}
