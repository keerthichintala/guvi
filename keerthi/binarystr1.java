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
		String str=s.next();
		int len=str.length();
		int k=0,l=0;
		//System.out.print(len);
		for(int i=0;i<len;i++)
		{
			//System.out.print(str.charAt(i));
			if(str.charAt(i)=='1' || str.charAt(i)=='0'){
			k++;}
			else
			l=2;
		}
		//System.out.print(k);
		if(l==2)
		System.out.print("no");
		else
		System.out.print("yes");
	}
}
