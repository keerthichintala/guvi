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
		int n,k;
		n=s.nextInt();
		k=s.nextInt();
		int[] a=new int[10];
		for(int i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
}
		int temp;
		for(int i=1;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				
			}
		}
			}
		for(int i=1;i<=n;i++)
		{
			//System.out.print(a[i]);
			if(i==k)
			{
			System.out.print(a[i]);
			break;
			}
		}
	}
}
