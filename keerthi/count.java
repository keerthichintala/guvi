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
		int num,a,count=0,total=0;
		num=s.nextInt();
		while(num>0)
		{
			a=num%10;
			total=total+a*10;
			num=num/10;
			count++;
			
		}
		System.out.println(count);
	}
}
