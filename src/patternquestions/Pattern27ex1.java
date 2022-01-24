package patternquestions;

import java.util.Scanner;
public class Pattern27ex1
{
public static void main(String[] args) 
	{
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			// To find r^n-1
			int r=1;
			for(int j=i;j>1;j--)
				r=r*2;
			System.out.print("  "+(5*r));
			
		}

	}

}
}
