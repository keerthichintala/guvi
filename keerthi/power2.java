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
		int count=0;
		while(n>2)
		{
			if((n%2)==1){
			count++;
			break;}
		
		n=n/2;
	}
	if(count==1)
	System.out.print("no");
	else
	System.out.print("yes");
	}
}
