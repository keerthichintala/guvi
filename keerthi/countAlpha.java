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
		String str=s.nextLine();
		int len=str.length();
		int k=0;
		for(int i=0;i<len;i++)
		{
		if(str.charAt(i)>=48&&str.charAt(i)<=57)
		k++;
			
		}
	System.out.println(k);	
	}
}
