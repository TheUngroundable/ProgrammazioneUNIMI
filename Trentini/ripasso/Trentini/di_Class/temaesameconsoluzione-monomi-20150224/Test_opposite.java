

public class Test_opposite extends AbstractTest {

    @Override
    public void go() {
        int punteggio = 0;
        String  s0 = "0a1b2", //monomio nullo
                s1 = "-2a1b2",
                s2 = "2a1b2",
                s3 = "2a1b1b1";

        Monomial m0, m1, m2, m3;
        m0 = new Monomial(s0);
        m1 = new Monomial(s1);
        m2 = new Monomial(s2);
        m3 = new Monomial(s3);

        if (m0.opposite().equals(new Monomial("0"))) {
            punteggio += 25;
        }

        if (m1.opposite().equals(m2)) {
            punteggio += 25;
        }

        if (m2.opposite().equals(m1)) {
            punteggio += 25;
        }

        if (m3.opposite().equals(m1)) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
