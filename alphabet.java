/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		byte cc=(byte)c;
		if(((cc>=65)&&(cc<=90))||((cc>=97)&&(cc<=122)))
		{
			c=(char)(cc);
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("NO");
		}
		}
	
}
