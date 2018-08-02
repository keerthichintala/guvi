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
		int hr=s.nextInt();
		int min=s.nextInt();
		int hr1=s.nextInt();
		int min1=s.nextInt();
		int hr2,min2;
		if(hr1>hr)
		{
		 hr2=(hr1-hr);
		}
		else
		{
			hr2=hr-hr1;
		}
		if(min1>min)
		{
			min2=min1-min;
		}
		else 
		min2=min-min1;
		System.out.println(hr2+" "+min2);
	}
}
