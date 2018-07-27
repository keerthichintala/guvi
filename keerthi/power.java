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
		Scanner s= new Scanner(System.in);
		int n,pow;
		n=s.nextInt();
		pow=s.nextInt();
		int result=n;
		for(int i=0;i<pow-1;i++)
		{
			result=result*n;
			
		}
		System.out.println(result);
	}
}
