package regexbasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{
	public static void main(String args[])
	{
		String Sentence = "Elephants are the largest land mammals on earth and have distinctly massive bodies, large ears, and long trunks. ";
		Pattern p = Pattern.compile("are");
		Matcher m = p.matcher(Sentence);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
