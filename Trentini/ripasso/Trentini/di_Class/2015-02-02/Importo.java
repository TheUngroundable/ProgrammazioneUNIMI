/** rappresenta una cifra di denaro, ma non e' contante
 */
public class Importo implements Comparable<Importo> {

    private int euro,centesimi;

    public Importo(int inCentesimi) {
        euro=(int)(inCentesimi/100);
        centesimi=inCentesimi%100;
    }

    public int inCentesimi() {
        return 100*euro+centesimi;
    }

    public int compareTo(Importo altro) {
        return inCentesimi()-altro.inCentesimi();
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();

        sb.append(getClass().getName());
        sb.append("(");
        sb.append(euro);
        sb.append(".");
        sb.append(centesimi);
        sb.append(")");

        return sb.toString();
    }
}
