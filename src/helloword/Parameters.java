package helloword;

class Frog {
	private String name;
	private int code;
	private int age;
	
	public Frog() {
		System.out.println("constructor runing!");//scrii aici ce e in main ca sa nu mai scrii in main
		name = "nunu";
	}
	public Frog(String name) {
		
		System.out.println("Second constructor runnin!");
		this.name = name;
		
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public void setAge(int age) {
		this.age =age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("moving " + distance + " in direction " + direction);
	}	

}

public class Parameters {

	public static void main(String[] args) {

		Robot sam = new Robot();

		sam.speak("hi, am sam");
		sam.jump(7);
		sam.move("forward", 2.6);

		Frog frog1 = new Frog();
	    //frog1.name = "NUNU";
		//frog1.age = 7;
		 
		frog1.setName("NUNU"); 
        
		Frog frog2 = new Frog("NUNU");
		
		System.out.println(frog1.getName() + "    " + frog1.getAge());
		
		
	}

}
