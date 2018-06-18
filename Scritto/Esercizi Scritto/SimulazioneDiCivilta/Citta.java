import java.util.*;

public class Citta {

	private String nome;
	private Risorsa risorsa;


	/**
	*	Costruttore di Default per la Città
	*/

	public Citta(){

		nome = null;
		risorsa = null;

	}

	/**
	*	@param nome Nome della città
	*	@param risorsa Risorsa da assegnare alla città
	*/

	public Citta(String nome, Risorsa risorsa){

		this.nome = nome;
		this.risorsa = risorsa;

	}

	/**
	*	@return Il nome della Città
	*/

	public String getNome(){

		return nome;

	}

	/**
	*	@return La risorsa prodotta dalla Città
	*/

	public Risorsa produci(){

		return risorsa;

	}

	/**
	*	@return Una stringa contenente tutte le informazioni della Città
	*/

	@Override
	public String toString(){

		return "["+nome+", "+risorsa.getNome()+"]";

	}

	/**
	*	@param obj La città da confrontare
	*	@return true se this == obj, altrimenti false
	*/

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Citta)){

			return false;

		}

		Citta citta = (Citta) obj;

		return (nome == citta.getNome()) && (risorsa.equals(citta.produci()));

	}

}