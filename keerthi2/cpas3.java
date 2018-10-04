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
		    String source = " ";
		    Scanner s=new Scanner(System.in);
		    source=s.nextLine();
    StringBuffer res = new StringBuffer();

    String[] strArr = source.split(" ");
    for (String str : strArr) {
        char[] stringArray = str.trim().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        str = new String(stringArray);

        res.append(str).append(" ");
    }

    System.out.print(res.toString().trim());

	}
}
