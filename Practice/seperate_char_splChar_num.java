package Practice;

public class seperate_char_splChar_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="R@a1133m1!";
		String alpha=""; String digit=""; String sp="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				alpha=alpha+ch;
			}
			else if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
			else
			{
				sp=sp+ch;
			}
		}
			System.out.println(alpha);
			System.out.println(digit);
			System.out.println(sp);
		}
	}


