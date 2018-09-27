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
		/* package whatever; // don't place package name! */
		Scanner sc=new Scanner(System.in);
		String str;
		int k;
		str=sc.next();
		k=sc.nextInt();
		//System.out.print(k);
		int length=str.length();
		String result="";
		int m=length-k;
		for(int i=m;i<length;i++)
		{
		result=result+str.charAt(i);	
		}
		System.out.print(result);
	}
}
