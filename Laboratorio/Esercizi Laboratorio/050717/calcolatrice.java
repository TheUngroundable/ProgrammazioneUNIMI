import java.util.*;
import java.io.*;

public class calcolatrice{

	public static void main(String[] args) {
	
		//Normale Scanner per input
		Scanner in = new Scanner(System.in);
		//Variabile per il comando che verrà inserito
		String comando;
		//Variabile per l' accumulatore
		float accumulatore = 0;
		//Fintanto che il comando !equals.("E") <== MI RACCOMANDO, EQUALS QUANDO LAVORI CON STRING
		do{
			//Prenditi la linea di comando
			String input = in.nextLine();
			//Spezza all' altezza dello spazio la linea
			String arrayInput[] = input.split(" ");
			//Salvati il primo pezzo nello spazio del comando
			comando = arrayInput[0];
			//Se ci sono altre celle nell' array, vuole dire che c'è anche un parametro
			if(arrayInput.length>1){
				//Il parametro convertilo da String a float
				float parametro = Float.valueOf(arrayInput[1]);
				//E controlla il comando inserito
				switch(comando){
					//Se è S, sovrascrivi l' accumulatore con il parametro passato
					case "S":

						accumulatore = parametro;

					break;

					case "E":

						comando = "E";

					break;

					case "-":

						accumulatore -= parametro;

					break;

					case "/":
						//Se il parametro è 0, stai tentando di dividere per 0
						if(parametro == 0){
							//avverti l' utente
							System.out.println("Attenzione! Divisione per zero");
							break;
						
						} else {
							//Altrimenti tranqui
							accumulatore /= parametro;
							break;
						}

					case "+":

						accumulatore += parametro;

					break;

					default:
						//Di default stampa a video "Comando Sconosciuto"
						System.out.println("Comando sconosciuto");

					break;

				}

			}

			//Se il comando non è E			
			if(!comando.equals("E")){

				//Stampa il risultato delle operazioni salvate nell' accumulatore
				System.out.println(accumulatore);

			}

		//Altrimenti se l' utente vuole chiudere la macchina inserisce "E"
		}while(!comando.equals("E"));

		System.out.println("Fine del programma");

	}

}