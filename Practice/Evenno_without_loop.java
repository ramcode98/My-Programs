package Practice;

public class Evenno_without_loop {
static void Demo(int no)
{
	if(no<=10)
	{
		if(no%2==0)
		{
			System.out.println(no);
		}
		no++;
		Demo(no);
	}
}
	public static void main(String[] args) {
		Demo(1);

	}

}
