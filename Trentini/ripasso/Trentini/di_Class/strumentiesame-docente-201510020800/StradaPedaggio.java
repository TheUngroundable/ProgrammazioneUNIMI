public class StradaPedaggio extends Strada {
    private float tariffaBase; // euro/km

    public StradaPedaggio(int lunghezza, int limite, float tariffaBase) {
        super(lunghezza,limite);
        this.tariffaBase=tariffaBase;
    }

    /** pedaggio semplice, conta solo il numero di assi:
     * fino a 3 assi tariffa base, dopo i 3 assi x1.5
     */
    public float pedaggio(Veicolo v) {
        if(v.getAssi()<=3)
            return tariffaBase*getLunghezza();
        else
            return tariffaBase*getLunghezza()*1.5f;
    }


    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(");
        sb.append(super.toString());
        sb.append(",");
        sb.append(tariffaBase);
        sb.append(")");
        return sb.toString();
    }
}
