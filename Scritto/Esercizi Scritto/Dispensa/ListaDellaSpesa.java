import java.util.*;

public class ListaDellaSpesa{

	HashMap<Prodotto, Integer> lista;

	public ListaDellaSpesa(){

		lista = new HashMap<Prodotto, Integer>();

	}

	public void aggiungi(Prodotto p, int q){

		lista.put(p, q);

	}

	public int qta(Prodotto p){

		if(lista.containsKey(p)){

			return lista.get(p);

		} else {

			return -1;

		}

	}

	public LinkedList<Prodotto> prodotti(){

		LinkedList<Prodotto> temp = new LinkedList<Prodotto>();

		for(Prodotto prodotto: lista.keySet()){

			temp.add(prodotto);
		}

		return temp;

	}

	@Override
	public String toString(){

		String output = "";

		for(Prodotto prodotto: lista.keySet()){

			output += "["+prodotto.toString()+", "+lista.get(prodotto)+"]\n";

		}

		return output;

	}

}