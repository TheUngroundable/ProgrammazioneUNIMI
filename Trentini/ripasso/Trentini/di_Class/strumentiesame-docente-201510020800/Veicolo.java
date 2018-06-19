/**
veicoli
- lunghezza
- peso
- assi
- targa
*/

public abstract class Veicolo {
    private String targa;
    //private float peso; // tonnellate
    //private float lunghezza; // metri
    private int assi; // numero
    //private int ruote; // numero
    //private int euro; // omologazione normative EURO
    private float potenza; // kW
    private Ticket t;
    
    
    /** questo ci vuole e va messo in specifica
     */
    public void setTicket(Ticket t){
		this.t=t;
	}

    /** questo ci vuole e va messo in specifica
     */
    public Ticket getTicket(){
		return t;
	}

    public String getTarga() {
        return targa;
    }
    /*
    public float getPeso() {
        return peso;
    }
    */
    /*
    public float getLunghezza() {
        return lunghezza;
    }
    */
    public int getAssi() {
        return assi;
    }
    /*
    public int getRuote() {
        return ruote;
    }
    */
    /*
    public int getEuro() {
        return euro;
    }
    */
    public float getPotenza() {
        return potenza;
    }


    public Veicolo(String targa, int assi, float potenza) {
        this.targa=targa;
        //this.peso=peso;
        //this.lunghezza=lunghezza;
        this.assi=assi;
        //this.ruote=ruote;
        //this.euro=euro;
        this.potenza=potenza;
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(T:");
        sb.append(targa);
        //sb.append(", P:");
        //sb.append(peso);
        //sb.append(", L:");
        //sb.append(lunghezza);
        sb.append(", A:");
        sb.append(assi);
        //sb.append(", R:");
        //sb.append(ruote);
        //sb.append(", E:");
        //sb.append(euro);
        sb.append(", W:");
        sb.append(potenza);
        sb.append(")");
        return sb.toString();
    }
}
