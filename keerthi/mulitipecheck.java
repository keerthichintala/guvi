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
		int n,m;
		n=s.nextInt();
		m=s.nextInt();
		int k=n*m;
		if(n%2==0)
		System.out.print("even");
		else
		System.out.print("odd");
	}
}
