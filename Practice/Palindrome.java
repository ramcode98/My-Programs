package Practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MADAM";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("Its palindrome");
		}
		else 
		{
			System.out.println("no its not");
		}
	}

}
