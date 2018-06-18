import java.util.*;

public class Dispensa{

	HashMap<Prodotto, Integer> scorta;
	HashMap<Prodotto, Integer> minimo;

	public Dispensa(){

		this.scorta = new HashMap<Prodotto, Integer>();
		this.minimo = new HashMap<Prodotto, Integer>();

	}

	public void scortaMinima(Prodotto p, int q){

		minimo.put(p, q);

	}

	/**
	*	@param p Prodotto da verificare
	*	@return la quantità altrimenti -1 se non è presente nella lista
	*	
	*/

	public int qta(Prodotto p){

		if(scorta.containsKey(p)){

			return scorta.get(p);

		} else {

			return -1;

		}

	}

	public void consuma(Prodotto p, int q){

		int attuale = scorta.get(p);

		if((scorta.containsKey(p)&&attuale<q)||(!scorta.containsKey(p))){

			throw new NoSuchElementException();

		} else {

			scorta.put(p, attuale-q);

		}

	}

	public ListaDellaSpesa preparaLista(){

		ListaDellaSpesa lista = new ListaDellaSpesa();

		for(Prodotto p : scorta.keySet()){

			if(minimo.containsKey(p)&&(scorta.get(p) < minimo.get(p))){

				lista.aggiungi(p, minimo.get(p)-scorta.get(p));

			}

		}

		return lista;

	}

	public void riponi(ListaDellaSpesa s){

		for(Prodotto p : s.keySet()){

			scorta.put(p, s.get(p)+scorta.get(p));

		}

	}

}