package patternquestions;

import java.util.Scanner;
public class Pattern24ex2
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();

		int first=1, second=1 , third;
		
		
		for(int i=1 ;i<=n;i++)
		{
			if(i==1|| i==2)
				System.out.print(" 1");
			else
			{
				third=first+second;
				System.out.print(" "+ third);
				first=second;
				second=third;
			}
		}
	}

}
}
