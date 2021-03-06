/*
1. define your info in hashmap
2. define your string in program
3. search the pattern and matcher in prgram and replace string
*/
import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.text.*;
public class RegularExpDemo
{
	public static void main(String args[])
	{
		ArrayList <String> arrList=new ArrayList <String>();

		arrList.add("Pooja");
		arrList.add("Pooja Jadhav");
		arrList.add("9876543210");

		String pattern="Hello <<name>> We have your full name as <<full name>> in our system.Please, let us know in case of any clarification Thank you !";

		String name=arrList.get(0);
		String fullName=arrList.get(1);
		String mobNo=arrList.get(2);

		String match1="<<name>>";
		String match2="<<full name>>";

		Pattern p=Pattern.compile("<<name>>");
		Matcher m=p.matcher(pattern);
		pattern=m.replaceAll(name);

		Pattern p1=Pattern.compile("<<full name>>");
		Matcher m1=p1.matcher(pattern);
		pattern=m1.replaceAll(fullName);

		System.out.println(pattern);
	}
}
