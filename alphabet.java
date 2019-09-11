class alphabet
{
	public static void main(String args[])
	{
		char a;
		a = 'a';
		int b = (int)a;	
		while(b <= 122)
		{
			char c = (char)b;
			System.out.println(c);
			b++ ;
		}
	}
}