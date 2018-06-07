import java.util.*;
import java.io.*;


public class costoabbonamento{

	public static void main(String[] args) {

		char sesso = ' ';
		int eta = 0;

		boolean error = false;

		if(Character.isLetter(Character.toLowerCase(args[0].charAt(0)))){

			sesso = Character.toLowerCase(args[0].charAt(0));
		
			if(sesso != 'm' && sesso != 'f'){

				System.out.println("Il sesso non corrisponde a maschio o a femmina!");
				error = true;

			}

		} else {

			System.out.println("Errore! Sesso non inserito correttamente");
			error = true;

		}

		if(Character.isDigit(Integer.parseInt(args[1]))){

			eta = Integer.parseInt(args[1]);

		} else {

			System.out.println("Errore! Età non inserita correttamente");
			error = true;

		}

		if(!error){

			String costo = "";

			switch(sesso){

				case 'm':

					if(eta <= 10){

						costo = "0";

					} else if(eta >= 11 && eta <= 25){

						costo = "10";

					} else if(eta >= 26 && eta <= 64){

						costo = "18.50";

					} else if (eta >= 65 && eta <= 75){

						costo = "10";

					} else if( eta >= 75){

						costo = "0";

					}

				break;


				case 'f':

					if(eta <= 14){

						costo = "0";

					} else if(eta >= 15 && eta <= 30){

						costo = "10";

					} else if(eta >= 31 && eta <= 64){

						costo = "18.50";

					} else if (eta >= 65 && eta <= 75){

						costo = "10";

					} else if( eta >= 75){

						costo = "0";

					}


				break;

			}


			if(costo.equals("0")){

				System.out.println("Per te l' abbonamento è gratis!");

			} else {

				System.out.println("L' abbonamento costa "+costo+" euro");

			}

		} else {

			System.out.println("Lanciare di nuovo il programma");

		}

	}

}