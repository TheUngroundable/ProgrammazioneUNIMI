import java.util.*;

public class Civilta {

	private String nome;
	private LinkedList<Citta> listaCitta;
	private int tesoro;
	private LinkedList<Risorsa> stock;


	/**
	
		Costruttore di default per una nuova Civiltà

	*/

	public Civilta(){

		nome = null;
		listaCitta = null;
		tesoro = 0;
		stock = null;

	}

	public Civilta(String nome){

		this.nome = nome;
		listaCitta = new LinkedList<Citta>();
		tesoro = 0;
		stock = new LinkedList<Risorsa>();

	}

	public String getNome(){

		return nome;

	}

	public int getTesoro(){

		return tesoro;

	}

	public void aggiungiCitta(Citta citta){

		listaCitta.add(citta);

	}

	public void rimuoviCitta(Citta citta){

		listaCitta.remove(citta);

	}

	public LinkedList<Citta> getCitta(){

		return listaCitta;

	}

	public Citta fondaCitta(String nome, Risorsa risorsa){

		//aggiunge alla lista delle città e restituisce una cittù con nome nome che produce la risorsa risorsa
		Citta citta = new Citta(nome, risorsa);
		listaCitta.add(citta);

		return citta;

	}


	public void aggiungiRisorsa(Risorsa r){

		stock.add(r);

	}

	public void aggiungiDenaro(int d){

		this.tesoro += d;

	}

	public void faiProdurre(){

		for(Citta citta : listaCitta){

			stock.add(citta.produci());

		}

	}

	public boolean possiede(Risorsa r){

		return stock.contains(r);

	}

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