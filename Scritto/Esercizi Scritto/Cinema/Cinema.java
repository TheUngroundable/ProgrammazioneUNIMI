import java.util.*;

public class Cinema{

	private String titolo;
	private String orario;
	private Posto[] posti;

	public Cinema(String titolo, String orario, Posto[] posti){

		this.titolo = titolo;
		this.orario = orario;
		this.posti = posti;

	}
	
	public void setTitolo(String titolo){

		this.titolo = titolo;

	}

	public String getTitolo(){

		return titolo;

	}

	public void setOrario(String orario){

		this.orario = orario;

	}

	public String getOrario(){

		return orario;

	}

	public void setPosti(Posto[] posti){

		this.posti = posti;

	}

	public Posto[] getPosti(){

		return posti;

	}

	//Metodi

	public int postiLiberi(){

		int count = 0; 

		for(int i = 0; i < posti.length; i++){

			if(posti[i] == null){

				count++;

			}

		}

		return count;

	}

	public int postiOccupati(){

		int count = 0; 

		for(int i = 0; i < posti.length; i++){

			if(posti[i] != null){

				count++;

			}

		}

		return count;

	}

	public int incasso(){

		int output = 0;

		for(Posto posto : posti){

			output += posto.getSpettatore().getBiglietto().getCosto();

		}

		return output;

	}

	public Posto getPostoLibero(){

		for(Posto posto : posti){

			if(posto != null){

				return posto;

			}

		}

		return null;

	}

	/*
	
	private String titolo;
	private String orario;
	private Posto[] posti;

	*/

	@Override
	public String toString(){

		return "["+titolo+", "+orario+", "+Arrays.toString(posti)+"]";

	}

}