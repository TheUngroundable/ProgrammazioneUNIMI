import java.util.*;

public class ModelloLinguistico{

	public ModelloLinguistico(){



	}

	public ModelloLinguistico(String testo){



	}

	public void addestra(String testo){

		//considera uno alla volta i caratteri del testo, ignorando quelli non alfabetici
		//converte miuscolo e aumenta contatore corrispondente al carattere

	}

	public int quantiTesti(){

		//return numero di testi con cui è stato addestrato

	}

	public int quantiCaratteri(){

		//Numero di caratteri alfabetici visti fino ad ora

	}

	public int frequenzaAssoluta(char c){

		//return frequenza assoluta del carattere c se lettera minuscola alfabetica
		//altrimenti -1

	}

	public double frequenzaRelativa(char c){

		//se è stasto visto almeno un carattere, return frequenza relativa
		//frequenza relativa = frequenza assoluta / numero caratteri visti

	}

	public double differenza(ModelloLinguistico m){

		//differenza in norma L2: per ogni carattere calcolo differenza fra la
		//frequenza relativa di quel carattere nei due modelli coinvolti
		//si eleva al quadrato e tali quadrati si sommano
		//return sqrt somma dei quadrati

	}

}