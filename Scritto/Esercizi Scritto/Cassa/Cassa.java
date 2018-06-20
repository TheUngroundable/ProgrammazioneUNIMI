import java.util.*;

public class Cassa{

	private HashMap<Integer, Integer> cassa;
	private int cifraDaPagare;
	private int inseriti;
	private int resto;

	public Cassa(){

		this.cassa = new HashMap<Integer, Integer>();
		initCassa();
		this.cifraDaPagare = 0;

	}

	//inizializza con un po' di euro
	private void initCassa(){

		this.cassa.put(new Euro(1).getValore(), 5);
		this.cassa.put(new Euro(2).getValore(), 5);
		this.cassa.put(new Euro(5).getValore(), 5);
		this.cassa.put(new Euro(10).getValore(), 5);

	}

	//Setters & Getters

	public int getResto(){

		return resto;

	}

	//metodi

	public void inserisciInCassa(Euro e){

		// se già presente il taglio, aggiorna

		if(!cassa.containsKey(e.getValore())){

			cassa.put(e.getValore(), 1);

		} else {

			int temp = e.getValore();
			cassa.put(e.getValore(), cassa.get(e.getValore())+1);

		}

		// altrimenti aggiungi in tra

	}

	public void inserisci(Euro e){

		this.inseriti += e.getValore();

	}

	public boolean paga(){

		if(inseriti < cifraDaPagare){

			return false;

		} else {

			resto = inseriti-cifraDaPagare;
			return true;

		}

	}

	public void impostaPagamento(int e){

		this.cifraDaPagare = e;

	}

	public Euro emettiResto(){

			//sottraggo l' euro dalla cassa
			//lo ritorno
		//altrimenti continuo con il ciclo

		Set<Integer> keySet = cassa.keySet();

		Integer[] array = keySet.toArray(new Integer[keySet.size()]);

		//per ogni Euro in cassa parto da quello con più valore
		
		for(int i = array.length-1; i>=0; i--){
			//se il suo valore è minore o uguale al resto da emettere
			if(array[i]<=resto){

				//sottraggo il suo valore al resto da emettere				
				System.out.println("Restiamo insieme: "+array[i]);
				resto -= array[i];

				Euro output = new Euro(array[i]);

				

				break;

			}

		}

		return null;
	}

	@Override
	public String toString(){

		String output = "(\n";

		for(Integer euro : cassa.keySet()){

			output += euro+": "+cassa.get(euro)+"\n";

		}

		return output+=")";

	}

}