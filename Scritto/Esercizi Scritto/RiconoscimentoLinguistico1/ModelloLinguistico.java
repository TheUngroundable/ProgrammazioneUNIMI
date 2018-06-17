import java.util.*;

public class ModelloLinguistico{

	private int[] frequenze;
	private int countTesti;

	public ModelloLinguistico(){

		frequenze = new int[26];
		countTesti = 0;

	}

	public ModelloLinguistico(String testo){

		frequenze = new int[26];
		countTesti = 0;
		addestra(testo);

	}

	public void addestra(String testo){

		//considera uno alla volta i caratteri del testo, ignorando quelli non alfabetici
		//converte miuscolo e aumenta contatore corrispondente al carattere
		countTesti++;
		for(int i = 0; i<testo.length(); i++){

			if(Character.isLetter(testo.charAt(i)))
				frequenze[(int) Character.toLowerCase(testo.charAt(i)) - 'a']++;

		}

	}

	public int quantiTesti(){

		//return numero di testi con cui è stato addestrato
		return countTesti;

	}

	public int quantiCaratteri(){

		int output = 0;

		for(int frequenza : frequenze){

			output+=frequenza;

		}

		//Numero di caratteri alfabetici visti fino ad ora

		return output;

	}

	public int frequenzaAssoluta(char c){

		//return frequenza assoluta del carattere c se lettera minuscola alfabetica
		//altrimenti -1

		return frequenze[(int) c-'a'];

	}

	public double frequenzaRelativa(char c){

		//se è stasto visto almeno un carattere, return frequenza relativa
		//frequenza relativa = frequenza assoluta / numero caratteri visti

		if(quantiCaratteri()>0){

			return frequenzaAssoluta(c) / quantiCaratteri();

		} else {

			return 1.0/26;

		}

	}

	public double differenza(ModelloLinguistico m){

		//differenza in norma L2: per ogni carattere calcolo differenza fra la
		//frequenza relativa di quel carattere nei due modelli coinvolti
		//si eleva al quadrato e tali quadrati si sommano
		//return sqrt somma dei quadrati

		for(int i = 0; i<26; i++){

			double differenza = this.frequenzaRelativa((char)(i+'a')) - m.frequenzaRelativa((char)(i+'a'));

		}

		return 0;

	}

	@Override
	public String toString(){

		return "";

	}

	public boolean equals(){

		return true;

	}

}