package helloword;

class Person {
	// Instante variabile (data or "state")
	String name;
	int age;

	// clasele pot contine

	// 1. Date
	// 2. sub rutina(subrutine) (Methods)

}


class Muraturi {
	String nume;
	String dataDeproducere;
	String dataDeExpirare;

	double cantitateOtet;
    double cantitateSare;
	double cantitateZahar;
}

public class Clasa1 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		
		person1.name = "Michele morone";
		person1.age = 10;
		
		Person person2 = new Person();
		person2.name = "Nikita";
		person2.age = 10;
		
		System.out.println(person1.name);
		System.out.println(person2.name);
        
		
		Muraturi muraturi2 = new Muraturi();
		muraturi2.nume = "Camara lui Costica";
		muraturi2.dataDeproducere = "May.2023";
		muraturi2.dataDeExpirare = "May.2025";
		
		muraturi2.cantitateOtet = 2.3;
		muraturi2.cantitateSare = 1.2;
		muraturi2.cantitateZahar = 0.3;
		
		System.out.println(muraturi2.nume);
		System.out.println(muraturi2.dataDeproducere);
		System.out.println(muraturi2.dataDeExpirare);
		
		System.out.println(muraturi2.cantitateOtet +"ml");
		System.out.println(muraturi2.cantitateSare +"ml");
		System.out.println(muraturi2.cantitateZahar +"ml");
		
	}

}
