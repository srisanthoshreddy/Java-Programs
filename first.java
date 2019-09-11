import java.util.Scanner;

class first
{
	public static void main (String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = myObj.nextLine();
		System.out.println("Your name is: " + name);
	}
}