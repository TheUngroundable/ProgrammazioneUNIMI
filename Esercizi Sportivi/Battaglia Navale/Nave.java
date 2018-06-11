import java.util.*;
import java.io.*;


public class Nave{

	public Posizione posizione;
	public int lunghezza;
	public boolean orizzontale;
	public boolean colpita;

	public Nave(){

		this.posizione = null;
		this.lunghezza = 0;
		this.orizzontale = false;
		this.colpita = false;

	}

	public Nave(Posizione inizio, int lunghezza, boolean orizzontale) throws Exception{

		this.posizione = inizio;

		if((inizio.riga + lunghezza) > 9 || (inizio.colonna + lunghezza) > 9 ){

			throw new Exception("Posizione sul campo da gioco non valida!");

		} else {

			if(lunghezza > 0){

				this.lunghezza = lunghezza;

			} else {

				throw new Exception("Lunghezza non valida!");

			}
		}

		this.orizzontale = orizzontale;
		this.colpita = false;

	}

	public static Nave parseNave(String nave) throws Exception{

		//"C1:6:V"

		String[] parseRaw = nave.split(":");
		Posizione pos;

		try{

			pos = new Posizione();

		} catch(Exception e){

			throw new Exception("Posizione non valida!");

		}


		pos.parsePosizione(parseRaw[0]);

		boolean orizzontale;

		if(parseRaw[2].equals("V")){

			orizzontale = false;

		} else {

			orizzontale = true;

		}

		int lunghezza = Integer.parseInt(parseRaw[1]);

		if(!(lunghezza >= 0) && !(lunghezza <= 9)){

			throw new Exception("Lunghezza non valida");

		}


		try{

			Nave naveTemp = new Nave(pos, lunghezza, orizzontale);
			return naveTemp;

		} catch (Exception e){

			throw new Exception("Nave non valida");

		}

	}

	public boolean occupa(Posizione posizione){

		String toStringCheck = this.posizione.toString();

		if(orizzontale){

			if(posizione.riga == this.posizione.riga){

				if(this.posizione.colonna - posizione.colonna < 0 ){

					return false;

				} else {

					return true;

				}

			} else {

				return false;

			}
 
		} else {

			if(posizione.colonna == this.posizione.colonna){


				if(this.posizione.riga - posizione.riga < 0 ){

					return false;

				} else {

					return true;

				}
			} else {

				return false;

			}

		}

	}

	public void colpisci(Posizione posizione){

		if((posizione.riga == this.posizione.riga) && (posizione.colonna == this.posizione.colonna) ){

			colpita = true;

		} else {

			colpita = false;

		}

	}

}