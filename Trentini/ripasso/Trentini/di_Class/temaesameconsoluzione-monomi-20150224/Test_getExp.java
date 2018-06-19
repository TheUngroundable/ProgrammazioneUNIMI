public class Test_getExp extends AbstractTest {

    @Override
    public void go() {
        int punteggio = 0;
        String s0 = "0b2c2", //monomio nullo
               s1 = "-2a1b2a1";

        Monomial m;

        m = new Monomial(s0);
        if (m.getExp('b') == 0) {
            punteggio += 25;
        }

        m = new Monomial(s1);
        if (m.getExp('b') == 2) {
            punteggio += 25;
        }

        if (m.getExp('a') == 2) {
            punteggio += 25;
        }

        m = new Monomial("1");
        if (m.getExp('b') == 0) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
