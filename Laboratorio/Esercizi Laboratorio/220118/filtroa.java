import java.util.*;
import java.io.*;


public class filtroa{
	//throws ... così non uso try catch per il file
	public static void main(String[] args) throws FileNotFoundException{

		//Scanner solito per file
		Scanner file = new Scanner(new FileReader("./"+args[0]));
		//Variabile per la somma precedente
		int sommaPrecedente = 0;
		
		//Fintanto che trovi parole nel buffer
		do{
			//Pesca e inizializza la somma locale
			String parola = file.next();
			int sommaCaratteri = 0;
			//Per ogni carattere somma il codice UNICODE
			for(int i = 0; i < parola.length(); i++){

				sommaCaratteri += parola.charAt(i);

			}

			//Carattere da stampare dopo
			char carattere;
			//Flag di controllo, do per scontato che siano tutte maiuscole e tutte miuscole
			boolean tutteMaiuscole = true;
			boolean tutteMinuscole = true;
			boolean carattereSpeciale = false;
			

			//LowerCase
			//Dando per scontato che sono tutte minuscole, per ogni lettera
			for(int i = 0; i<parola.length(); i++){
				//Controllo se NON è minuscola
				if(!Character.isLowerCase(parola.charAt(i))){	
					//Allora non sono tutte minuscole
					tutteMinuscole = false;
					//Interrompo
					break;

				}

			}

			//Uppercase
			//Do per scontato che siano tutte maiuscole
			for(int i = 0; i<parola.length(); i++){
				//Appena ne becco una NON maiuscola
				if(!Character.isUpperCase(parola.charAt(i))){
					//Allora non sono tutte maiuscole
					tutteMaiuscole = false;
					//Interrompo
					break;
				}

			}

			//Carattere speciale
			for(int i = 0; i<parola.length(); i++){
				
				//Se becco almeno uno di questi caratteri
				if(parola.charAt(i) == '>' || parola.charAt(i) == '<' || parola.charAt(i) == '=' || parola.charAt(i) == '!' ){
					//Allora ci sarà il carattere speciale
					carattereSpeciale = true;
					break;

				}


			}
			
			//Se sono tutte maiuscole
			if(tutteMaiuscole){
				//La lettera è U
				carattere = 'U';

			} else if(tutteMinuscole) {
				//Altrimenti è L
				carattere = 'L';

			} else if(carattereSpeciale){
				//Se è speciale, S
				carattere = 'S';

			} else {
				//Di default, O
				carattere = 'O';

			}
			//Stampo la parola seguito dalla differenza tra la somma dei suoi caratteri e la somma precendente seguita poi dal carattere
			System.out.println(parola+":"+(sommaCaratteri-sommaPrecedente)+","+carattere);
			//Resetto la somma precedente con la somma corrente
			sommaPrecedente = sommaCaratteri;
			
		}while(file.hasNext());

	}

}