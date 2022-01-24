package patternquestions;

import java.util.Scanner;
public class Pattern25ex1
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{	
				int ans=1;
				for(int j=1;j<=i/2;j++)
					ans=ans*3;
				System.out.print(" "+ans);
			}
			else
			{
				int ans=1;
				for(int j=1;j<=i/2+1;j++)
					ans=ans*2;
				System.out.print(" "+ans);
			}
		}
		
	}
	}	

}
