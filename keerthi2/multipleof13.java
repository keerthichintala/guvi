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
		if(n==1)
		System.out.print("no");
		else
		{
			if(n%13==0)
			System.out.print("yes");
			else
			System.out.print("no");
		}
	}
}
