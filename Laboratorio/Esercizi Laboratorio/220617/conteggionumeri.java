import java.util.*;
import java.io.*;

public class conteggionumeri{

	public static void main(String[] args) {
		
		//Classico Scanner
		Scanner in = new Scanner(System.in);
		//Contatore numeri interi o con virgola
		int countInteri = 0;
		int countVirgola = 0;

		do{
			//Pesca la riga ma parola per parola (Attenzione all' uscita dal While)
			String parola = in.next();
			//Flag, diamo per scontato che sia un numero
			boolean isNumero = true;

			//Controlliamo carattere per carattere
			for(int i = 0; i<parola.length();i++){
				//E se è una lettera alfabetica, segnala che non è un numero
				if(Character.isLetter(parola.charAt(i))){

					isNumero = false;

				}

			}

			//Se NON inizia con un - ma contiene un -, non è un numero valido
			if(!parola.startsWith("-")&&parola.contains("-")){

				isNumero = false;

			}

			//Se è un numero
			if(isNumero){
				//Se contiene un . , vuole dire che è un numero con la virgola
				if(parola.contains(".")){
					//Incrementa il contatore dei decimali
					countVirgola++;

				} else {
					//Incrementa il contatore degli interi
					countInteri++;

				}

			}
		//Fintanto che il buffer contiene elementi e l' utente non chiude il buffer con ctrl-z
		}while(in.hasNext());
		//Stampa i risultati
		System.out.println("Interi: "+countInteri);
		System.out.println("Virgola: "+countVirgola);

	}

}