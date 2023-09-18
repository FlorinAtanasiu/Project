package helloword;

class Peste{
	private String name;
	private int age;
	
	public Peste() {
		 this("nunu", 7);
		 System.out.println("Constructor is running!");
		 
	}
	public Peste(String name) {
		this(name, 0);
		System.out.println("second constructor running!");
		this.name = name;
	}
	public Peste(String name, int age) {
		this.name = name;
	    this.age = age;
		System.out.println("Thirds constructor running!");
	}
}

public class Constructors {

	public static void main(String[] args) {
		
		
	  Peste frog1 = new Peste();
	  
	  Peste frog2 = new Peste("nunu");
	  
	  Peste frog3 = new Peste("nunu", 7);

	}

}
