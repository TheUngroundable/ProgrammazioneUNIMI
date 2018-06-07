import java.util.*;
import java.io.*;


public class trovaparole{
	//Throws FileNotFoundException perchè non ho cazzi di implementare il try...catch, funziona lo stesso
	public static void main(String[] args) throws FileNotFoundException {

		//Variabile per il percorso
		String path = "wiseman.txt";
		//Carico il file sullo scanner con il FileReader
		Scanner file = new Scanner(new FileReader("./"+path));

		//Mi salvo le parole passate da linea di comando in un posto sicuro
		String[] parole = args;
		//E creo un array parallelo di boolean che si autoinizializza a false
		boolean[] counter = new boolean[parole.length];
		//Per ogni parola nel file in buffer
		do{	
			//Pescala
			String parolainfile = file.next();
			//e per ogni parola di linea di comando
			for(int i = 0; i<parole.length; i++){
				//Controlla se la sua lunghezza è uguale alla lunghezza della parola in buffer
				if(parole[i].length() == parolainfile.length()){
					//Se lo è setta il counter parallelo alla parola di input che stiamo cercando a true
					counter[i] = true;

				}

			}

		}while(file.hasNext());
		//Per ogni parola in input
		for(int i = 0; i<parole.length; i++){
			//Stampa il testo
			System.out.print(parole[i]+": ");
			//Se la cella parallela è true
			if(counter[i]){
				//Stampa +
				System.out.println("+");

			} else {
				//Altrimenti stampa 0
				System.out.println("0");

			}

		}

	}

}