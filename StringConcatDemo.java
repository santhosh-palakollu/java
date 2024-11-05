import java.io.*;
import java.lang.*;
class StringConcatDemo
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="World";
		String s3=s1.concat(s2);
		System.out.println("The result of S1 concat S2 is "+s3);
		String s4="Sasi Site Welcome Hello";
		String s5=s4.join("WEL",s2);
		System.out.println("The result of S4 join S2 is "+s5);
		System.out.println("Result of s1+s2 is  "+(s1+s2));
	}
}
