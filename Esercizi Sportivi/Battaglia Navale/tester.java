import java.util.*;
import java.io.*;


public class tester{

	public static void main(String[] args){

		Posizione posizione = new Posizione();

		System.out.println("riga: "+posizione.riga);
		System.out.println("colonna: "+posizione.colonna);

		Posizione posizioneParam;
		try{

			posizioneParam = new Posizione(9, 9);

		}catch(Exception e){

			return;

		}

		System.out.println("riga: "+posizioneParam.riga);
		System.out.println("colonna: "+posizioneParam.colonna);

		posizioneParam.parsePosizione("B9");


		System.out.println("riga: "+posizioneParam.riga);
		System.out.println("colonna: "+posizioneParam.colonna);
		Nave nave;

		try{

			nave = new Nave();
			testNave(nave);

			nave = new Nave(new Posizione(0,1), 6, false);
			testNave(nave);

			//C1:6:V

			nave.parseNave("C1:6:V");
			testNave(nave);

			int x = 9;
			int y = 9;

			System.out.println("riga da colpire: "+x+" ; colonna da colpire: "+y);

			if(nave.occupa(new Posizione(x,y))){

				System.out.println("Occupa!");

			} else {

				System.out.println("Non Occupa!");
			
			}

		} catch (Exception e){

			System.out.println("Errore! Nave non valida!");
			return;

		}

		
	}

	public static void testNave(Nave nave){

		System.out.println("posizione: "+nave.posizione);
		System.out.println("lunghezza: "+nave.lunghezza);
		System.out.println("orizzontale: "+nave.orizzontale);
		System.out.println("colpita: "+nave.colpita);

	}


}