package pattern;

public class Pattern {
	public static void main(String args[])
	{
		for(int i=0;i<=4;i++)//program for pyramid
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(" ");//it will put spaces from starting 
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");//it will print the * and one space 
			}
			System.out.println();//it will work as breakline
		}
	}

}
