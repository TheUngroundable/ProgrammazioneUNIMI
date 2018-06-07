import java.util.*;
import java.io.*;


public class costoabbonamento{

	public static void main(String[] args) {

		//Mi rompeva il cazzo con l' inizializzazione
		char sesso = ' ';
		int eta = 0;
		//Flag per vedere se succede qualcosa di sbagliato
		boolean error = false;
		//Controllo se il primo argomento è una lettera,
		//ma dato che args è un array di Stringhe, pesco il primo carattere
		//e lo metto a lettera minuscola
		if(Character.isLetter(Character.toLowerCase(args[0].charAt(0)))){
			//Se è quindi una lettera minuscola, allora me la salvo come char
			sesso = Character.toLowerCase(args[0].charAt(0));
			//e vedo se è m o f
			if(sesso != 'm' && sesso != 'f'){
				//se ci sono problemi, avverto l' utente e setto il flag di errore a true
				System.out.println("Il sesso non corrisponde a maschio o a femmina!");
				error = true;

			}

		} else {
			//Se addirittura non era una lettera, flag true su errore
			System.out.println("Errore! Sesso non inserito correttamente");
			error = true;

		}
		//L'età è il secondo parametro passato come stringa e lo converto a intger
		eta = Integer.parseInt(args[1]);
		//se è < 1, setto l' errore a true avvertendo l' utente
		if(eta < 1){

			System.out.println("Errore! Età non inserita correttamente");
			error = true;

		}
		//Se l' età non è un integer
		if(!Character.isDigit(eta)){
			//Errore true e avverto l' utente
			System.out.println("Errore! Età non valida");
			error = true;

		}

		if(!error){
			//Variabile per il costo, conviene usare string per comodità
			String costo = "";
			//Switch controllando maschio o femmina e in base all' età setto il costo
			switch(sesso){

				case 'm':

					if(eta <= 10){

						costo = "0";

					} else if(eta >= 11 && eta <= 25){

						costo = "10";

					} else if(eta >= 26 && eta <= 64){

						costo = "18.50";

					} else if (eta >= 65 && eta <= 75){

						costo = "10";

					} else if( eta >= 75){

						costo = "0";

					}

				break;


				case 'f':

					if(eta <= 14){

						costo = "0";

					} else if(eta >= 15 && eta <= 30){

						costo = "10";

					} else if(eta >= 31 && eta <= 64){

						costo = "18.50";

					} else if (eta >= 65 && eta <= 75){

						costo = "10";

					} else if( eta >= 75){

						costo = "0";

					}


				break;

			}


			//Se il costo è 0, allora è gratis
			if(costo.equals("0")){

				System.out.println("Per te l' abbonamento è gratis!");

			} else {
				//Altrimenti stampo il costo effettivo
				System.out.println("L' abbonamento costa "+costo+" euro");

			}
		//Nel caso in cui l' errore è true	
		} else {	
			//Blocco tutto
			System.out.println("Lanciare di nuovo il programma");

		}

	}

}