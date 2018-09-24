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
		Scanner si=new Scanner(System.in);
		int p,t,r;
		p=si.nextInt();
		t=si.nextInt();
		r=si.nextInt();
		int res=(p*t*r)/100;
		System.out.print((int)Math.floor(res));
	}
}
