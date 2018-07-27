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
		int num,temp,a,rem=0;
		num=s.nextInt();
		temp=num;
		while(num>0)
		{
			a=num%10;
			rem=rem*10+a;
			num=num/10;
		}
		if(temp==rem)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
