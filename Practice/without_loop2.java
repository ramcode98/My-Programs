package Practice;

public class without_loop2 {
	static void Ram(int no)
	{
		if(no>=1)
		{
			System.out.println(no);
			no--;
			Ram(no);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ram(10);
	}

}
