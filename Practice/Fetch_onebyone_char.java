package Practice;

public class Fetch_onebyone_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Qspiders";
		char s2=' ';
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s1.charAt(i);
			System.out.println(s2);
		}
		
	}

}
