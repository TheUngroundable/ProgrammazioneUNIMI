import java.util.*;
import java.io.*;


public class conteggionumeri{

	public static void main(String[] args) {
		//Classico Scanner	
		Scanner in = new Scanner(System.in);
		//Contatori vari e svariati
		int count = 0;
		int countConCifre = 0;
		int countNumeroCifre = 0;

		do{
			//Conta la parola e pescala
			count++;
			String parola = in.next();
			//Hai ancora pescato un numero?
			boolean first = false;
			//Per ogni lettera nella parola
			for(int i = 0; i<parola.length();i++){
				//Se è un numero
				if(Character.isDigit(parola.charAt(i))){
					//E se è il primo
					if(!first){
						//Incrementa il numero di parole con cifre
						countConCifre++;
						//E ricordati che questa parola è già stata conteggiata per la riga prima
						first = true;
					}
					//Incrementa il numero di cifre totali scoperte
					countNumeroCifre++;

				}

			}

		//Fintanto che hai merda nel buffer
		}while(in.hasNext());
		//Output vari e svariati (al totale se togli quelle con cifre ti da quelle senza cifre duh)
		System.out.println("Parole con cifre: "+countConCifre);
		System.out.println("Parole senza cifre: "+(count-countConCifre));
		System.out.println("Numero totale di cifre: "+countNumeroCifre);


	}

}