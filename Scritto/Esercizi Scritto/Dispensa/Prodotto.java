import java.util.*;

public class Prodotto{

	String nome;

	public Prodotto(String nome){

		this.nome = nome;

	}

	@Override
	public String toString(){

		return "["+nome+"]";

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

		Prodotto prodotto = (Prodotto) obj;

		return (this.nome.toLowerCase().equals(prodotto.nome.toLowerCase()));

	}

	@Override
	public int hashCode(){

		int hash = 7;

		return hash = 31 * hash + nome.length();
	}

}