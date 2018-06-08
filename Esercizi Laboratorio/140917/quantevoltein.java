import java.util.*;
import java.io.*;


public class quantevoltein{

	public static void main(String[] args) {
		//Stampa il valore ritornato dalla funzione ricorsiva
		System.out.println(quanteVolteIn(args[0], args[1]));

	}
	
	//Bella funzione ricorsiva con 2 stringhe passate
	public static int quanteVolteIn (String a, String b){
		//Se la lunghezza della prima supera la lunghezza della seconda ritorna 0
		if(a.length() > b.length()){

			return 0;
			
		} else {
			//se b inizia con a
			if(b.startsWith(a)){
				//ritorna 1 + la chiamata ricorsiva passando a & b meno il primo carattere
				return 1 + quanteVolteIn(a, b.substring(1));

			} else {
				//altrimenti 0 + la chiamata ricorsiva passando a & b meno il primo carattere
				return 0 + quanteVolteIn(a, b.substring(1));

			}

		}

	}

}