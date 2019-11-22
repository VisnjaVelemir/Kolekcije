package liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {
		
		
/*		String ime = "Stevo"; 
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
		}*/
		
		
		
		
		// lista int-ova mora preko wraper klase Integer...
		
		List<Integer>brojevi = new ArrayList <Integer>();
		
		
		Soldier soldier1 = new Soldier ();
		
			soldier1.setName ("VisnjaKiller");
			soldier1.setHealth(100);
			soldier1.setMoney (16000);
			soldier1.setTeam("Terorists");
			
			
		Soldier soldier2 = new Soldier ();
			
			soldier2.setName ("Fanste");
			soldier2.setHealth(100);
			soldier2.setMoney (16000);
			soldier2.setTeam("Terorist");
		
		
		Soldier soldier3 = new Soldier ();
			
			soldier3.setName ("Vladd");
			soldier3.setHealth(100);
			soldier3.setMoney (16000);
			soldier3.setTeam("Kanter");
		
		
		
		
			Soldier soldier4 = new Soldier ();
		
			soldier4.setName ("Dovla");
			soldier4.setHealth(100);
			soldier4.setMoney (16000);
			soldier4.setTeam("Kanter");
		
		System.out.println(soldier4.getName ());
		
			Soldier soldier5 = new Soldier ();
			
			soldier5.setName ("Vortex");
			soldier5.setHealth(100);
			soldier5.setMoney (16000);
			soldier5.setTeam("Kanter");
		
		
		
			Soldier soldier6 = new Soldier ();
			
			soldier6.setName ("Mar");
			soldier6.setHealth(100);
			soldier6.setMoney (16000);
			soldier6.setTeam("Teror");
		
		
		
		
		List<Soldier> terori = new ArrayList<Soldier> (); 
		
		
		List<Soldier> terorists = new ArrayList <Soldier> ();
			terorists.add (soldier1);
			terorists.add (soldier2);
			terorists.add (soldier6);
			
		List<Soldier> kanteri = new ArrayList <Soldier> ();
			kanteri.add(soldier3); 
			kanteri.add(soldier4);
			kanteri.add(soldier5);
		
		
		System.out.println("Ekipa terorista je: ");
		
		
		for (Soldier s: terorists) {
			System.out.println(s.getName());
		}
		
		
		System.out.println("Ekipa kantera je: ");
		
		for (Soldier s: kanteri) {
			System.out.println(s.getName());
		}
		
		
		
		
		
		Weapon firearm = new FireArm ();
		Weapon knife = new ColdWeapon ();
		
		
		List<Weapon> myWeapon = new ArrayList<Weapon> ();
		myWeapon.add(knife);
		myWeapon.add(firearm);
		
		
		soldier3.setRanac(myWeapon);
		
		
		soldier3.getRanac().get(1).hit(soldier4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
