package mape;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GlavnaMape {

	public static void main(String[] args) {
		
		
		
		// HashMap (); put je komanda, i key i value su obavezni
//kastovanje je pretvaranje objekta u nesto sto nam treba
		
		
		
		Map <Integer,String> mojaMapa = new HashMap <Integer,String> ();
		
			mojaMapa.put(3, "Igor");
			mojaMapa.put(69, "Stefan");
			mojaMapa.put(96, "Visnja");
			
			String imePolaznika = mojaMapa.get(3);
			System.out.println(imePolaznika);
			
			
			
		
		
		System.out.println("Map preko for petlje");
		
		for (Object o: mojaMapa.entrySet ()) {
			
			Map.Entry<Integer, String>mapEntry = (Map.Entry<Integer, String>) o;
			
			System.out.println("Key: " + mapEntry.getKey ());
			System.out.println("Value: " + mapEntry.getKey ());
		}
		
		
		System.out.println("Map preko iteratora");
		
		Iterator<Entry<Integer, String>> mapIterator = mojaMapa.entrySet().iterator ();
		
	
			
			while (mapIterator.hasNext()) {
				
				Map.Entry<Integer, String> a  = mapIterator.next();
				System.out.println("Key: " + a.getKey ());
				System.out.println("Value: " + a.getKey ());
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
