import java.util.*;

public class Risorsa {

	private String nome;
	private int prezzo;

	/**
	* Costruttore di Default per la Risorsa
	*/

	public Risorsa(){

		this.nome = null;
		this.prezzo = 0;

	}

	/**
	*	Costruttore con Nome e Prezzo della Risorsa
	*	@param nome Il nome della risorsa
	*	@param prezzo Il prezzo della risorsa
	*/

	public Risorsa(String nome, int prezzo){

		this.nome = nome;
		this.prezzo = prezzo;

	}

	/**
	*	@return Il nome della Risorsa
	*/

	public String getNome(){

		return nome;

	}

	/**
	*	@return Il Prezzo della Risorsa
	*/

	public int getPrezzo(){

		return prezzo;

	}

	/**
	*	@return Una stringa contenente le informazioni della Risorsa
	*
	*/

	@Override
	public String toString(){

		return "["+nome+", "+prezzo+"]";

	}

	/**
	*	@param o L' oggetto che si vuole confrontare
	*	@return true se this e o sono uguali, altrimenti false
	*/

	@Override
	public boolean equals(Object o){

		if(o == null){

			return false;

		}

		if(this == o){

			return true;

		}

		if(!(o instanceof Risorsa)){

			return false;

		}

		Risorsa r = (Risorsa) o;

		return this.nome.equals(r.nome);

	}

	/**
	*	@return L' hashCode dell' Oggetto
	*/

	@Override
	public int hashCode(){

		int hash = 7;
		
		hash = 31 * hash + prezzo;

		return hash;

	}

}