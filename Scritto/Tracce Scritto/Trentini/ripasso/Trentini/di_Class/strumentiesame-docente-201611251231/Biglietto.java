/** e' agganciato a veicolo, ma anche veicolo e' agganciato a ticket, in modo da controlalre che non ci siano scambi
 */
public class Biglietto{
	private Veicolo v;
	private long timestamp; // in millisecondi

    public Biglietto(Veicolo v) {
		timestamp=System.currentTimeMillis();
        this.v=v;
        v.setBiglietto(this);
    }
    
    public long orarioIngresso(){
		return timestamp;
	}
    
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(V:");
        sb.append(v);
        sb.append(")");
        return sb.toString();
    }
}
