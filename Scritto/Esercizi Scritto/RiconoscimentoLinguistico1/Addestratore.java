import java.util.*;

public class Addestratore{

	private HashMap<String, ModelloLinguistico> mappa; 

	public Addestratore(){

		mappa = new HashMap<String, ModelloLinguistico>();

	}

	public void addestra(String nomeLingua, String testo){

		if(!mappa.containsKey(nomeLingua)){

			//crea un nuovo modello linguistico addestrato con il testo

			//aggiungi alla mappa con lingua come chiave e modello come valore

			ModelloLinguistico m = new ModelloLinguistico(testo);

			mappa.put(nomeLingua, m);

		} else {

			//pesca allora il modello linguistico corrispondente e addestralo!
			ModelloLinguistico m = mappa.get(nomeLingua);

			m.addestra(testo);

			mappa.replace(nomeLingua, m);

		}

	}

	public void stampa(int larg){

		//stampa tutti gli istogrammi di larghezza larg di tutte le lingue conosciute ognuno preceduto dal nome della lingua

	}
}