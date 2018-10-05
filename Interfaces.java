
import java.util.*;

 class Dcoder
 { 
	public static void main(String args[])
 	{ 

		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphin());
		o.checkSound(new Whale());
 	}
 }
interface LivesInOcean {
	 abstract void makeSound(); 
 }
 
 
 
class Oceanographer{
	
	public void checkSound(LivesInOcean o){
		o.makeSound();
	}	
	
}
class Whale implements LivesInOcean{
	public void makeSound(){
		System.out.println("Whale Sound");
	}
}
class Dolphin implements LivesInOcean{
	public void makeSound(){
		System.out.println("Dolphin Sound");
	}
}
