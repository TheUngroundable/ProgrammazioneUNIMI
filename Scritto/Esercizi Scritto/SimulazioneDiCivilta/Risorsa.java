import java.util.*;

public class Risorsa {

	private String nome;
	private int prezzo;

	public Risorsa(){

		this.nome = null;
		this.prezzo = 0;

	}

	public Risorsa(String nome, int prezzo){

		this.nome = nome;
		this.prezzo = prezzo;

	}

	public String getNome(){

		return nome;

	}

	public int getPrezzo(){

		return prezzo;

	}

	@Override
	public String toString(){

		return "["+nome+", "+prezzo+"]";

	}

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

	@Override

	public int hashCode(){

		int hash = 7;
		
		hash = 31 * hash + prezzo;

		return hash;


	}


}