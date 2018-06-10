import java.util.*;
import java.io.*;

//per il commento guarda il filtro A

public class statistiche{

	public static void main(String[] args) {

		int[] data = {1,1,3,2,4,5,1,4,6,7,3,5,5,8,9,10,0,0,2,1};
		int[] frequenza = frequenze(data);
		System.out.println("serie di dati:");
		for (int x : data)
			System.out.print(x+" ");
		System.out.println("\nfrequenze:");
		for (int i = 0; i < frequenza.length ; ++i)
			System.out.printf("%2d: %d\n", i, frequenza[i]);
		//System.out.println("mediana: "+ mediana(data)+'\n'); // dovrebbe stampare 3.5
	
	}

	//Calcola con quale frequenza escono i numeri passati
	public static int[] frequenze(int data[]){
		//Creo un array trasposto calcolando il valore massimo nell' array e usandolo come lunghezza +1 dell' array trasposto
		int[] frequenze = new int[max(data)+1];	

		for(int d : data){
			//Per ogni dato, incrementa la cella corrispondente a quel numero
			frequenze[d]++;

		}

		//Ritorna le frequenze
		return frequenze;

	}

	//Metodo per calcolare il valore massimo in un array
	private static int max(int data[]){
		//Minimo assoluto assumibile da un integer
		int min = Integer.MIN_VALUE;
		//Per ogni dato in data
		for(int d : data){
			//Se è maggiore del minimo
			if(d > min){
				//aggiorna il minimo
				min = d;

			}

		}
		//restituisci il valore massimo
		return min;

	}


	private static 	double mediana(int data[]){
		//Riordina l' array
		Arrays.sort(data);
		//Se è di lunghezza pari
		if(data.length % 2 == 0){
			//Ritorna la somma fra la cella a metà e la cella dopo diviso per 2
			return (

				data[data.length/2] + data[(data.length/2)-1]

				)/2;

		} else {
			//Altrimenti ritorna la cella a metà dell' array dato che è di lunghezza dispari
			return data[(data.length)/2];

		}

	}
	
}

