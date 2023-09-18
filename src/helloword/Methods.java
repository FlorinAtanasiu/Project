package helloword;

class Castraveti {

	String name;
	int age;

	// Clases can contain:

	// 1.data
	// 2.Subroutines(Methods)
	void speak() {
		 for (int  i=0; i<3; i++) {
			 
			 System.out.println("My name is: " + name + " and i am " + age + " months old ");
		 }
    
	}
	
	void sayHello( ) {
		System.out.println("hello there");
	}

}

public class Methods {
	public static void main(String[] args) {

		
		Castraveti c1 = new Castraveti();
		c1.name = "castravete";		
	    c1.age = 2;
	    c1.speak();
		c1.sayHello();
	    
		
	    System.out.println("\n");
	    
	    
		Castraveti c2 = new Castraveti();
		c2.name = "castravete2";
		c2.age = 1;
		c2.speak();
		c2.sayHello();

       
	}

}
