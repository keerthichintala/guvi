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
		int[] a=new int[10];
		int n=10;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print(min);
	}
}
