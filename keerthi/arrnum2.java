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
		int m=s.nextInt();
		int[] a=new int[10];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==m)
			{
				count=1;break;
			}
		}
		if(count==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
