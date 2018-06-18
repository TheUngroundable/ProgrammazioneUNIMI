import java.util.*;

public class Supermercato{

	private LinkedList<Reparto> reparti;
	private LinkedList<Prodotto> prodotti;
	private LinkedList<Offerta> offerte;

	public Supermercato(){

		reparti = new LinkedList<Reparto>();
		prodotti = new LinkedList<Prodotto>();
		offerte = new LinkedList<Offerta>();

	}

	public void aggiungiReparto(Reparto r){

		reparti.add(r);

	}

	public void aggiungiProdotto(Prodotto p){

		prodotti.add(p);

	}

	public boolean cancellaProdotto(Prodotto p){

		if(prodotti.contains(p)){

			prodotti.remove(p);
			return true;

		} else {

			return false;

		}

	}

	public void aggiungiOfferta(Offerta o){

		offerte.add(o);

	}

	public boolean cancellaOfferta(Offerta o){

		if(offerte.contains(o)){

			offerte.remove(o);
			return true;

		} else {

			return false;

		}

	}

	//TODO
	public double prezzo(Prodotto[] p, boolean carta){

		return 0;

	}

	@Override
	public String toString(){

/*

	private LinkedList<Reparto> reparti;
	private LinkedList<Prodotto> prodotti;
	private LinkedList<Offerta> offerte;

*/

		return reparti.toString() +" : "+ prodotti.toString() + " : " + offerte.toString();

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Supermercato)){

			return false;

		}

		Supermercato altro = (Supermercato) obj;

		return (this.reparti.equals(altro.reparti))&&(this.offerte.equals(altro.offerte))&&(this.prodotti.equals(altro.prodotti));

	}

}