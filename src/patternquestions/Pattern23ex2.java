package patternquestions;

import java.util.Scanner;
public class Pattern23ex2
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
						System.out.print("  "+i);
					else
					{
						System.out.print("  "+ (1+(i/2)*3));
					}
				}

			}

		}
}
