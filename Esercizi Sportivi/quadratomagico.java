import java.util.*;
import java.io.*;


public class quadratomagico{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		//n deve essere dispari
		if(n%2!=1){

			return;

		}

		int[][] matrix = new int[n][n];


		int count = 11;

		int anticount = 1;

		int c = ((n-1)/2);
		int r = 0;

		do{
			System.out.println(r+" ; "+c);

			//Non è necessario sistemare r & c perchè siamo nella matrice
			if((c != n) || (r >= 0)){
				//Se non è popolato
				if(matrix[r][c] == 0){
					//Popola
					matrix[r][c] = anticount++;
				//altrimenti 
				} else {
					//cadi di una riga
					r++;					
					//ma se la riga è fuori dalla matrice
					if(r == n){
						//sistemiamo le righe
						r = n-1;

					}

					//Scrivi incrementando
					matrix[r][c] = anticount++;


				}

				//Aumento colonne diminuisco righe
				c++;
				r--;

			//Se non siamo più nella matrice
			} else {
				//Vediamo se ci siamo dentro per le colonne
				if(c == n){
					//In questo caso resettiamo la colonna
					c = 0;

				}
				//se invece il problema sono le righe
				if(r <= 0){
					//sistemiamo le righe
					r = n-1;

				}

				//Siamo quindi a posto nella matrice e mi chiedo se è popolato
				//Se è ancora vergine
				if(matrix[r][c] == 0){
					//Svergina
					matrix[r][c] = anticount++;

				} else {
					//altrimenti devi scendere di un gradino
					r++;					
					//Scrivi nella nuova riga ma stessa colonna
					matrix[r][c] = anticount++;


				}

				//Aumento colonne dimunuisco righe
				c++;
				r--;

			}

			//capisco se rischio overflow

			//prima guardo le righe


			//poi se tutto rego nel caso guardo le colonne

			count--;

		}while(count > 0);

		for(int k = 0; k<n; k++){ 

			for(int j = 0; j<n; j++){

				System.out.print(matrix[k][j]+" ");

			}

			System.out.println();

		}

	}

}