package mobilenumbervalidation;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class usernamevalidation {

	
			   int name;
			   String[]userNames= {"Vaishnavi","kayal","anitha","hAritha"};
			   String mobiles[]= {"265","176","918","742"};
			   String citys[]= {"Chennai","Madurai","Salem","Erode"};
			   public usernamevalidation()
			   {
				   name=4;
			   }
			   public void generateName()
			   {
				   Random rand=new Random();
				   String userName = userNames[rand.nextInt(name)];
				   String mobile= mobiles[rand.nextInt(name)];
				   String city= citys[rand.nextInt(name)];
				   System.out.println(userName+mobile+"  "+city);	   					
			   }	   
			   public static boolean isValidUsername(String name)
			    {
			        String regex = "^[A-Za-z]\\w{5,29}\\d{3}$";
			        Pattern p = Pattern.compile(regex); 
			        Matcher m = p.matcher(name);
			        return m.matches();
			    }
			   
			   public static void main(String[]args)
			   {
				   usernamevalidation rng=new usernamevalidation();
				   System.out.println("List of Random names");
				   int counter=1;
				   while(counter<=3)
				   {
					   rng.generateName();
					   counter++;
				   }	   
			   
			   }
	}



			  
	

