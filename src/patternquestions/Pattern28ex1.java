package patternquestions;

import java.util.Scanner;
public class Pattern28ex1
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++)
			System.out.print(" "+i);
	}

	}
}
