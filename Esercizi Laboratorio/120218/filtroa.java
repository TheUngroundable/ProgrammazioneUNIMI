import java.util.*;
import java.io.*;

public class filtroa {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner in = new Scanner(System.in);

		String path = in.next();

		Scanner file = new Scanner(new FileReader("./"+path));

		float previous = 0;
		boolean first = true;

		LinkedList<Character> andamento = new LinkedList<Character>();

		do{

			String riga = file.nextLine();

			System.out.println("Riga: "+riga);


			float countPari = 0;
			float countParole = 0;

			try{

				Scanner rigaScan = new Scanner(riga);

				do{

					String parola = rigaScan.next();
					countParole++;

					if(parola.length() % 2 == 0){

						countPari++;

					}

				}while(rigaScan.hasNext());

			} catch(NoSuchElementException e){



			}

			System.out.println("Pari: "+countPari);

			if(countPari == 0){

				System.out.println("Rapporto: NaN");

			} else {

				float rapporto = countPari/countParole;
				System.out.println("Rapporto: "+rapporto);

			}

			if(countPari > previous){

				andamento.add('/');

			} else if (countPari == previous){

				andamento.add('-');

			} else if(countPari < previous){

				andamento.add('\\');

			}

			previous = countPari;

		}while(file.hasNextLine());

		for(int i = 1; i < andamento.size(); i++){

			System.out.print(andamento.get(i));

		}
	}

}