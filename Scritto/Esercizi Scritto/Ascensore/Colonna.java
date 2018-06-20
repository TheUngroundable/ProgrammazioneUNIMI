public class Colonna{

	private Ascensore ascensore;
	private int nPiani;
	private Piano[] piani;
	private int corrente;

	public Colonna(Ascensore ascensore, int nPiani, Piano[] piani){

		this.ascensore = ascensore;
		this.nPiani = nPiani;
		this.piani = piani;
		this.corrente = 0;

	}

	public void muoviAscensore(int prossimoPiano){

		corrente = prossimoPiano;

	}

	public Piano piano(){

		return piani[corrente];

	}

	public int intPiano(){

		return corrente;

	}

	public void movimentaPersone(){

		//fa scendere le persone

		//se a qualche persona nell' ascensore corrisponde questo piano
			//falle scendere dall' ascensore
		if(ascensore.nPersone() > 0){

			for(int i = 0; i < ascensore.getPersone().length; i++){
				//se il piano corrente corrisponde al piano della persona
				if(ascensore.getPersona(i)!=null){

					if(corrente == ascensore.getPersona(i).destinazione()){

						ascensore.scende(ascensore.getPersona(i));

					}

				}
			
			}

		}
		//fa salire le persone

		
		for(int i = 0; i<piani[corrente].quante(); i++){

			ascensore.sale(piani[corrente].persona(i));

		}

	}


	@Override
	public String toString(){

		String output = "{Ascensore: "+ascensore.toString()+"}\n{"+nPiani+"}\n{";

		for(Piano piano : piani){

			output += piano.toString();

		}

		output+="}\n{"+corrente+"}";

		return output;

	}

}