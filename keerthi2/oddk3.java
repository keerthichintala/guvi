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
		int n,k,l=0;
		n=s.nextInt();
		k=s.nextInt();
		int[] a=new int[10];
		for(int i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			if(a[i]%2!=0)
			{
				l++;
				if(l==k)
				{
					System.out.print(a[i]);
					break;
				}
			}
		
			
		}
	}
}
