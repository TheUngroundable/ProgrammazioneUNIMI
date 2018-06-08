import java.util.*;
import java.io.*;


public class filtroa{

	public static void main(String[] args) throws FileNotFoundException{

		Scanner file = new Scanner(new FileReader("./"+args[0]));

		int sommaPrecedente = 0;
		

		do{

			String parola = file.next();
			int sommaCaratteri = 0;
			int output = 0;

			for(int i = 0; i < parola.length(); i++){

				sommaCaratteri += parola.charAt(i);

			}


			char carattere;
			boolean tutteMaiuscole = true;
			boolean tutteMinuscole = true;
			boolean carattereSpeciale = false;
			

			//LowerCase
			for(int i = 0; i<parola.length(); i++){

				if(!Character.isLowerCase(parola.charAt(i))){

					tutteMinuscole = false;
					break;

				}

			}

			//Uppercase
			for(int i = 0; i<parola.length(); i++){

				if(!Character.isUpperCase(parola.charAt(i))){

					tutteMaiuscole = false;
					break;
				}

			}


			for(int i = 0; i<parola.length(); i++){
			

				if(parola.charAt(i) == '>' || parola.charAt(i) == '<' || parola.charAt(i) == '=' || parola.charAt(i) == '!' ){

					carattereSpeciale = true;
					break;

				}


			}
			

			if(tutteMaiuscole){

				carattere = 'U';

			} else if(tutteMinuscole) {

				carattere = 'L';

			} else if(carattereSpeciale){
				carattere = 'S';

			} else {

				carattere = 'O';

			}

			System.out.println(parola+":"+(sommaCaratteri-sommaPrecedente)+","+carattere);

			sommaPrecedente = sommaCaratteri;
			
		}while(file.hasNext());

	}

}