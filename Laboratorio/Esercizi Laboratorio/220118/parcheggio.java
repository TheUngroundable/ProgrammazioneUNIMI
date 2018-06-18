import java.util.*;
import java.io.*;

//per il commento guarda il filtro A

public class parcheggio{

	public static void main(String[] args) {

		LinkedList<Integer> parcheggi = new LinkedList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		String posti = scan.nextLine();
		String veicoli = scan.nextLine();

		scan = new Scanner(posti);

		while(scan.hasNextInt()){

			int posto = scan.nextInt();

			if(posto >= 1 && posto <=10){

				parcheggi.add(posto);

			}

		}

		scan = new Scanner(veicoli);

		while(scan.hasNextInt()){

			int veicolo = scan.nextInt();
			
			if(veicolo >= 1 && veicolo <=10){

				int dove = parcheggi.indexOf(veicolo);

				if(dove >= 0){

					parcheggi.remove(dove);

				}

			}

		}


		for(Integer i : parcheggi ){

			System.out.print(i);
			System.out.print(" ");

		}

	}
	
}

