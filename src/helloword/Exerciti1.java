package helloword;

class Animale {
	String denumire;
	String specie;
	String sunet;
	int numspecimene;
	int varsta;
	int viteza;

	void speak() {
		System.out.println("This animal sounds like this:" + sunet);
	}

	void speed() {
		System.out.println("This animal can go as fast as: " + viteza + "km/h");
	}
	
	int calculeazaVarstaPanaLaPensie() {
		int varstaRamasa = 45 - varsta;
	
		return varstaRamasa;
	}
	
	int getVarsta() {
		 return varsta;
	}
	
	String getDenumire() {
		return denumire;
	}
}

public class Exerciti1 {
	public static void main(String[] args) {

		Animale pisica = new Animale();
		pisica.denumire = " Felis catus ";
		pisica.specie = " Felidae ";
		pisica.sunet = " miau miau ";
		pisica.numspecimene = 200000;
		pisica.varsta = 20;
		pisica.viteza = 48;
		//pisica.speak();
		//pisica.speed();
		pisica.calculeazaVarstaPanaLaPensie();

		Animale caine = new Animale();
		caine.denumire = " Canis lupus familiaris ";
		caine.specie = " canide ";
		caine.sunet = " woof ";
		caine.numspecimene = 300000;
		caine.varsta = 20;
		caine.viteza = 72;
		caine.speak();
		caine.speed();
		caine.calculeazaVarstaPanaLaPensie();
	
		
		int varsta = pisica.calculeazaVarstaPanaLaPensie();
		System.out.println("Ani pana la Pensie " + varsta);
		
		int varstaa = pisica.getVarsta();
		String denumire = pisica.getDenumire();
		
		System.out.println(varsta);
		
	}
}
