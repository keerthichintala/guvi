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
		int k=s.nextInt();
	    int len=str.length();
	    for(int i=0;i<k;i++)
	    {
	    	System.out.print(str.charAt(i));
	    }
	}
}
