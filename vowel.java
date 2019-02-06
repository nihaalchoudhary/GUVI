/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		char i=s.next().charAt(0);
		byte c=(byte)i;
		if(((c>=65)&&(c<=90))||((c>=97)&&(c<=122)))
		{
			i=(char)c;
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
			else
			{
				System.out.println("Invalid");
			}
			
		
	}
	
}
