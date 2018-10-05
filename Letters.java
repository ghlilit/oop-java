import java.util.*;

 class Dcoder
 { 
	public static void main(String args[])
 	{ 
 		String exps="Frankness applauded by supported ye household.";
 		int letters=0, words=0, stc=0;
 		for(int i=0;i<exps.length();i++){
 			if(exps.charAt(i)==' '||i==exps.length()-1){
 				
 			if(letters>=3){
 			words++;
 			}
 			letters=0;
 		}
 			else{
 				letters++;
 			}
 		if(exps.charAt(i)=='?'||exps.charAt(i)=='.'||exps.charAt(i)=='!'){
 			stc++;
 		}
 		}
 		
 			System.out.println("Number of words="+words);
 			System.out.println("Number of sentences="+stc);
 		}
 }
