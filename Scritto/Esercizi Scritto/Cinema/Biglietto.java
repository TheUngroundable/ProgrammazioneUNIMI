import java.util.*;

public class Biglietto{

	private String titolo;
	private String orario;
	private Posto posto;
	private int costo;

	public Biglietto(String titolo, String orario, Posto posto, int costo){

		this.titolo = titolo;
		this.orario = orario;
		this.posto = posto;
		this.costo = costo;

	}

	//Setters and getters

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

	public void setPosto(Posto posto){

		this.posto = posto;

	}

	public Posto getPosto(){

		return posto;

	}

	public void setCosto(int costo){

		this.costo = costo;

	}

	public int getCosto(){

		return costo;

	}

	//titolo orario posto costo

	@Override
	public String toString(){

		return "["+titolo+", "+orario+", "+posto.toString()+", "+costo+"]";

	}

}