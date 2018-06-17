import java.util.*;

public class Istogramma{

	private int larg;
	private String[] righe;

	public Istogramma(){

		righe = new String[26];
		larg = 0;
		initRighe();
	
	}

	public Istogramma(int larg){

		righe = new String[26];
		this.larg = larg;
		initRighe();

	}

	private void initRighe(){

		//lettere dell' alfabeto + tab
		for(int i = 0; i < 26; i++){

			righe[i] = (char)('a'+i)+"\t";

		}

	}

	public String toString(ModelloLinguistico m){

		String output = "";

		for(int i = 0; i<26; i++){

			output = output + righe[i];

			double counter =  m.frequenzaAssoluta((char)('a'+i));

			for(double j = 1; j < counter; j++){

				output += "*";

			}

			output += "\n";

		}

		return output;

	}


}