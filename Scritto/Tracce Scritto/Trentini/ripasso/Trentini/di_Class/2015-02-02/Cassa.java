import java.util.*;
import java.io.*;


/** rappresenta una cassa di un market, passando i vari prodotti si puo' puoi calcolare un totale
 */
public class Cassa {

    private Vector<Prodotto> spesa;
    private Vector<Denaro> pagamento;

    public Cassa() {
        spesa=new Vector<Prodotto>();
        pagamento=new Vector<Denaro>();
    }

    /** scansione prodotto
     */
    public void passa(Prodotto p) {
        spesa.add(p);
    }

    /** pagamento parziale
     */
    public void paga(Denaro d) {
        pagamento.add(d);
    }

    public int getPagamentoParzialeInCentesimi() {
        int cent=0;
        for(Denaro d: pagamento) {
            cent+=d.getValoreInCentesimi();
        }
        return cent;
    }

    /** ritorna true se il denaro immesso copre la spesa totale
     */
    public boolean pagato() {
        return getPagamentoParzialeInCentesimi()>=totaleInCentesimi();
    }


    /** azzera lo stato della cassa e segnala l'importo eventualmente pagato finora
     */
    public Importo azzeramento() {
        Importo i=new Importo(getPagamentoParzialeInCentesimi());
        spesa=new Vector<Prodotto>();
        pagamento=new Vector<Denaro>();
        return i;
    }

    /** storna un prodotto dalla cassa
     */
    public Prodotto storna(int numero) {
        return spesa.remove(numero);
    }


    /** storna un prodotto dalla cassa
     */
    public Prodotto storna(Prodotto p) {
        if(spesa.remove(p)) return p;
        else return null;
    }

    public Importo calcolaResto() {
        if(pagato())
            return new Importo(getPagamentoParzialeInCentesimi()-totaleInCentesimi());
        else
            return null;
    }

    public int quanti() {
        return spesa.size();
    }

    /*    public Prodotto esamina(int numero) {
            return contenuto.get(numero);
        }*/

    public String toString() {
        StringBuffer sb=new StringBuffer();

        sb.append(getClass().getName());
        sb.append("(");
        sb.append(spesa);
        sb.append(" - ");
        sb.append(pagamento);
        sb.append(" - ");
        sb.append(totaleInCentesimi());
        sb.append(" - ");
        sb.append(pagato());
        sb.append(")");

        return sb.toString();
    }



    public Importo totale() {
        return new Importo(totaleInCentesimi());
    }

    public int totaleInCentesimi() {
        int cent=0;
        for(Prodotto p: spesa) {
            cent+=p.inCentesimi();
        }
        return cent;
    }

    public Prodotto piuCostoso() {
        //System.out.println(spesa);
        Collections.sort(spesa);
        //System.out.println(spesa);
        return spesa.get(spesa.size()-1);
    }


    /** apre file e legge i prodotti da passare, formato:
     * nome,prezzoincentesimi
     * (1 prodotto per riga)
     */
    public void salvatempo(String nomeFile) throws IOException {
        //TODO
    }
}
