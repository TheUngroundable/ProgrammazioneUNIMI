import java.util.*;
import java.io.*;

//Chiudi il buffer con CTRL-Z

public class revrev{

	public static void main(String[] args) {
		//Linked List di Stringhe per semplificare la vita
		LinkedList<String> lista = new LinkedList<String>();
		//Classico scanner
		Scanner in = new Scanner(System.in);
		//Fintanto che hai nel buffer
		do{
			//Pesca la riga
			String riga = in.nextLine();
			//E aggiungila alla lista
			lista.add(riga);

		}while(in.hasNextLine());
		//Partendo dall' ultima riga
		for(int r = lista.size()-1; r >= 0; r--){
			//partendo dall' ultimo carattere dell' ultima riga
			for(int i = lista.get(r).length()-1; i>= 0; i--){
				//Stampa il carattere
				System.out.print(lista.get(r).charAt(i));

			}
		//Finita la riga, stampa un "a capo"
		System.out.println();
		}

	}
	
}