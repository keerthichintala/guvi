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
		float a=s.nextFloat();
		float d=s.nextFloat();
		float n=s.nextFloat();
		float k=n/2;
		float m=2*a+(n-1)*d;
	            float sum=k*m; 
		
		System.out.print((int)Math.floor(sum));
	}
}
