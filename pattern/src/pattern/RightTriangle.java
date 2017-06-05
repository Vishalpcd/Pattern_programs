package pattern;
import java.util.*;

public class RightTriangle {
	public static void main(String rgs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many rows you want ");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
		
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}
