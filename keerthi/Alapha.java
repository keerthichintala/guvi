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
char letter=s.next().charAt(0);
if(letter>=65&&letter<=122)
{
if(letter=='a'||letter=='e'||letter=='i'||letter=='0'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
{
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
}
else if(letter>=48&&letter<=57)
{
System.out.println("Digit");
}
else
{
System.out.println("invalid");
}
	}
}
