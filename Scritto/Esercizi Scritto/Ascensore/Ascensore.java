import java.util.*;

public class Ascensore{

	private int capienzaMassima;
	private Persona[] persone;

	public Ascensore(int capienzaMassima){

		this.capienzaMassima = capienzaMassima;
		persone = new Persona[capienzaMassima];

	}

	public Persona[] getPersone(){

		return persone;

	}

	public Persona getPersona(int i){

		return persone[i];

	}

	public boolean sale(Persona p){

		if(nPersone()<capienzaMassima){

			for(int i = 0; i<persone.length; i++){

				if(persone[i]==null){

					persone[i] = p;
					return true;

				}

			}

		}

		return false;

	}

	public void scende(Persona p){

		for(int i = 0; i<capienzaMassima; i++){

			if(p.equals(persone[i])){

				persone[i] = null;

			}

		}

	}

	public int nPersone(){

		int count=0;

		for(int i = 0; i<persone.length; i++){

			if(persone[i]!=null){

				count++;

			}

		}

		return count;

	}

	@Override
	public String toString(){

		String output = "("+capienzaMassima+" ; ";

		for(int i = 0; i < persone.length; i++){

			if(persone[i] != null){

				output+=persone[i].toString();

			}
	
		}

		return output+")";

	}

}