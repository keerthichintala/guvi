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
		int count=0,k=0,l=0;
		for(int i=0;i<len;i++)
		{
			
		 if((str.charAt(i)>=65&&str.charAt(i)<=90)||(str.charAt(i)>=97&&str.charAt(i)<=122))
			{
			k=1;
			}
			else if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
		l=2;
			}
	
		}
		
		if((k==1)&&(l==2))
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
