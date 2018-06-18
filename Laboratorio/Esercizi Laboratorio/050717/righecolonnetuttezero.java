import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class righecolonnetuttezero{

	public static void main(String[] args) {
	
		//Contiamo da quante righe è composta la matrice
		int countrighe = 0;
		
		//Controlla se il file esiste
		try { 
			//Crea uno scanner sul file passato
	        Scanner s = new Scanner(new FileReader("./matrix.txt"));  // Line 9
	    	//Fintanto che c'è una riga
	        while(s.hasNextLine()){	
	        	//Pescala e non salvartela nemmeno
	        	s.nextLine();
	        	//Aumenta il contatore delle righe
	        	countrighe++;

	        }
	        //Chiudi lo scanner per riaprirlo dopo dall' inizio
	        //N.B.: Non puoi resettare il counter di uno scanner, cancellalo e reinizializzalo
	        s.close();


	        System.out.println("Numero di Righe tutte zero: "+countrighe);

	    //Se file mancante, avverti l' utente
	    } catch (FileNotFoundException e) {
	    
	        System.out.println("File not found");
	    
	    }


	    //Reinstanzia lo scanner come prima
	    try { 

	        Scanner s = new Scanner(new FileReader("./matrix.txt"));  // Line 9

	        //Crea una matrice di n righe quante sono le righe del file (calcolato prima)
	        String[] matrix = new String[countrighe];
	        //Contatore per iterazione
	        int counter = 0;
	        //Trasponi il file nella matrice riga per riga aumentando il contatore
	        while(s.hasNextLine()){

	        	matrix[counter] = s.nextLine();
	        	System.out.println(matrix[counter]);
	        	counter++;

	        }

	        //CONTROLLA SE TUTTE RIGHE 0

	        //Contatore delle righe 0
	        int tutterighe0 = 0;

	        //Array multidimensionale riga-colonna
	        for(int r = 0; r < matrix.length; r++){
	        	//Dai per scontato che siano tutti 0
	        	boolean tuttezero = true;

	        	for(int c = 0; c < matrix[r].length(); c++){
	        		//Appena spazzoli carattere per carattere su una riga per volta
	        		//e becchi un carattere diverso da 0
	        		if(matrix[r].charAt(c) != '0'){
	        			//Chiudi tutto e segnala che la riga non è tutto 0
	        			tuttezero = false;
	        			break;
	        		}


	        	}
	        	//Se il flag non è stato alterato
	        	if(tuttezero){
	        		//La riga era effettivamente tutto 0, incrementa il counter
	        		tutterighe0++;

	        	}

	        }

	        System.out.println("tutterighe0: "+tutterighe0);


	        //Controlla se tutte le colonne sono 0

	        //Uguale a prima, solo che prima si prende una colonna per volta
	        //e di essa si controllano le singole righe

	        int tuttecolonne0 = 0;

	        

	        for(int c = 0; c < matrix[0].length(); c++){
	        	boolean tuttezero = true;

	        	for(int r = 0; r < matrix.length; r++){

	        		if(matrix[r].charAt(c) != '0'){

	        			tuttezero = false;
	        			break;
	        		}


	        	}

	        	if(tuttezero){

	        		tuttecolonne0++;

	        	}

	        }


	        System.out.println("tuttecolonne0: "+tuttecolonne0);

	    //Se il file manca, avverti l' utente
	    } catch (FileNotFoundException e) {
	    
	        System.out.println("File not found");
	    
	    }

	}

}
