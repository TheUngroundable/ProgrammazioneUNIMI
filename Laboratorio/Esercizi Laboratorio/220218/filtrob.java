
import java.util.*;
import java.io.*;

public class filtrob{

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner in = new Scanner(System.in);
		
		String path = in.next();


		Scanner file = new Scanner(new FileReader("./"+path));

		float counterParole = 0, precedente = 0;
		
		do{


			String riga = file.nextLine();
			
			System.out.println("Riga: "+riga);

			float counterDispari = 0;

			try{

				Scanner parole = new Scanner(riga);

				do{

					String parola = parole.next();
					counterParole++;

					if(parola.length() % 2 != 0){

						counterDispari++;

					}

				}while(parole.hasNext());

			} catch (NoSuchElementException e){



			}

			System.out.println("Dispari: "+counterDispari);

			float rapporto = counterDispari/counterParole;

			System.out.println("Rapporto: "+rapporto);

			precedente = counterDispari;

		}while(file.hasNextLine());


	}

}