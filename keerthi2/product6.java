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
		int k=0,temp=1,m=0;
		while(n!=0)
		{
			k=n%10;
			temp=k*temp;
			n=n/10;
		}
		System.out.print(temp);
	}
}
