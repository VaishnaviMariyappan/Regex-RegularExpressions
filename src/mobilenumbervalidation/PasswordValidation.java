package mobilenumbervalidation;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PasswordValidation {

		private Pattern pattern;
		private Matcher matcher;
		private static final String PASSWORD_REGEX = "((?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[@#$%]).{6,20})";
		public PasswordValidation()
		{
			pattern=Pattern.compile(PASSWORD_REGEX);
			
		}
	  public boolean validate(final String password)
	{
	matcher = pattern.matcher(password);
	return matcher.matches();
	}
	  public class Regex
	  {
		  public static void main(String[]args)
		  {
			  PasswordValidation passwordvalidator=new PasswordValidation();
			  System.out.println("'Vaishnavi@123' is valid? = "+ passwordvalidator.validate("Vaishnavi@123"));
		  }
	  }
	}

