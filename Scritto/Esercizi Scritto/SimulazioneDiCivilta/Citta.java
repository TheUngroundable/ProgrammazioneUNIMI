import java.util.*;

public class Citta {

	private String nome;
	private Risorsa risorsa;

	public Citta(){

		nome = null;
		risorsa = null;

	}

	public Citta(String nome, Risorsa risorsa){

		this.nome = nome;
		this.risorsa = risorsa;

	}

	public String getNome(){

		return nome;

	}

	public Risorsa produci(){

		return risorsa;

	}


	@Override
	public String toString(){

		return "["+nome+", "+risorsa.getNome()+"]";

	}

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