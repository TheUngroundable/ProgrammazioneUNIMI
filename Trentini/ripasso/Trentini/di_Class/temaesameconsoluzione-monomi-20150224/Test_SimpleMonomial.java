/*
 esegue un semplice test del costruttore e dei metodi ridefiniti
 */
public class Test_SimpleMonomial extends AbstractTest {

    @Override
    public void go() {
        int punteggio = 0;
        Monomial m;
        m = new SimpleMonomial(-2,'a', 3); //-2a3
        if (m.equals( new Monomial("-2a3"))) {
            punteggio += 20;
        }

        SimpleMonomial sm = new SimpleMonomial(1,'a', 3), //1a3
        result;

        result = (SimpleMonomial) m.sum(sm);
        if (result.equals(new Monomial("-1a3"))) {
            punteggio += 20;
        }

        result = (SimpleMonomial) m.quotient(sm);
        if (result.equals(new Monomial("-2"))) {
            punteggio += 20;
        }

        result = sm.opposite();
        if (result.equals(new SimpleMonomial(-1,'a', 3))) {
            punteggio += 20;
        }

        if (sm.compareTo((SimpleMonomial) m) > 0) {
            punteggio += 20;
        }

        setVal(punteggio);
    }
}
