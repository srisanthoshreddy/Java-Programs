import java.util.*;
class encryption
{
	public static void main(String args[])
	{
	//Encryption
		int i,l,p,f;
		char a = 'a',ch,k;
		String t = "", x = "|", encrypt = "", decrypt = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data to be encryped: ");
		String s = sc.nextLine();
		l = s.length();
		for(i=0;i<l;i++)
		{
			ch = s.charAt(i);
			p = (int)ch - (int)a + 1;  //Here, the number corresponding to the letter is considered(This can be changed as per our needs).
			if(p == -64) //If there is a space between the words, it is considered 0.
			{
				p = 0;
			}
			t = t + String.valueOf(p);
			encrypt = encrypt + String.valueOf(p) + x;
		}
		encrypt =  encrypt;
		System.out.println("After Encryption: " + t);
		//System.out.println("For the purpose of Decryption: |" + encrypt);
	//Decryption
		String ar[]=encrypt.split("\\|"); //Getting the value between two |.
		for(String temp:ar)
		{
			f = Integer.parseInt(temp); //Converting String to Integer.
			f = f + 96;
			if(f==96) //If value is 0, it provides a space gap.
			{
				k = ' ';
			}
			else
			{
				k = (char)f;
			}
			decrypt = decrypt + String.valueOf(k);
		}		
		System.out.println("After decryption: " + decrypt);
	}
}