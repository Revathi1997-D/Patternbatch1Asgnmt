package patternquestions;

import java.util.Scanner;
public class Pattern30ex1
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		int ans=1,iteration=3;
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+ans );
			ans+=iteration;
			iteration+=2;
		}
	}

}
}
