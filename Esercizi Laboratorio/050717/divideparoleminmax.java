
import java.util.*;
import java.io.*;

public class divideparoleminmax{

	public static void main(String[] args) {
		
		//Create scanner with FileReader from first parameter passed
		try{

			String path = args[0];
			Scanner in = new Scanner(new FileReader("./"+path));

			LinkedList<String> maiuscole = new LinkedList<String>();
			LinkedList<String> minuscole = new LinkedList<String>();

			while(in.hasNextLine()){

				String parola = in.next();

				if(Character.isUpperCase(parola.charAt(0))){

					boolean isLetters = true;
					for(int i = 0; i<parola.length(); i++){

						if(!Character.isLetter(parola.charAt(i))){

							isLetters = false;
							break;

						}
					}

					if(isLetters){

						maiuscole.add(parola);

					}

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

			//Minuscole
			System.out.println("Minuscole: ");
			for(int i = 0; i<minuscole.size(); i++){

				System.out.println(minuscole.get(i));

			}


			System.out.println("Maiuscole: ");
			for(int i = 0; i<maiuscole.size(); i++){

				System.out.println(maiuscole.get(i));

			}

		}catch(FileNotFoundException e){

			System.out.println("File non valido o mancante");

		}
	}
}
