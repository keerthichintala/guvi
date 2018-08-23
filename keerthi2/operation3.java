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
		int n=s.nextInt();
		char ch=s.next().charAt(0);
		int m=s.nextInt();
		int res=0,res1=0;
	          if(ch=='/')
	          {
	          	res=n/m;
	          	System.out.print(res);
	          }
	          else if(ch=='%')
	          {
	          	res1=n%m;
	          	System.out.print(res1);
	          }
	          else
	          {
	          
	          }
	}
}
