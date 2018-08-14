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
		int rem=0,a;
		while(n!=0)
		{
			a=n%10;
			rem=rem+a;
			n=n/10;
		}
		System.out.print(rem);
	}
}
