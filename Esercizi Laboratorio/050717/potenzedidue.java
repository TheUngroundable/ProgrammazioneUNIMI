
import java.util.*;
import java.io.*;

public class potenzedidue{

	public static void main(String[] args) {
		//Scanner normalissimo
		Scanner in = new Scanner(System.in);
		//
		boolean success = false;
		int counter = 0;
		boolean empty = false;

		//Se non sono stati passati numeri per riga di comando, ferma tutto
		if(args.length == 0){

			System.out.println("Nessun input");
			empty = true;

		}

		//Se l' array dei numeri passati per riga di comando non è vuoto
		if(!empty){
			//Guarda un numero per volta
			for(int i = 0; i< args.length; i++){
				//Convertilo in Integer
				int numero = Integer.valueOf(args[i]);
				//Fintanto che il numero è maggiore o uguale a 2
				do{

					//Controlla se è divisibile per 2
					if(numero % 2 == 0){
						//Se lo è, dividilo per due
						numero /= 2;

					} else {
						//Altrimenti non è nemmeno pari quindi non è multiplo di 2, interrompi tutto
						break;

					}

					//Se magicamente il quziente della divisione per 2 è 1
					if(numero / 2 == 1){
						//Siginifica che il nostro numero è 2 e quindi è divisibile per se stesso
						success = true;
						//Il nostro numero è potenza di 2

					}

				}while(numero >= 2);

				//Se quindi non è stato riscontrato nessun errore
				if(success){

					//Incrementa il contatore di uno e resetta il flag di successo
					counter++;
					success = false;
				
				}

			}

			//Stampa il numero di numeri potenze di 2
			System.out.println(counter);		

		}

		

	}


}