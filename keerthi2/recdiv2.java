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
		if(n%2==0)
		{
		while(n%2==0)
		{
		n=n/2;
		}
		System.out.print(n);
		}
		else
		System.out.print(n);
	}
}
