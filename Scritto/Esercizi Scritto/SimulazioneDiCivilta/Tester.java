import java.util.*;

public class Tester {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);


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
		

		System.out.println("Test classe Citta");

		System.out.println("Creo una nuova civiltà");
		Civilta civilta1 = new Civilta("Impero Romano");


		civilta1.fondaCitta("Roma", new Risorsa("Zucchero", 10));
		civilta1.fondaCitta("Milano", new Risorsa("Pietra", 20));


		System.out.println(civilta1.toString());

		System.out.println("Civilta1 fai produrre");

		civilta1.faiProdurre();


		System.out.println(civilta1.toString());

		Civilta civilta2 = new Civilta("Impero di sto cazzo");

		civilta2.fondaCitta("Bergamo", new Risorsa("Palazzi", 1000));
		civilta2.fondaCitta("Casalpusterlengo", new Risorsa("Divertimento", 55));

		civilta2.faiProdurre();


		System.out.println("Civilta1 equals Civilta2: "+civilta1.equals(civilta2));

		Civilta civilta3 = new Civilta("Impero Romano");


		civilta3.fondaCitta("Roma", new Risorsa("Zucchero", 10));
		civilta3.fondaCitta("Milano", new Risorsa("Pietra", 20));


		System.out.println(civilta3.toString());

		System.out.println("Civilta3 fai produrre");

		civilta3.faiProdurre();

		System.out.println("Civilta1 equals Civilta3: "+civilta1.equals(civilta3));


		System.out.println("-----------------------------------");
		

		System.out.println("Test classe Citta");

	}

}