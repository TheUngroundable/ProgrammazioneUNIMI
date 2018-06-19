import java.util.*;

public class Autostrada extends StradaPedaggio {
    private float potenzaMinimaPerAccedere;
    private ArrayList<Veicolo> dentro;

    public Autostrada(int lunghezza, int limite, float tariffaBase, float potenzaMinimaPerAccedere) {
        super(lunghezza,limite,tariffaBase);
        this.potenzaMinimaPerAccedere=potenzaMinimaPerAccedere;
        dentro=new ArrayList<Veicolo>();
    }
    
    /** se accetta il veicolo lo aggiunge al contenuto ed emette un ticket
     * se NON accetta lancia eccezione
     */
    public Ticket ingresso(Veicolo v){
		if(v.getPotenza()>=potenzaMinimaPerAccedere){
			dentro.add(v);
			Ticket t=new Ticket(v); //aggancia gia' reciprocamente
			//v.setTicket(t);
			return t;
		}
        else
            throw new RuntimeException("Potenza del veicolo non ammessa!");
	}

	/** se il veicolo NON c'era lancia eccezione, se c'era calcola il pedaggio effettivo e controlla se non e' stato superato il limite di velocita', nel caso lo sia stato lancia eccezione (da creare) MultaException
	 */
    public float uscita(Veicolo v){
		if(!dentro.contains(v)) throw new RuntimeException("Il veicolo non era mai entrato!");
		
		float tempo=(System.currentTimeMillis()-v.getTicket().orarioIngresso())/3600000f;
		//System.out.print("tempo: ");
		//System.out.println(tempo);

		if(tempo < orePercorrenzaVelocitaCodice())
		throw new MultaException("Superato limite di velocita'!");
		
		return pedaggio(v);
	}

    /** pedaggio come superiore, ma accetta solo veicoli superiori a una certa potenza, se non accetta lancia eccezione
     */
    public float pedaggio(Veicolo v) {
        if(v.getPotenza()>=potenzaMinimaPerAccedere)
            return super.pedaggio(v);
        else
            throw new RuntimeException("Potenza del veicolo non ammessa!");
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
        sb.append(")");
        return sb.toString();
    }
}
