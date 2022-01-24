package patternquestions;

import java.util.Scanner;
public class Pattern19ex2 
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		
		
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=2-i;j++)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=2*i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=2*(2-i+1)-1;l++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=2*i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)	
		{
			for(int sp=i;sp<=5-1;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
}
