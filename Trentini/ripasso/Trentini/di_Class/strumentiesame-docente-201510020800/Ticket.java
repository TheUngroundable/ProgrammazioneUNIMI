/** e' agganciato a veicolo, ma anche veicolo e' agganciato a ticket, in modo da controlalre che non ci siano scambi
 */
public class Ticket{
	private Veicolo v;
	private long timestamp; // in millisecondi

    public Ticket(Veicolo v) {
		timestamp=System.currentTimeMillis();
        this.v=v;
        v.setTicket(this);
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
