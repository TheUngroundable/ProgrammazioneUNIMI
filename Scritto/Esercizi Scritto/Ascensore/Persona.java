import java.util.*;

public class Persona{

	private int destinazione;
	private int peso;
	private String id;

	public Persona(int destinazione, int peso, String id){

		this.destinazione = destinazione;
		this.peso = peso;
		this.id = id;

	}

	public int destinazione(){

		return destinazione;

	}

	public int peso(){

		return peso;

	}

	@Override
	public String toString(){

		return "["+id+", "+destinazione+", "+peso+"]";

	}

	@Override
	public boolean equals(Object obj){

		if(obj == null){

			return false;

		}

		if(this == obj){

			return true;

		}

		if(!(obj instanceof Persona)){

			return false;

		}

		Persona altra = (Persona) obj;

		return (this.destinazione == altra.destinazione) && (this.peso == altra.peso) && (this.id.equals(altra.id));

	}

}