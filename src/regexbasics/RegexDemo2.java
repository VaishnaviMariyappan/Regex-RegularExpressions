package regexbasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 
{
	public static void main(String[] args)
	{
		String Str = "Photographs play an important role in everyone";
		Pattern p = Pattern.compile("e|o");
		Matcher m = p.matcher(Str);
		while(m.find())
		{
			System.out.println(m.group() + "Starts at" +m.start() + "and Ends with" +m.end());
		}
	}
}



