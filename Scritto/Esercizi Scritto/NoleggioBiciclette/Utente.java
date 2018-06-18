import java.util.*;

public class Utente{

	private String nome;
	private String cognome;
	private Bicicletta bicicletta;

	public Utente(){

		nome = null;
		cognome = null;
		bicicletta = null;

	}

	public Utente(String nome, String cognome){

		this.nome = nome;
		this.cognome = cognome;
		bicicletta = null;

	}

	public Bicicletta bicicletta(){

		if(bicicletta != null){

			return bicicletta;

		} else {

			return null;

		}

	}

	public void prendiInUso(Bicicletta x){

		if(bicicletta != null){

			throw new IllegalStateException();

		} else {

			bicicletta = x;

		}

	}


	public void restituisci(){

		if(bicicletta == null){

			throw new IllegalStateException();

		} else {

			bicicletta = null;

		}

	}

	@Override
	public String toString(){

		return "["+nome+", "+cognome+", "+bicicletta.toString()+"]";

	}

}