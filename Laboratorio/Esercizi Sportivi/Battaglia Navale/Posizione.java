import java.util.*;
import java.io.*;


public class Posizione{

		public static int riga;
		public static int colonna;

		public Posizione(){

			riga = 0;
			colonna = 0;

		}		

		public Posizione(int riga, int colonna) throws Exception{

			if(riga >= 0 && riga <= 9){

				this.riga = riga;
				
			} else {

				throw new Exception("Riga inserita non valida");

			}


			if(colonna >= 0 && colonna <= 9){

				this.colonna = colonna;
				
			} else {

				throw new Exception("Colonna inserita non valida");

			}
			

		}

		public static Posizione parsePosizione(String posizione){

			//B9

			char ch = posizione.charAt(0);
			int pos = ch - 'A';

			int pippo = Character.getNumericValue(posizione.charAt(1));

			try{

				return new Posizione(pos, pippo);

			} catch (Exception e){

				return null;

			}
	

		}

		@Override
		public String toString(){

			return "riga: "+this.riga+"; colonna: "+this.colonna;

		}


}