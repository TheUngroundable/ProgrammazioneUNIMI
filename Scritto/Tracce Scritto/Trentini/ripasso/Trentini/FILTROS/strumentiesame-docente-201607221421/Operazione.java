import java.util.*;

public abstract class Operazione implements Iterable<Operando> {

    private ArrayList<Operando> operandi=new ArrayList<Operando>();
    //private double risultato;


    /* lorenzo:
    togliamo implements Iterable<Operando> e facciamo in modo che anzichè
    il metodo iterator
    ci sia un metodo operands() che restituisce una List<Operando>, così
    gli suggeriamo che struttura usare
    */
    public List<Operando> getOperandi() {
        return new ArrayList<Operando>(operandi);
    }

    public void sort() {
        Collections.sort(operandi);
    }


    public int getNumeroOperandi() {
        return operandi.size();
    }


    public Iterator<Operando> iterator() {
        return operandi.iterator();
    }

    public void addOperando(Operando o) {
        //TODO: diverso da null
        operandi.add(o);
    }

    /**
     * restituisce (ma non calcola) il risultato dell'operazione
     */
    /*
    public double getRisultato() {
       return risultato;

    }
    */

    /** se lo fanno public possiamo giudicare negativamente
     */
    /*
    protected void setRisultato(double r) {
       risultato=r;

    }
    */

    public double ultimo() {
        return operandi.get(operandi.size()-1).getValore();

    }

    /**
     * calcola (e restituisce) il risultato dell'operazione
     * (ok Lorenzo, vedremo se aggiorneranno risultato)
     */
    public abstract double calcola();

    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("(");
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(calcola());
        sb.append(" da ");
        sb.append(operandi);
        sb.append(")");
        return sb.toString();
    }
}
