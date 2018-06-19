import java.util.*;

public class Autostrada extends Strada {
    private float potenzaMinimaPerAccedere;
    private float tariffaBase; // euro/km

    private ArrayList<Veicolo> dentro;

    public Autostrada(int lunghezza, int limite, float tariffaBase, float potenzaMinimaPerAccedere) {
        super(lunghezza,limite);
        this.potenzaMinimaPerAccedere=potenzaMinimaPerAccedere;
        dentro=new ArrayList<Veicolo>();
        this.tariffaBase=tariffaBase;
    }
    
    /** se accetta il veicolo lo aggiunge al contenuto ed emette un ticket
     * se NON accetta lancia eccezione
     */
    public Biglietto ingresso(Veicolo v){
		if(v.getPotenza()>=potenzaMinimaPerAccedere){
			dentro.add(v);
			Biglietto t=new Biglietto(v); //aggancia gia' reciprocamente
			//v.setBiglietto(t);
			return t;
		}
        else
            throw new RuntimeException("Potenza del veicolo non ammessa!");
	}

	/** se il veicolo NON c'era lancia eccezione, se c'era calcola il pedaggio effettivo e controlla se non e' stato superato il limite di velocita', nel caso lo sia stato lancia eccezione (da creare) MultaException
	 */
    public float uscita(Veicolo v){
		if(!dentro.contains(v)) throw new RuntimeException("Il veicolo non era mai entrato!");
		
		float tempo=(System.currentTimeMillis()-v.getBiglietto().orarioIngresso())/3600000f;
		//System.out.print("tempo: ");
		//System.out.println(tempo);

		if(tempo < orePercorrenzaVelocitaCodice())
		throw new RuntimeException("Superato limite di velocita'!");
		
		return pedaggio(v);
	}

    /** pedaggio come superiore, ma accetta solo veicoli superiori a una certa potenza, se non accetta lancia eccezione
     */
    public float pedaggio(Veicolo v) {
        if(v.getPotenza()>=potenzaMinimaPerAccedere)
            return calcolaPedaggio(v);
        else
            throw new RuntimeException("Potenza del veicolo non ammessa!");
    }

    /** pedaggio semplice, conta solo il numero di assi:
     * fino a 3 assi tariffa base, dopo i 3 assi x1.5
     */
    private float calcolaPedaggio(Veicolo v) {
        if(v.getAssi()<=3)
            return tariffaBase*getLunghezza();
        else
            //return tariffaBase*getLunghezza()*1.5f;
            return tariffaBase*1.5f*getLunghezza();
    }
    
    
    public int quantiVeicoli(){return dentro.size();}
    
    /** restituisce la potenza media dei veicoli dentro in questo momento 
     */
    public float potenzaMedia(){
		float potenzaTotale=0;
		for(Veicolo v:dentro){
			potenzaTotale+=v.getPotenza();
		}
		return potenzaTotale/dentro.size();
	}



    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(");
        sb.append(super.toString());
        sb.append(", ");
        sb.append(potenzaMinimaPerAccedere);
        sb.append(",");
        sb.append(tariffaBase);
        sb.append(")");
        return sb.toString();
    }
}
