import java.util.*;
 class Dcoder
 { 
	public static void main(String args[]) {
 Scanner input=new Scanner(System.in);
 int length=input.nextInt();
 int []user=new int[length];
 for(int i=0;i<length;i++){
 	user[i]=input.nextInt();
 }
 System.out.println(palindrome(user));
 }
 
 public static Boolean palindrome(int[]array)
 {
 	Boolean palindrome=true;
 	int length=array.length-1;
 	for(int i=0;i<length;i++){	
 	if(array[i]!=array[length-i])
 	{
 		palindrome=false;
 	}}
  	return palindrome;	
 }
}
