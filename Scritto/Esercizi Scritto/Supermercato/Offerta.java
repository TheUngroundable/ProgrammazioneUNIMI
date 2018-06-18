import java.util.*;

public class Offerta{

	private String nomeOfferta;
	private Prodotto prodotto;
	private double percSconto;
	private int numeroMinimo;
	private boolean soloCartaFedelta;

	public Offerta(String nomeOfferta, Prodotto prodotto, double percSconto, int numeroMinimo, boolean soloCartaFedelta){

		this.nomeOfferta = nomeOfferta;
		this.prodotto = prodotto;
		this.percSconto = percSconto;
		this.numeroMinimo = numeroMinimo;
		this.soloCartaFedelta = soloCartaFedelta;

	}

	public double prezzo(int qta, boolean carta){

		//restituisce il prezzo complessivo del prodotto cui si riferisce
		//questa offerta posto che se ne comprino qta e se ha la carta, se carta è true

		double totale = qta * prodotto.prezzo();

		if(this.soloCartaFedelta && carta){

			//se il quantitativo richiesto >= minimo
			if(qta >= numeroMinimo){
				//applica lo sconto
				totale -= (totale * percSconto / 100);

			}
			
		} else if(!this.soloCartaFedelta){

			if(qta >= numeroMinimo){
				//applica lo sconto
				totale -= (totale * percSconto / 100);

			}

		}

		return totale;

	}

	//TODO
	public static double totale(Offerta[] off, Prodotto[] p, int[] qta, boolean carta){

		return 0;

	}

	@Override
	public String toString(){

		return "["+nomeOfferta+", "+prodotto.toString()+", "+percSconto+", "+numeroMinimo+", "+soloCartaFedelta+"]";

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Offerta)){

			return false;

		}

		Offerta altra = (Offerta) obj;


		return (nomeOfferta.equals(altra.nomeOfferta))&&(prodotto.equals(altra.prodotto))
				&& (percSconto == altra.percSconto) && (numeroMinimo == altra.numeroMinimo)
				&& (soloCartaFedelta == altra.soloCartaFedelta);

	}

	@Override
	public int hashCode(){
		
		int hash = 7;
		return hash * 31 + (nomeOfferta.hashCode() + prodotto.hashCode() + (int)percSconto + numeroMinimo + Boolean.hashCode(soloCartaFedelta));

	}

}