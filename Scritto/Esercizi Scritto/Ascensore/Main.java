public class Main{

	public static void main(String[] args){

		Persona[] persone = new Persona[100];

		int nPiani = 10;

		//randomizer per le persone
		char carattere = 'a';

		for(int i = 0; i < persone.length; i++){

			persone[i] = new Persona(randomWithRange(0,nPiani-1), randomWithRange(50,100), i+""+(carattere++));
			//System.out.println(persone[i].toString());

		}

		//i piani

		Piano[] piani = new Piano[nPiani];

		//GESU CRISTO INIZIALIZZALI GLI ARRAY PRIMAAAAA
		for(int i = 0; i < piani.length; i++){

			piani[i] = new Piano();

		}

		for(int i = 0; i < persone.length; i++){

			piani[i%nPiani].aggiungiInAttesa(persone[i]);
		
		}
		//Singoli Piani
		for(int i = 0; i < piani.length; i++){

			System.out.println(piani[i].toString());

		}

		System.out.println("-------------------");

		Ascensore ascensore = new Ascensore(100);

		//System.out.println(ascensore.toString());

		Colonna colonna = new Colonna(ascensore, nPiani, piani);

		//Animazione dell' ascensore
		int iterazioni = 10000000;
		for(int i = 0; i < iterazioni; i++){

			colonna.muoviAscensore(randomWithRange(0, nPiani-1));
			System.out.println("Piano corrente: "+colonna.intPiano());
			colonna.movimentaPersone();
			System.out.println(ascensore.toString());

		}

	}

	public static int randomWithRange(int min, int max){

	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	
	}

}