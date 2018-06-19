/**
 *
 * questa classe definisce monomi la cui parte letterale è
 * formata da al più un simbolo; i metodi ereditati che restituiscono
 * logicamente un monomio semplice sono ridefiniti
 */
public class SimpleMonomial extends Monomial implements Comparable<SimpleMonomial> {

    private final char symbol; //per convenienza
    /**
     * costruisce un monomio semplice
     * @param coeff il coefficiente
     * @param c il simbolo
     * @param exp l'esponente associato al simbolo
     */
    public SimpleMonomial(int coeff, char c, int exp) {
        super(String.valueOf(coeff)+c+String.valueOf(exp));
        this.symbol = c;
    }

    /**
     * esegue un confronto fra monomi basato prima sul confronto (lessicale)
     * tra le parti letterali, quindi sul confronto tra i coefficienti
     * @param sm un altro monomio semplice
     * @return -1. 0, 1 a seconda che <code>this</code> sia minore, uguale, o
       maggiore di <code>sm</code>
     */
    @Override
    public int compareTo(SimpleMonomial sm) {
        int comp = super.literal().compareTo(sm.literal());
        if (comp != 0) {
            return comp;
        }

        Integer c = super.coefficient();
        return c.compareTo(sm.coefficient());

    }

    /*
    estrae da un monomio dato il monomio semplice corrispondente a <code>this</code>
    */
    /*private SimpleMonomial getFactor(Monomial m ) {
        return new SimpleMonomial (m.coefficient(), this.symbol, m.getExp(this.symbol));
    }*/

    /**
    *
    * @param m un altro monomio
    * @return la somma di <code>this</code> e <code>m</code> come <code>SimpleMonomial</code>;
    * <code>null</code> se <code>this</code> e <code>m</code> non sono simili
    */
    @Override
    public SimpleMonomial sum (Monomial m) {
        int cm = m.coefficient();
        if (cm  == 0) {
            return this;
        }
        if ( similar(m)) {
            return new SimpleMonomial( cm + coefficient(), this.symbol, this.getExp(symbol));
        }

        return null;
    }

    /**
     *
     * @param m un altro monomio
     * @return il risultato della divisione di <code>this</code> per <code>m</code> come <code>SimpleMonomial</code>;
     * <code>null</code> se non sono divisibili
     */
    @Override
    public SimpleMonomial quotient (Monomial m) {
        int c = coefficient(), mc =  m.coefficient() , e_diff;
        if (c == 0 && mc != 0) { //caso particolare
            return this;
        }

        String l = m.literal();
        if (mc != 0 && c % mc == 0 && l.charAt(0) == this.symbol) {
            try {
                e_diff = getExp(this.symbol) - Integer.parseInt(l.substring(1));
                if ( e_diff >= 0 ) {
                    return new SimpleMonomial( c / mc , this.symbol, e_diff);
                }
            }

            catch(Exception e) {

            }
        }

        return null;
    }

    /**
     *
     * @return il monomio semplice opposto di <code>this</code>
     */
    @Override
    public SimpleMonomial opposite() {
        if ( coefficient() == 0) {
            return this;
        }

        return new SimpleMonomial(- coefficient(), this.symbol, getExp(this.symbol));

    }

}
