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
		int N=s.nextInt();
		int A=s.nextInt();
		int D=s.nextInt();
		int n=A+(N-1)*D;
		int k=((A+n)*N)/2;
		System.out.println(k);
	}
}
