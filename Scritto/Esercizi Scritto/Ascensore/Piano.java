import java.util.*;

public class Piano{

	private LinkedList<Persona> persone;

	public Piano(){

		persone = new LinkedList<Persona>();

	}

	public void aggiungiInAttesa(Persona p){

		persone.add(p);

	}

	public int quante(){

		return persone.size();

	}

	public Persona persona(int i){

		return persone.get(i);

	}

	public boolean sale(int i, Ascensore a){

		return a.sale(persone.get(i)) && persone.remove(persone.get(i));

	}

	@Override
	public String toString(){

		String output="";

		for(Persona persona : persone){

			output+=persona.toString();

		}

		return output;

	}

}