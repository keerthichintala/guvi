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
		double bl=s.nextDouble();
		double lb=s.nextDouble();
		double k=bl*lb;
		double b=Math.round(k*100000.0)/100000.0;
		System.out.print(b);
	}
}
