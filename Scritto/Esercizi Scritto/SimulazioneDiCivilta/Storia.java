import java.util.*;

public class Storia{

	private LinkedList<Civilta> listaCivilta;


	/**
	*	Costruttore di default
	*/

	public Storia(){

		this.listaCivilta = null;

	}


	/**
	*	Costruttore con parametro
	*	@param listaCivilta Lista da assegnare a questa Storia
	*/

	public Storia(LinkedList<Civilta> listaCivilta){

		this.listaCivilta = listaCivilta;

	}


	/**
	*	@return La lista delle Civiltà relative a questa Storia
	*/

	public LinkedList<Civilta> getListaCivilta(){

		return listaCivilta;

	}


	/**
	*	Effettua uno e un solo commercio fra tutte le civiltà della storia
	*	ora non ho cazzi di scrivere tutto il pippozzo, te lo becchi sulla traccia d' esame
	*/

	public void commercia(){

		for(int i = 0; i < listaCivilta.size(); i++){

			boolean venduto = false;

			for(int j = 0; j < listaCivilta.size(); j++){

				if(!listaCivilta.get(i).equals(listaCivilta.get(j))&&!venduto){

					if(listaCivilta.get(i).vendiRisorseA(listaCivilta.get(j)))
						venduto = true;

				}

			}

		}

	}

	/**
	*	@return La civiltà più ricca fra quelle relative alla Storia
	*/

	public Civilta piuRicca(){

		int max = Integer.MIN_VALUE;
		Civilta output = null;

		for(Civilta civilta : listaCivilta){

			if(civilta.getTesoro()>max){

				max = civilta.getTesoro();
				output = civilta;

			}

		}

		return output;

	}


	/**
	*	@return La civiltà più povera della Storia hahhah
	*/
	public Civilta piuPovera(){

		int min = Integer.MAX_VALUE;
		Civilta output = null;

		for(Civilta civilta : listaCivilta){

			if(civilta.getTesoro()<min){

				min = civilta.getTesoro();
				output = civilta;

			}

		}

		return output;

	}


	/**
	*	@param n Cicli di produzione
	*	@return La civiltà più ricca
	*/

	public Civilta evolvi(int n){

		for(int i = 0; i<n; i++){

			for(Civilta civilta : listaCivilta){

				civilta.faiProdurre();

			}

		}

		commercia();

		return piuRicca();

	}

	/**
	*	Pippozzo un po' lunghino
	*/
	public void conquista(){

		Civilta piuRicca = this.piuRicca();

		Civilta piuPovera = this.piuPovera();

		if(piuRicca.getTesoro() != piuPovera.getTesoro()){

			int min = Integer.MAX_VALUE;
			Citta output = null;

			for(Citta citta : piuPovera.getCitta()){


					if(citta.produci().getPrezzo() < min){

						min = citta.produci().getPrezzo();
						output = citta;

					}
				

			}

			piuRicca.aggiungiCitta(output);
			piuPovera.rimuoviCitta(output);

		}

	}

}