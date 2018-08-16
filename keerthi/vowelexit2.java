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
		boolean flag=false;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'|str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
