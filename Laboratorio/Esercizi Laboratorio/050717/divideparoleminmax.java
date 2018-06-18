
import java.util.*;
import java.io.*;

public class divideparoleminmax{

	public static void main(String[] args) {
		
		//Prima creo uno scanner con il file, controllando se solleva
		//o no un FileNotFoundException
		try{

			//Percorso passato da linea di comando
			String path = args[0];
			//Costruttore dello Scanner con il FileReader e il percorso passato da cmd
			Scanner in = new Scanner(new FileReader("./"+path));
			//Due linked list per salvare le parole che iniziano per maiuscola
			LinkedList<String> maiuscole = new LinkedList<String>();
			//e una per quelle con minuscole
			LinkedList<String> minuscole = new LinkedList<String>();

			//Fintanto che c'è una parola nel buffer,
			while(in.hasNextLine()){
				//Salvatela
				String parola = in.next();
				//Controlla se la prima lettera è maiuscola
				if(Character.isUpperCase(parola.charAt(0))){
					//Crea un flag dando per scontato che siano tutte lettere
					boolean isLetters = true;
					//Spazzola i caratteri della parola
					for(int i = 0; i<parola.length(); i++){
						//e se non è una lettera interrompi tutto avvisando che quindi la parola contiene non lettere
						if(!Character.isLetter(parola.charAt(i))){

							isLetters = false;
							break;

						}
					}
					//Se quindi contiene solo lettere
					if(isLetters){
						//Aggiungi alla lista delle parole che iniziano con le maiuscole
						maiuscole.add(parola);

					}

				//Ripeti tutto per vedere se iniziano con una minuscola e se sono tutte lettere
				} else if (Character.isLowerCase(parola.charAt(0))){

					boolean isLetters = true;

					for(int i = 0; i<parola.length(); i++){

						if(!Character.isLetter(parola.charAt(i))){

							isLetters = false;
							break;

						}
					}

					if(isLetters){

						minuscole.add(parola);

					}

				}
	
			}

			//Stampa tutte le Minuscole
			System.out.println("Minuscole: ");
			for(int i = 0; i<minuscole.size(); i++){

				System.out.println(minuscole.get(i));

			}

			//Stampa tutte le Maiuscole
			System.out.println("Maiuscole: ");
			for(int i = 0; i<maiuscole.size(); i++){

				System.out.println(maiuscole.get(i));

			}

		//Se il try solleva un FileNotFoundException
		}catch(FileNotFoundException e){

			//Avverti l' utente che il file non è valido o mancante
			System.out.println("File non valido o mancante");

		}
	}
}
