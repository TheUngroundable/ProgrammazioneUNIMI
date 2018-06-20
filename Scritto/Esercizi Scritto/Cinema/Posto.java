import java.util.*;

public class Posto{

	private int posto;
	private char fila;
	private Spettatore spettatore;

	public Posto(int posto, char fila){

		this.posto = posto;
		this.fila = fila;
		this.spettatore = null;

	}

	public void setPosto(int posto){

		this.posto = posto;

	}

	public int getPosto(){

		return posto;

	}

	public void setFila(char fila){

		this.fila = fila;

	}

	public char getFila(){

		return fila;

	}

	public void setSpettatore(Spettatore spettatore){

		this.spettatore = spettatore;

	}

	public Spettatore getSpettatore(){

		return spettatore;

	}

	public void Siede(Spettatore s){

		if(spettatore != null){

			return;

		} else {

			//controlla se il biglietto corrisponde
			if(this.posto == s.getBiglietto().getPosto().getPosto() && this.fila == s.getBiglietto().getPosto().getFila()){


				this.spettatore = s;

			}

		}

	}

	@Override
	public String toString(){

		if(this == null){

			return "";

		} else {

			return "["+posto+", "+fila+", "+spettatore.toString()+"]";

		}

	}

}