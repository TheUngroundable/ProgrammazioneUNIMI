import java.util.*;

public class Stazione{

	private String nome;
	private double x;
	private double y;
	private int posizioni;
	private Bicicletta[] occupate;
	private boolean elettriche;

	public Stazione(String nome, double x, double y, int posizioni, boolean elettriche){

		this.nome = nome;
		this.x = x;
		this.y = y;
		this.posizioni = posizioni;
		this.occupate = new Bicicletta[posizioni];
		this.elettriche = elettriche;

	}

	public int nPosizioni(){

		return posizioni;

	}

	public int nBiciclette(){

		int count = 0;

		for(Bicicletta bici : occupate){

			if(bici != null){

				count++;

			}

		}

		return count;

	}

	public boolean piena(){

		if(posizioni == nBiciclette()){

			return true;

		} else {

			return false;

		}

	}

	public boolean vuota(){

		if(nBiciclette()==0){

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

		if(occupate[i]!=null){

			if(i>0 && i<posizioni){

				return occupate[i];

			} else {

				return null;

			}

		} else {

			return null;

		}

	}

	public void aggancia(Utente u, int i){

		//prima vediamo se c' è posto

		if(nBiciclette()<posizioni){

			if(occupate[i]!=null || u.bicicletta() == null){

				throw new IllegalStateException();

			} else {

				Bicicletta temp = u.bicicletta();
				occupate[i] = u.bicicletta();
				u.restituisci();
				temp.restituisci();

			}

		}

	}


	public int disponibile(boolean elettrica){

		for(int i = 0; i < occupate.length; i++){

			if(elettrica){

				if(occupate[i]!=null && occupate[i].elettrica()){

					return i;

				}

			} else {

				if(occupate[i]!=null){

					return i;


				}

			}

		}

		return -1;

	}

	public distanzaDa(double x, double y){

		return Math.sqrt(Math.pow(2,(x-this.x)+Math.pow(2,(y-this.y))));

	}


}