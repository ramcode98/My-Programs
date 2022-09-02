package Practice;

public class without_loop {
	static void Ram(int no)
	{
		if(no<=10)
		{
			System.out.println(no);
			no++;
			Ram(no);
		}
	}
	public static void main(String[] args) {
		Ram(1);
			}
		}
		
