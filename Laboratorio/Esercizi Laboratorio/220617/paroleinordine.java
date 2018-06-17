import java.util.*;
import java.io.*;

public class paroleinordine{

	public static void main(String[] args) {
		
		//Dichiaro variabile percorso
		String endPath;

		//Se nessun argomento è stato passato da comando
		if(args.length<1){

			//Creo uno scanner per poter chiedere all' utente di passare il percorso da tastiera chiudendo poi con .close()
			Scanner scan = new Scanner(System.in);
			System.out.println("Nessun argomento passato. Inserire da tastiera nome punto estensione del file da ordinare");
			endPath = scan.next();
			scan.close();

		} else {

			//Altrimenti il percorso è nella prima cella di args
			endPath = args[0];

		}

		//Try...Catch
		try{

			//Classico Scanner File
			Scanner in = new Scanner(new FileReader("./"+endPath));
			//Mi faccia entrare, sono in lista
			LinkedList<String> list = new LinkedList<String>();

			do{
				//Pesca una parola dalla riga e metti il resto in coda...
				String parola = in.next();
				//Aggiungi la parola alla lista
				list.add(parola);
				//...fino a quando non sono esaurite tutte le parole!
			}while(in.hasNext());

			//Riordina alfabeticamente la lista con la classe Collections
			Collections.sort(list);

			//Per ogni parola nella lista
			for(String parola : list){
				//Stampala
				System.out.println(parola);

			}
		//Gestione del try...catch
		}catch(FileNotFoundException e){

			System.out.println("Errore! File non trovato");

		}

	}

}