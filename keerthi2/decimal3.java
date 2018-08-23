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
		double dl=s.nextDouble();
		double lb=s.nextDouble();
		double k=dl*lb;
		System.out.printf("%.5f",k);
	}
}
