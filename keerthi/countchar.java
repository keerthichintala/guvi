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
		Scanner sc = new Scanner(System.in);
                        String str = sc.nextLine();
                        int charlength = 0;
for (int i = 0, length = str.length(); i < length; i++) {
  if (str.charAt(i) != ' ') {
    charlength++;
  }
}

        System.out.println(charlength);
	}
}
