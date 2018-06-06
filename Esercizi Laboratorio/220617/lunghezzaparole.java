import java.util.*;
import java.io.*;

public class lunghezzaparole{

	public static void main(String[] args) {
	
		//Classico Scanner
		Scanner in = new Scanner(System.in);
		//Il minimo è il massimo valore che un integer può avere
		//COsì ci chiediamo se il nostro primo input è minore di questo valore
		//così fissiamo effettivamente il minimo fra i nostri
		//Un numero arbitrariamente grande non sarebbe bastato
		int minimo = Integer.MAX_VALUE;
		//Variabili per contare il massimo, la somma della media, il contatore e il minimo
		int max = 0;
		int sommaMedia = 0;
		int counter = 0;

		do{
			//di tutta la riga prende parola per parola, ma rimane comunque nel buffer
			String parola = in.next();
			//aumenta il contatore
			counter++;

			//Se la lunghezza è minore della lunghezza minima
			if(parola.length()<minimo){

				//abbiamo una nuova lunghezza minima
				minimo = parola.length();

			}

			//altrimenti se supera il massimo
			if(parola.length()>max){
				//abbiamo un nuovo massimo
				max = parola.length();

			}
			//sommiamo al sommamedia il numero di lettere di questa parola
			sommaMedia += parola.length();

		//con Windows finisci di inserire tutto, premi invio per sicurezza, poi premi CTRL-Z
		//Con Linux ti attacchi a sto cazzo!!!! No, con CTRL-D su RIGA VUOTA

		//quindi fino a quando effettivamente il buffer non consuma tutte le parole, lui ripete il ciclo
		//in.hasNext() perchè sopra stiamo usando in.next()
		}while(in.hasNext());

		//Calcola la media
		int media = sommaMedia / counter;

		//Stampa l' output
		System.out.println("max: "+max);
		System.out.println("med: "+media);
		System.out.println("min: "+minimo);

	}

}