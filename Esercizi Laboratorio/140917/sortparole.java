import java.util.*;
import java.io.*;


public class sortparole{

	public static void main(String[] args) {
		//Variabile di percorso
		String path;
		//Se non ci sono argomenti passati da linea di comando
		if(args.length<1){
			//Avverti l' utente
			System.out.println("Percorso non inserito! Errore!");
			//Carino, è un modo per chiudere effetivamente la funzione di main
			return;

		} else {
			//Se tutto rego allora il primo parametro passato è il percorso
			path = args[0];

		}

		//Try catch per il file, puoi usare anche FileNotFoundException sulla riga del mail prima della prima graffa
		try{
			//Lo scanner file NECESSITA DEL TRY AND CATCH
			Scanner file = new Scanner(new FileReader("./"+path));	
			//Lista di trasposizione del nostro file
			LinkedList<String> transposed = new LinkedList<String>();

			do{
				//fintanto che becchi delle parole con next()
				//aggiungi alla lista trasposta la parola pescata
				transposed.add(file.next());

			}while(file.hasNext());
			//MergeSort (Legit!)
			Collections.sort(transposed);
			//Foreach di output
			for(String parola : transposed){

				System.out.println(parola);

			}

		}catch(FileNotFoundException e){

			System.out.println("Errore! File non trovato!");

		}
	
	}

}