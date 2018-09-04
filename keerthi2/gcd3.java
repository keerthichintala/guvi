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
		int x=s.nextInt();
		int y=s.nextInt();
		int k=0;
	         while(y!=0)
	         {
	         	k=x%y;
	         	x=y;
	         	y=k;
	         	
	         }
	         System.out.print(x);
	}
}
