import java.util.*;

public class Prodotto{

	private String nome;
	private Reparto reparto;
	private String id;
	private double quantita;
	private double prezzo;
	private UnitaDiMisura mis;

	public Prodotto(String nome, Reparto reparto, String id, double quantita, double prezzo, UnitaDiMisura mis){

		this.nome = nome;
		this.reparto = reparto;
		this.id = id;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.mis = mis;

	}

	public double prezzo(){

		return prezzo;

	}

	public double prezzoUnitario(){

		return mis.qta() * prezzo / quantita;

	}

	@Override
	public String toString(){

		return "["+nome+", "+reparto.toString()+", "+id+", "+quantita+", "+prezzo+", "+mis.toString()+"]\n";

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Prodotto)){

			return false;

		}

		Prodotto altro = (Prodotto) obj;

		return (nome.equals(altro.nome))&&(reparto.equals(altro.reparto))&&(id.equals(altro.id))&&(quantita == altro.quantita)&&(prezzo == altro.prezzo)&&(mis.equals(altro.mis));

	}

	@Override
	public int hashCode(){

		int hash = 7;
		return hash * 31 + (nome.hashCode() + reparto.hashCode() + id.hashCode() + (int)quantita + (int)prezzo + mis.hashCode());

	}

}