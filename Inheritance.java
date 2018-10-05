import java.util.*;

 class Dcoder
 { 
	public static void main(String args[])
 	{ 
		System.out.println("Input the number of people");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println("Input the Age, Name and Profession of each");
		int[] Age=new int[number];
		String[] Name=new String[number];
		String[] Prof=new String[number];
		for(int i=0;i<number;i++){
			int age=input.nextInt();
			String name=input.next();
			String prof=input.next();
			Age[i]=age;
			Name[i]=name;
			Prof[i]=prof;
		}

		Person Lilit=new Person(Age,Name);
		Lilit.PrintIt();
		Person Lilit2=new Child(Age,Name,Prof);
		Lilit2.PrintIt();
 	}
 }
class Person{
	int[] Age;
	String[] Name;
	public Person(int[] Age, String[] Name){
	this.Age=Age;
	this.Name=Name;
	}
	public void PrintIt(){
		for(int i=0;i<Age.length;i++){
			if (Age[i]<25){
				System.out.println(Name[i]);
			}
		}
	}
}
class Child extends Person{
	String[] Prof;
	public Child(int[] Age, String[] Name, String[] Prof){
	super(Age,Name);
	this.Prof=Prof;
	}
	public void PrintIt(){
		for(int i=0;i<Age.length;i++){
			if (Age[i]<25 && Prof[i].equalsIgnoreCase("programmer")){
				System.out.println(Name[i]);
			}
		}
	}
}
