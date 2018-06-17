import java.util.*;
import java.io.*;


public class lunghezzeparole{

	public static void main(String[] args) {
		//Classico Scanner	
		Scanner in = new Scanner(System.in);
		//Contatore
		int count = 0;
		//Massimo valore
		int max = 0;
		//Valore medio da dividere per il contatore
		int med = 0;
		//Minimo valore, cioè massimo valore ottenibile con integer così sicuro il primo valore calibra il minimo valore got it?
		int min = Integer.MAX_VALUE;

		do{
			//Incremento contatore parole
			count++;
			//Pesco la parola
			String parola = in.next();
			//Se è più lunga del massimo
			if(parola.length() > max){
				//aggiorna
				max = parola.length();

			}
			//Se è minore del minimo
			if(parola.length() < min){
				//aggiorna
				min = parola.length();

			}
			//Somma ogni volta le lettere al pozzo per la media
			med += parola.length();

		}while(in.hasNext());
		//Output (la media viene divisa per il numero di parole)
		System.out.println("max: "+max);
		System.out.println("med: "+(med/count));
		System.out.println("min: "+min);

	}

}