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
		String str1,str2;
		str1=s.next();
		str2=s.next();
		if(str1.length()>str2.length())
		System.out.println(str1);
		else
		System.out.println(str2);

	}
}
