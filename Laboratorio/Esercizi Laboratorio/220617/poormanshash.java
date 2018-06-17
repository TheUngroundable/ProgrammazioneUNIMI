import java.util.*;
import java.io.*;


public class poormanshash{

	public static void main(String[] args) {
		
		//Classicissimo Scanner
		Scanner in = new Scanner(System.in);
		//Array di output
		char[] manshash = new char[15];
		//pesco la riga da tastiera
		String input = in.nextLine();
		//Converto Stringa a array di caratteri
		char[] tobehashed = input.toCharArray();

		//Inizializzo a int 32 l' array di caratteri output
		for(int i = 0; i<manshash.length; i++){

			manshash[i] = 32;

		}

		//per ogni cella dell' array di input
		for(int i = 0; i < tobehashed.length; i++){
			//divido la cella per 3
			tobehashed[i] /= 3;
			//calcolo un secondo indice 'index' basato sul modulo 15 di i, il primo indice 
			int index = i % 15;
			//Sommo alla cella modulo i mod 15 dell' array di output		
			manshash[index] += tobehashed[i];
			//Assegno alla cella della riga precedente il suo modulo 95 sommato poi a 33 
			manshash[index] = (char) ((manshash[index] % 95) + 33);

		}

		//Foreach per stampare tutti i caratteri di seguito
		for(char character : manshash){

			System.out.print(character);

		}
	}

}