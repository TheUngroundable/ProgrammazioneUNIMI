import java.util.*;

public class Tester {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		/*

		System.out.println("-----------------------------------");

		System.out.println("Test classe Risorsa");
		Risorsa r1 = new Risorsa("Petrolio", 100);
		Risorsa r2 = new Risorsa("Legno", 5);

		System.out.println(r1.toString());
		System.out.println(r1.hashCode());
		System.out.println(r2.toString());
		System.out.println(r2.hashCode());

		System.out.println(r1.equals(r2));

		System.out.println("-----------------------------------");
		

		System.out.println("Test classe Citta");

		Citta citta1 = new Citta("Atene", r1);
		Citta citta2 = new Citta("Sparta", r2);

		System.out.println(citta1.toString());
		System.out.println(citta2.toString());
		System.out.println("Citta1 equals Citta2: "+citta1.equals(citta2));


		System.out.println("-----------------------------------");
		*/

		System.out.println("Test classe Civilta");

		//Civilta 1
		Civilta civilta1 = new Civilta("Impero Romano");
		civilta1.fondaCitta("Roma", new Risorsa("Zucchero", 10));
		civilta1.fondaCitta("Milano", new Risorsa("Pietra", 20));
		civilta1.fondaCitta("Rieti", new Risorsa("Palazzi", 100));
		civilta1.fondaCitta("Napoli", new Risorsa("Divertimento", 55));
		//System.out.println(civilta1.toString());
		civilta1.faiProdurre();

		//Civilta 2
		Civilta civilta2 = new Civilta("Impero di sto cazzo");
		civilta2.fondaCitta("Bergamo", new Risorsa("Palazzi", 100));
		civilta2.fondaCitta("Casalpusterlengo", new Risorsa("Divertimento", 55));
		civilta2.faiProdurre();
		//System.out.println(civilta2.toString());
		
		//System.out.println("Civilta1 equals Civilta2: "+civilta1.equals(civilta2));

		//Civilta 3
		Civilta civilta3 = new Civilta("Impero dell' Est");
		civilta3.fondaCitta("Venezia", new Risorsa("Zucchero", 10));
		civilta3.fondaCitta("Verona", new Risorsa("Pietra", 20));
		civilta3.fondaCitta("Trieste", new Risorsa("Gatti Cotti", 65));
		//System.out.println(civilta3.toString());
		civilta3.faiProdurre();

		//System.out.println("Civilta1 equals Civilta3: "+civilta1.equals(civilta3));

		//Civilta 4
		Civilta civilta4 = new Civilta("Impero NordNord");
		civilta4.fondaCitta("Monaco", new Risorsa("Birra", 10));
		civilta4.fondaCitta("Berlino", new Risorsa("Birra", 10));
		//System.out.println(civilta3.toString());
		civilta4.faiProdurre();



		System.out.println("-----------------------------------");
		

		System.out.println("Test classe Storia");

		LinkedList<Civilta> listaCivilta = new LinkedList<Civilta>();

		
		listaCivilta.add(civilta1);
		listaCivilta.add(civilta2);
		listaCivilta.add(civilta3);
		listaCivilta.add(civilta4);

		Storia sto = new Storia(listaCivilta);


		sto.commercia();

		listaCivilta = sto.getListaCivilta();

		for(Civilta civilta : listaCivilta){

			System.out.println(civilta.toString());

		}

		System.out.println("Civilta più ricca");
		System.out.println(sto.piuRicca().toString());

		System.out.println("---------------------------------");

		sto.evolvi(4);
		
		listaCivilta = sto.getListaCivilta();

		for(Civilta civilta : listaCivilta){

			System.out.println(civilta.toString());

		}

		sto.conquista();

		System.out.println("-------------------");

		listaCivilta = sto.getListaCivilta();

		for(Civilta civilta : listaCivilta){

			System.out.println(civilta.toString());

		}



	}

}