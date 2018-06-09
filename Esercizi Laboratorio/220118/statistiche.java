import java.util.*;
import java.io.*;

//per il commento guarda il filtro A

public class filtrob{
	//throws ... così non uso try catch per il file
	public static void main(String[] args) throws FileNotFoundException{

		Scanner file = new Scanner(new FileReader("./"+args[0]));

		int mediaPrecedente = 0;

		do{

			String parola = file.next();

			int somma = 0;
			char carattere = ' ';

			for(int i = 0; i<parola.length(); i++){

				somma += parola.charAt(i);

			}


			//Check if letters

			boolean isLetters = true;

			for(int i = 0; i < parola.length(); i++){

				if(!Character.isLetter(parola.charAt(i))){

					isLetters = false;
					break;

				}

			}



			boolean isDigits = true;

			for(int i = 0; i < parola.length(); i++){

				if(!Character.isDigit(parola.charAt(i))){

					isDigits = false;
					break;

				}

			}


			boolean isSpecial = false;

			for(int i = 0; i < parola.length(); i++){

				if(parola.charAt(i) == '(' || parola.charAt(i) == ')' || parola.charAt(i) == '*' || parola.charAt(i) == '/' ){

					isSpecial = true;
					break;

				}

			}

			if(isLetters){

				carattere = 'L';

			} else if (isDigits) {

				carattere = 'D';

			} else if(isSpecial){

				carattere = 'S';

			} else {

				carattere = 'O';

			}


			System.out.println(parola+":"+((somma/parola.length())-mediaPrecedente)+","+carattere);

			mediaPrecedente = (somma/parola.length());

		}while(file.hasNext());
	}

}