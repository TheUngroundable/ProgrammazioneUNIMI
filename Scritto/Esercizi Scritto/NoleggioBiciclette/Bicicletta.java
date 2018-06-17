import java.util.*;

public class Bicicletta{

	private String id;
	private boolean elettrica;
	private Utente inUso;

	public Bicicletta(){

		id = null;
		elettrica = false;
		inUso = null;

	}

	public Bicicletta(String id, boolean elettrica){

		this.id = id;
		this.elettrica = elettrica;
		this.inUso = null;

	}

	public String getId(){

		return id;

	}

	public boolean elettrica(){

		return elettrica;

	}

	public void daiInUso(Utente x){

		if(inUso == null){

			throw new IllegalStateException();
		
		} else {

			inUso = x;

		}

	}

	public void restituisci(){

		if(inUso == null){

			throw new IllegalStateException();

		} else {

			inUso = null;

		}

	}

	public Utente utente(){

		return inUso;

	}

	@Override
	public String toString(){

		return "["+id+", "+elettrica+", "+inUso.toString()+"]";

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Bicicletta)){

			return false;

		}

		Bicicletta altra = (Bicicletta) obj;

		return (this.id == altra.getId()) && (this.elettrica == altra.elettrica()) && (this.inUso.equals(altra.utente()));

	}

	@Override
	public int hashCode(){

		int hash = 7;

		hash = 31 * hash + inUso.hashCode();
		
		for(int i = 0; i < id.length(); i++){

			hash+=(int)id.charAt(i);

		}

		if(elettrica){

			hash +=1;

		} else {

			hash += 0;

		}

		return hash;

	}

}