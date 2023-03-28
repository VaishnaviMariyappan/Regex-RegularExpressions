package mobilenumbervalidation;
	
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mobilenovalidation 
{
public static void main(String[] args)
{
String mobile="9788835431";
Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
Matcher m=p.matcher(mobile);
if(m.find())
System.out.println(m.group()+"is valid mobile no.");
else
System.out.println(mobile+" is valid mobile no");
}
}

