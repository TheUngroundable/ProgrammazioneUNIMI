import java.util.*;

public class Civilta {

	private String nome;
	private LinkedList<Citta> listaCitta;
	private int tesoro;
	private LinkedList<Risorsa> stock;


	/**
	*	Costruttore di default per una nuova Civiltà
	*/

	public Civilta(){

		nome = null;
		listaCitta = null;
		tesoro = 0;
		stock = null;

	}

	/**
	*	Costruttore con parametro per una nuova Civiltà
	*	@param nome Nome della nuova Civiltà
	*/

	public Civilta(String nome){

		this.nome = nome;
		listaCitta = new LinkedList<Citta>();
		tesoro = 0;
		stock = new LinkedList<Risorsa>();

	}


	/**
	*	@return Il nome della Civiltà
	*/

	public String getNome(){

		return nome;

	}


	/**
	*	@return Il tesoro della Civiltà
	*/

	public int getTesoro(){

		return tesoro;

	}

	/**
	*	@param citta Città da aggiungere a questa Civiltà
	*/

	public void aggiungiCitta(Citta citta){

		listaCitta.add(citta);

	}

	/**
	*	@param citta Città da rimuovere da questa Civiltà
	*/

	public void rimuoviCitta(Citta citta){

		listaCitta.remove(citta);

	}


	/**
	*	@return Lista delle Città relative a questa Civiltà
	*/

	public LinkedList<Citta> getCitta(){

		return listaCitta;

	}

	/**
	*	@param nome Nome della città da fondare
	*	@param risorsa Risorsa che si vuole assegnare alla Città da fondare
	*	@return La città appena fondata
	*/

	public Citta fondaCitta(String nome, Risorsa risorsa){

		//aggiunge alla lista delle città e restituisce una cittù con nome nome che produce la risorsa risorsa
		Citta citta = new Citta(nome, risorsa);
		listaCitta.add(citta);

		return citta;

	}


	/**
	*	@param r Risorsa da aggiungere allo stock
	*/
	public void aggiungiRisorsa(Risorsa r){

		stock.add(r);

	}


	/**
	*	@param d Quantità di denaro da sommare al tesoro
	*/
	public void aggiungiDenaro(int d){

		this.tesoro += d;

	}


	/**
	*	Richiama il metodo produci su ogni Città relativa a questa Civiltà
	*/
	public void faiProdurre(){

		for(Citta citta : listaCitta){

			stock.add(citta.produci());

		}

	}


	/**
	*	@param r Risorsa da controllare
	*	@return True se la Civiltà possiede la Risorsa, altrimenti false
	*/

	public boolean possiede(Risorsa r){

		return stock.contains(r);

	}


	/**
	*	@param altra Civilta a cui vendere le risorse
	*	@return true se è stato compiuto almeno un commercio, altrimenti false
	*/

	public boolean vendiRisorseA(Civilta altra){

		//Scorre tutte le risorse dello Stock

		boolean venduto = false;

		for(int i = 0; i<stock.size(); i++){

		//per ogni risorsa r controlla se la civiltà altra possiede r
			if(!altra.possiede(stock.get(i))){
				//se non la possiede, this vende ad altra la risorsa
				//(aggiunge allo stock di altra e sposta denaro pari al prezzo di r)
				altra.aggiungiRisorsa(stock.get(i));
				this.aggiungiDenaro(stock.get(i).getPrezzo());
				venduto = true;

			}

		}

		return venduto;

	}



	/**
	*	@return Una lista contenente le informaizoni relative alla Civiltà
	*/

	@Override
	public String toString(){

		String output = "";

		//Stampa il nome della civilta, il tesoro poi le civiltà e lo stock


		output += "Civilta: "+"["+nome+", "+tesoro+"] - ";

		output += "\nLista Città: ";

		for(Citta citta : listaCitta){

			output += citta.toString()+" ";

		}

		output += "\nRisorse: ";

		for(Risorsa risorsa : stock){

			output += risorsa.toString()+" ";

		}

		return output;

	}


	/**
	*	@return true se this è uguale a obj, altrimenti false
	*/

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Civilta)){

			return false;

		}

		Civilta civilta = (Civilta) obj;

		boolean equals = false;

		if(this.nome.equals(civilta.getNome())){

			equals = true;

		}

		if(this.tesoro == civilta.getTesoro()){

			equals = true;

		}

		//se ogni risorsa in stock l' altro la possiede

		for(Risorsa risorsa : stock){

			if(civilta.possiede(risorsa)){

				equals = true;

			} else {

				equals = false;

			}

		}

		equals = this.listaCitta.equals(civilta.getCitta());

		return equals;

	}

	/*

	Adesso chiedi veramente troppo, non ho tutto il pomeriggio da buttare via

	@Override
	public int hashCode(){


	}
	*/

}