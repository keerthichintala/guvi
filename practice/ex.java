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
	Random rn = new Random();
	Scanner s=new Scanner(System.in);

int answer=0,b=0;
 answer = rn.nextInt(10);
 System.out.print(answer);
for(int i =0; i < 3; i++)
{
    int n=s.nextInt();
    if(answer==n)
    {
    b=1;
    break;
    }
    
}
if(b==1)
    System.out.print("yes");
    else
    System.out.print("no");
  
	}
}
