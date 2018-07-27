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
		int n,a=1,b=0;
		n=s.nextInt();
		while(a<=n)
		{
			if(n%a==0)
			{
				b=b+1;
			}
			a++;
		}
		if(b==2)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
