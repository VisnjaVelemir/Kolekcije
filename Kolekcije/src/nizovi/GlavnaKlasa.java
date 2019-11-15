package nizovi;

public class GlavnaKlasa {

	public static void main(String[] args) {
	
		
		
		int array [];   // deklaracija niza, array je ime promenljive, int je tip promeljnive, a zagrade 
		// su oznaka za niz 
		
		
		
		
		int [] array1 = new int [5]; // inicijalizacija, ovde odvoji 5 praznih mesta
		
		
		int [] array2 = new int [5];
		
		// 1. nacin
		
		array2 [0] = 53;
		array2 [1] = 29;
		array2 [2] = 13;
		array2 [3] = 62;
		array2 [4] = 69;
		
		System.out.println("Treci clan niza je " + array2 [2]);

		
		
		// 2. nacin
		
		int [] niz = {12,89,36,63,79};
		
		System.out.println("Treci clan arraya je " + niz [2]);
		
		
		
		
		// niz stringova
		
		String [] imena = {"Pera", "Vidoje", "Violeta", "Ljubica"};
		
		System.out.println("Ovde ima " + imena.length + " imena ");
		
		for (int i = 0; i< imena.length; i++) {
			System.out.println( imena[i]);
		}
		
		int i = 0;
		while ( i < imena.length) {
			System.out.println(imena[i]);
			i++;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
