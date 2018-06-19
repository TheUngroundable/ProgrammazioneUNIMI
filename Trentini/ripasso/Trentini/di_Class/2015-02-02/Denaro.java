import java.util.*;

/** rappresenta del contante astratto
 */
public abstract class Denaro { /*implements Comparable<Denaro>*/

    private int valoreInCentesimi;

    /** protetto perche' deve essere usato solo nei costruttori dei figli (anche se in realta' e' usabile anche nel package)
     */
    protected void setValoreInCentesimi(int val) {
        valoreInCentesimi=val;
    }

    public Importo getImporto() {
        return new Importo(valoreInCentesimi);
    }

    public int getValoreInCentesimi() {
        return valoreInCentesimi;
    }

    /*
        public int compareTo(Denaro altro) {
            return valoreInCentesimi-altro.getValoreInCentesimi();
        }
    */

    public String toString() {
        StringBuffer sb=new StringBuffer();

        sb.append(getClass().getName());
        sb.append("(");
        sb.append(valoreInCentesimi);
        sb.append(" cent)");

        return sb.toString();
    }
}
