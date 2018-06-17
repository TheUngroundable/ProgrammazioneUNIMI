import java.util.*;
import java.io.*;

//per il commento guarda il filtro A

public class filtrob{
	//throws ... così non uso try catch per il file
	public static void main(String[] args) {
		int[] data = {1,1,3,2,4,5,1,4,6,7,3,5,5,8,9,10,0,0,2,1};
		int[] frequenza = frequenze(data);
		System.out.println("serie di dati:");
		for (int x : data)
		System.out.print(x+" ");
		System.out.println("\nfrequenze:");
		for (int i = 0; i < frequenza.length ; ++i)
		System.out.printf("%2d: %d\n", i, frequenza[i]);
		System.out.println("mediana: "+ mediana(data)+'\n'); // dovrebbe stampare 3.5
	}

	public static int[] frequenze (int data[]){

		

	}

	public static double mediana (int data[]){



	}

}