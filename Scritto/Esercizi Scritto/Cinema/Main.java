import java.util.*;

public class Main{

	public static void main(String[] args){

		Posto[] posti = new Posto[10];

		//Cinema cinema = new Cinema();

		LinkedList<Spettatore> spettatori = new LinkedList<Spettatore>();
		LinkedList<Biglietto> biglietti = new LinkedList<Biglietto>();

		//ad ogni posto assegno un posto

		for(int i = 0; i<10; i++){

			posti[i] = new Posto(i, 'a');

		}

		Cinema cinema = new Cinema("Film Bellissimo", "Alle 10", posti);

		System.out.println("Posti liberi: "+cinema.postiLiberi());

		//System.out.println("Posto libero: "+cinema.getPostoLibero().toString());

		//ad ogni biglietto

		for(int i = 0; i<posti.length; i++){

			biglietti.add(new Biglietto("Film Bellissimo", "Alle 10", posti[i], 100));

		}

		for(int i = 0; i<posti.length; i++){

			spettatori.add(new Spettatore("Nickname"+i, "Email"+i));
			spettatori.get(i).compraBiglietto(biglietti.get(i));

		}


		System.out.println("Posti Occupati: "+cinema.postiOccupati());

		System.out.println("Incasso: "+cinema.incasso());

		System.out.println("Posto libero: "+cinema.getPostoLibero().toString());


	}

}