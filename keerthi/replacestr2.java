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
		int k=len/2;
		String str1=" ",str2=" ",str3=" ";
		if(len%2==0)
		{
		str1=str.replace(str.charAt(k-1),'*');
		str2=str1.replace(str.charAt(k),'*');
		System.out.print(str2);
		}
	          else
	          {
	          	str3=str.replace(str.charAt(k),'*');
	          	System.out.print(str3);
	          }
	}
}
