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
		int N=s.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
