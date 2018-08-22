/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1,b=0;
		if(n==1)
		{
			System.out.print("no");
		}
		else
		{
       while(n>i)
		{
		if(n%i==0)	
		{
			b++;
		//	System.out.print(b);
		}
		i++;
		}
		
	//	System.out.print(b);
		if(b==1)
		System.out.print("no");
		else
		System.out.print("yes");
		}
	}
}
