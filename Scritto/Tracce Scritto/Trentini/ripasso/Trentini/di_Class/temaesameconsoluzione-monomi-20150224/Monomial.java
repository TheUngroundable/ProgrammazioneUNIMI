/**
 * Questa classe definisce dei monomi, testualmente descritti da stringhe come
 * "0.5a2b1a1c3", dove 0.5 è il coefficiente e a2b1a1c1 è la parte letterale, corrispondente
 *  al prodotto di 0,5, il quadrato di a, b, ancora, e c alla terza
 * @author lorenzo
 */
public class Monomial {

    private  int[]   factors; // rappresenta la parte letterale
    private  int     coeff;  // il coefficiente numerico

    private       String  literal;  //redundant (caching)


    /**
     * costruisce un monomio corrispondente all stringa passata come argomento,
     * il cui formato si assume sia quello descritto sopra (in caso contrario
     * il metodo solleverà una eccezione non controllata, come IllegalArgumentException)
     * il monomio viene implicitamente tradotto in forma normale, per convenienza
     * di implementatazione
     * @param repr la stringa che rappresenta il monomio
     * @throws IllegalArgumentException
     */
    public Monomial(String repr) {
        String[] letters      = repr.split("[^a-z]+"),
                 coefficients = repr.split("[a-z]");
                 
        this.factors = new int['z'-'a']; //all exponents initially 0
        if ( (this.coeff = Integer.parseInt(coefficients[0])) != 0) {
            for (int i = 1, exp; i < letters.length ; i++) { //we skip the first position of letters, which is empty
                String l = letters[i];
                if ( (exp = Integer.parseInt(coefficients[i]) ) < 0) {
                    throw new IllegalArgumentException();
                }

                this.factors[l.charAt(0) - 'a'] +=  exp;
            }
        }


    }

    /**
     *
     * @return il cefficiente numerico del monomio
     */
    public int coefficient() {
        return this.coeff;
    }

    /**
     *
     * @return la parte letterale del monomio; la stringa
     * vuota ("") nel caso essa non sia presente
     */
    public String literal () {
        if (this.literal == null) {
            StringBuilder b = new StringBuilder();
            for (int i = 0 , exp ; i < this.factors.length; i++) {
                if ( (exp = this.factors[i]) != 0) {
                    b.append((char) ('a' + i)).append(exp);
                }
            }
            this.literal = b.toString();
        }

        return this.literal;
    }

    /**
     *
     * @param x una lettera
     * @return l'esponente associato ad <code>x</code> nel monomio (in
     * particolare 0 se <code>x</code> non compare nella parte letterale)
     * @throws IndexOutOfBoundsException se <code>x</code> non è compreso tra 'a' e 'z'
     */
    public int getExp (char x) {
        return this.factors[x - 'a'];
    }

    private static boolean isAlphabetic (char c) {
        return 'a' <= c && c <= 'z';
    }


    /**
     * @param o un riferimento ad oggetto
     * @return <code>true</code> se e solo se <code>o</code> è un monomio
     * equivalente a <code>this</code>: due monomi sono equivalenti se e solo
     * se o hanno entrambi come coeffiente 0, oppure se i loro coefficienti e
     * le rispettive parti letterali coincidono
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof Monomial && toString().equals(o.toString());
    }

    //non richiesto
    @Override
    public int hashCode() {
        return toString().hashCode();
    }


    /**
     *
     * @return la stringa che rappresenta il monomio, nello stesso formato accettato
     * dal costruttore, ed in forma normale; "0" se il monomio ha come coefficiente 0
     * (si ricordi che gli esponenti nella parte letterale vanno indicati se e solo se diversi da 0)
     */
    @Override
    public String toString () {
        return this.coeff+ literal();
    }


    /**
     *
     * @param m un altro monomio
     * @return <code>true</code> se e solo se <code>this</code> e
     * <code>m</code> hanno la stessa parte letterale
     */
    public boolean similar (Monomial m) {
        return literal().equals(m.literal());
    }

    /**
     *
     * @param m un altro monomio
     * @return il prodotto di <code>this</code> con <code>m</code>
     */
    public Monomial product (Monomial m) {
        int k = this.coeff * m.coeff ;
        Monomial prod = new Monomial(String.valueOf(k));
        if (k != 0) {
            for (int i = 0; i < this.factors.length; i++) {
                prod.factors[i] = this.factors[i] + m.factors[i];
            }
        }

        return prod;

    }


    /**
     *
     * @param m un altro monomio
     * @return la somma di <code>this</code> e <code>m</code>; oppure
     * <code>null</code> se <code>this</code> e <code>m</code> non sono simili
     */
    public Monomial sum (Monomial m) {
        if (similar (m)) {
            return new Monomial ((this.coeff+m.coeff)+literal());
        }
        return null;

    }

    /**
     *
     * @param m un altro monomio
     * @return il risultato della divisione di <code>this</code> per <code>m</code>;
     * <code>null</code> se  non sono divisibili
     */
    public Monomial quotient (Monomial m) {
        if (this.coeff == 0 && m.coeff != 0) { //caso particolare
            return this;
        }

        Monomial quot = null;
        if (m.coeff != 0 && this.coeff % m.coeff == 0) {
            quot = new Monomial(String.valueOf( this.coeff / m.coeff));
            for (int i = 0, exp; i < this.factors.length; i++) {
                if ( (exp = this.factors[i] - m.factors[i]) < 0) {
                    return null;
                }
                quot.factors[i] = this.factors[i] - m.factors[i];
            }
        }

        return quot;
    }
 
    /**
     *
     * @return il monomio opposto di <code>this</code>
     */
    public Monomial opposite() {
		//throw new UnsupportedOperationException();
        if (this.coeff == 0) {
            return this;
        }
        return new Monomial(-this.coeff+this.literal());
    }

/*
	public Monomial quotient (Monomial m) //throws UnsupportedOperationException
   //Restituisce il risultato della divisione dell’istanza per m, se sono divisibili; altrimenti restituisce null.
   {
      throw new UnsupportedOperationException();
   }
*/
}
