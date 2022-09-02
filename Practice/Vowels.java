package Practice;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Qspiders";
		int count=0;
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
