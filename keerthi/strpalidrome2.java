
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

		Scanner s=new Scanner(System.in);
		String str=s.next();
		int len=str.length();
		int k=0;
		boolean flag=false;
		for(int i=0;i<(len/2);i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			flag=true;
			
		}
		
	if(flag==true)
	System.out.print("no");
	else
	System.out.print("yes");
	}

}
