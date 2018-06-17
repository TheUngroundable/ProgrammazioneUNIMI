import java.util.*;
import java.io.*;

public class Tester{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner file;

		try{

			file = new Scanner(new FileReader("testoA.txt"));

		}catch(FileNotFoundException e){

			return;

		}


		String testo = "";

		do{

			testo+=file.nextLine();
			testo+=" ";

		}while(file.hasNextLine());

		ModelloLinguistico modello1 = new ModelloLinguistico();

		System.out.println("Modello1: ");
		System.out.println("Frequenza Relativa di a: "+modello1.frequenzaRelativa('a'));

		System.out.println("Addestro Modello1!");

		modello1.addestra(testo);

		System.out.println("Modello2:");
		System.out.println("Numero Testi: "+modello1.quantiTesti());
		System.out.println("Numero Caratteri: "+modello1.quantiCaratteri());

		System.out.println("Frequenza Assoluta di a: "+modello1.frequenzaAssoluta('a'));

		System.out.println("Frequenza Assoluta di b: "+modello1.frequenzaAssoluta('b'));

		System.out.println("Frequenza Assoluta di c: "+modello1.frequenzaAssoluta('c'));
		System.out.println("Frequenza Assoluta di d: "+modello1.frequenzaAssoluta('d'));
		System.out.println("Frequenza Assoluta di e: "+modello1.frequenzaAssoluta('e'));

		System.out.println("Frequenza Relativa di a: "+modello1.frequenzaRelativa('a'));
		System.out.println("Frequenza Relativa di b: "+modello1.frequenzaRelativa('b'));
		System.out.println("Frequenza Relativa di c: "+modello1.frequenzaRelativa('c'));

		System.out.println("------------------------------------------");

		try{

			file = new Scanner(new FileReader("testoB.txt"));

		}catch(FileNotFoundException e){

			return;

		}

		testo = "";

		do{

			testo+=file.nextLine();
			testo+=" ";

		}while(file.hasNextLine());

		ModelloLinguistico modello2 = new ModelloLinguistico(testo);

		System.out.println("Modello2:");
		System.out.println("Numero Testi: "+modello2.quantiTesti());
		System.out.println("Numero Caratteri: "+modello2.quantiCaratteri());

		System.out.println("Frequenza Assoluta di a: "+modello2.frequenzaAssoluta('a'));

		System.out.println("Frequenza Assoluta di b: "+modello2.frequenzaAssoluta('b'));

		System.out.println("Frequenza Assoluta di c: "+modello2.frequenzaAssoluta('c'));
		System.out.println("Frequenza Assoluta di d: "+modello2.frequenzaAssoluta('d'));
		System.out.println("Frequenza Assoluta di e: "+modello2.frequenzaAssoluta('e'));

		System.out.println("Frequenza Relativa di a: "+modello2.frequenzaRelativa('a'));
		System.out.println("Frequenza Relativa di b: "+modello2.frequenzaRelativa('b'));
		System.out.println("Frequenza Relativa di c: "+modello2.frequenzaRelativa('c'));


		System.out.println("------------------------------------------");


		System.out.println("Differenza fra Modello1 e se stesso: "+modello1.differenza(modello1));
		System.out.println("Differenza fra Modello1 e Modello2: "+modello1.differenza(modello2));


		System.out.println("------------------------------------------");

		System.out.println("Modello1.toString:");
		System.out.println(modello1.toString());


		System.out.println("------------------------------------------");


		System.out.println("Modello1 equals Modello2: "+modello1.equals(modello1));
		System.out.println("Modello1 equals Modello2: "+modello1.equals(modello2));


		System.out.println("------------------------------------------");

		ModelloLinguistico modello3 = new ModelloLinguistico(testo);

		System.out.println("Modello1 hashcode: "+modello1.hashCode());
		System.out.println("Modello2 hashcode: "+modello2.hashCode());
		System.out.println("Modello3 hashcode: "+modello3.hashCode());


		System.out.println("------------------------------------------");

		Istogramma istogramma = new Istogramma(25);


		System.out.println(istogramma.toString(modello2));


	}
	
}