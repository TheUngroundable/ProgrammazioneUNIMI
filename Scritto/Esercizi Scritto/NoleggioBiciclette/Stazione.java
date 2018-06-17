import java.util.*;

public class Stazione{

	private String nome;
	private double x;
	private double y;
	private int posizioni;
	private LinkedList<Bicicletta> occupate;
	private boolean elettriche;

	public Stazione(String nome, double x, double y, int posizioni, boolean elettriche){

		this.nome = nome;
		this.x = x;
		this.y = y;
		this.posizioni = posizioni;
		this.occupate = new LinkedList<Bicicletta>();
		this.elettriche = elettriche;

	}

	public int nPosizioni(){

		return posizioni;

	}

	public int nBiciclette(){

		return occupate.size();

	}

	public boolean piena(){

		if(posizioni == occupate.size()){

			return true;

		} else {

			return false;

		}

	}

	public boolean vuota(){

		if(occupate.size()==0){

			return true;

		} else {

			return false;

		}

	}

	public boolean ammetteElettriche(){

		return elettriche;

	}

	public boolean ciSonoElettriche(){

		boolean ciSonoElettriche = false;

		for(Bicicletta bicicletta : occupate){

			if(bicicletta.elettrica()){

				ciSonoElettriche = true;

			}

		}

		return ciSonoElettriche;

	}

	public Bicicletta posizione(int i){

		if(occupate.get(i)!=null){

			return occupate.get(i);

		} else {

			return null;

		}

	}

	public void aggancia(Utente u, int i){

		if(occupate.get(i)!=null || u.bicicletta() == null){

			throw new IllegalStateException();

		} else {

			occupate.set(i);

		}

	}

}