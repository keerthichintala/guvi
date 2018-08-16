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
		int l=s.nextInt();
		int r=s.nextInt();
		boolean flag=false;
		for(int i=l+1;i<r;i++)
		{
			if(n%i==0)
			flag=true;
		}
		if(flag==true)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
