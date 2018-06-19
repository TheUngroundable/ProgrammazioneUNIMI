import java.util.*;

public class Conferenza {
    private String titolo;
    private int maxPagine,caratteriPerRiga,righePerPagina;
    private Vector<Articolo> articoli;


    public Conferenza() {
        this("A caso",10,20,6);
    }
    public Conferenza(String titolo,int maxP, int carP, int righeP) {
        this.titolo=titolo;
        maxPagine=maxP;
        caratteriPerRiga=carP;
        righePerPagina=righeP;
        articoli=new Vector<Articolo>();
    }

    /** verifica che l'articolo rispetti i vincoli, se si' accetta e restituisce l'ID, altrimenti -1
     */
    public int submit(Articolo art) {
        //System.err.println(art);
        if(
            art.pagine(righePerPagina,caratteriPerRiga)<=maxPagine
        ) {
            articoli.add(art);
            return articoli.size();
        }

        return -1;
    }

    /** restituisce quanti articoli non hanno ancora assegnato un revisore
     */
    public int quantiArticoliNonHannoRevisore() {
        return 0;
    }

    /** restituisce l'elenco dei titoli
     */
    public String[] titoli() {
        return null;
    }

    /** restituisce l'elenco degli autori
     */
    public String[] autori() {
        return new String[3];
    }

    /** restituisce gli articoli di un singolo autore
     */
    public Articolo[] articoliDiUnAutore(Autore aut) {
        return null;
    }

    /** restituisce il nr di articoli
     */
    public int nrArticoli() {
        return articoli.size();
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("(tit: ");
        sb.append(titolo);
        sb.append(", maxP: ");
        sb.append(maxPagine);
        sb.append(", righeP: ");
        sb.append(righePerPagina);
        sb.append(", carP: ");
        sb.append(caratteriPerRiga);
        sb.append(", nr.articoli: ");
        sb.append(nrArticoli());
        sb.append(", articoli: ");
        sb.append(articoli);
        sb.append(")");
        return sb.toString();
    }
}
