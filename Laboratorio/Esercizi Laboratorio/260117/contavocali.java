import java.util.*;
import java.io.*;


public class contavocali{

	public static void main(String[] args) {
		//Classico Scanner
		Scanner in = new Scanner(System.in);
		//Variabili
		int counter = 0;
		int media = 0;
		int max = 0;

		do{
			//Pesca parola per parola mettendo il resto della riga nel buffer
			String parola = in.next();
			//Vocali nella parola
			int vocali = 0;
			//Per ogni lettera della parola
			for(int i = 0; i<parola.length(); i++){
				//Trasformala in carattere minuscolo
				char lettera = Character.toLowerCase(parola.charAt(i));
				//Confronta se è vocale minuscola
				if(lettera == 'a' || lettera == 'i' || lettera == 'u' || lettera == 'e' || lettera == 'o'){
					//Se si, incrementa
					vocali++;

				}

			}
			//Se il numero di vocali supera il massimo
			if(vocali > max){
				//Sovrascrivi il nuovo massimo
				max = vocali;	

			}
			//Aumenta il contatore di parole totali
			counter++;
			//Aggiungi alla somma per la media le vocali della parola appena trattata
			media += vocali;
		//Fino a quando l' utente non preme CTRL-Z o CTRL-D su riga vuota
		}while(in.hasNext());	
		//Stampa la media dividendo la somma per il numero di parole e il massimo
		System.out.println("media: "+(media/counter));
		System.out.println("max: "+max);

	}

}