package liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {
		
		
		String ime = "Stevo"; 
		List lista = new ArrayList ();
		
		
		// dodavanje elemenata u listu, koristi se metoda add ();, a za "hvatanje elemenata liste je get (index); a za skidanje elementa iz liste se koristi remove ();
		
		
		
		lista.add(ime);
		lista.add(1987);
		lista.add(3.14);
		lista.add(false);
		
		// "hvatanje" elemenata liste
		
		
		System.out.println("Treci element liste je " + lista.get(2));
		
		
		// objekat se pretvara konverzijom tipa, napisemo zagradu i ono sto nam treba (kastovanje)
		//kad god metoda vraca objekat moramo da radimo kastovanje i to je ovo dole
		// npr Object o = newObject ();
		//O = (Festival)f;
		
		
		double x = (double) lista.get(2);
		System.out.println(x);
		
		// uvek se prave liste sa jednim tipom podatka (String ili int itd...) i to su:
		//GENERICKE LISTE
		
		List <String> imena = new ArrayList <String> ();
		
		imena.add("Djordje");
		imena.add("Marina");
		imena.add ("Bojan");
		
		
		
		
		String polaznik = (String) imena.get(1);
		System.out.println("Polaznici su: ");
		
		for (int i = 0; i< imena.size (); i++ ) {
			System.out.println(imena.get(i));
		}
		
		imena.remove (0); //uklanjamo element liste, kad je ovde  komanda sa remove prvi sysout ce nam 
		// izbaciti svih troje polaznika, a ako je iznad for petlje remove-ovao bi odmah
		// u drugom sysout ce nam izbaciti
		
		
		
		
		// petlja samo za liste...vrsta for petlje koja se zove napredna for petlja - for each
		
		for (String imePolaznika: imena) {
			System.out.println(imePolaznika);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
