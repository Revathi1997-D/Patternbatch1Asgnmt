package patternquestions;

import java.util.Scanner;
public class Pattern20
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		
		if(n%2==0)
			n=n+1;
		int k=(n/2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n/2+1||j==n/2+1)
					System.out.print("*");
				else if(i==1&&j>=k)
					System.out.print("*");
				else if(j==1&&i<=k)
					System.out.print("*");
				else if(i==n&&j<=k)
					System.out.print("*");
				else if(i>=k&&j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
}