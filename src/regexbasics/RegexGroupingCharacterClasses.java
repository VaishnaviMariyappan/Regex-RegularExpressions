package regexbasics;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	
	public class RegexGroupingCharacterClasses
	{

	public static void main(String[]args)
		{
			String sentence ="abcaabbjikokoptuiopolkhhfdsaxccvvbbnnccaaAaabbbcabC3255612150%0990-0@#$!!!";
			Pattern p=Pattern.compile("[^a-zA-Z)0-9]");
			Pattern p1=Pattern.compile("[^ab]");
			Matcher m=p.matcher(sentence);
			Matcher m1=p1.matcher(sentence);
			while(m.find())
			{
				System.out.println(m.group());
				
			}
			
			while(m1.find())
			{
				System.out.println(m1.group());
				
			}
	}
	}


