import java.util.*;
 class Dcoder
 { 
	public static void main(String args[])
 	{ 
		Scanner input=new Scanner(System.in);
		String password=input.next();
		String example="Abcdefgh2";
		System.out.println(valid(example));
		System.out.println(valid(password));
		}
		public static boolean valid(String password){
			Boolean uppercase=true, digits=true, symbols=true, ilength=true;
			if (!password.matches(".*[A-Z].*")) {	
			uppercase=false; 
			}
			if (!password.matches(".*[0-9].*")){
			digits=false; 
			}
			if (password.length()<=8){
			ilength=false;
			}
			if (password.matches(".*[%_#>+×÷=<'-/^*:;,?].*")){
			symbols=false;
			}
				Boolean ifinal=false;
				if(uppercase&&digits&&symbols&&ilength)ifinal=true;
				return ifinal;
		}
 	}
 
