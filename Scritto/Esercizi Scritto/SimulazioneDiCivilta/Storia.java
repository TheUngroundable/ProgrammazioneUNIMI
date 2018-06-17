import java.util.*;

public class Storia{

	private LinkedList<Civilta> listaCivilta;

	public Storia(){

		this.listaCivilta = null;

	}

	public Storia(LinkedList<Civilta> listaCivilta){

		this.listaCivilta = listaCivilta;

	}

	public LinkedList<Civilta> getListaCivilta(){

		return listaCivilta;

	}


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

	public Civilta evolvi(int n){

		for(Civilta civilta : listaCivilta){

			civilta.faiProdurre();

		}

		commercia();

		return piuRicca();

	}

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