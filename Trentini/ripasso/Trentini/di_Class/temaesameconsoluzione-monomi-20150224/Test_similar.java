public class Test_similar extends AbstractTest {

    @Override
    public void go() {
        int punteggio = 0;
        String  s0 = "0a1b2", //monomio nullo
                s1 = "-2a1b2",
                s2 = "3a1b2a1",
                s3 = "3a1b2",
                s4 = "1b2a2";
        Monomial m0, m1, m2, m3, m4;
        m0 = new Monomial(s0);
        m1 = new Monomial(s1);
        m2 = new Monomial(s2);
        m3 = new Monomial(s3);
        m4 = new Monomial(s4);

        if (!m0.similar(m1)) {
            punteggio += 25;
        }

        if (m1.similar(m3)) {
            punteggio += 25;
        }


        if (!m1.similar(m2)) {
            punteggio += 25;
        }

        if (m4.similar(m2)) {
            punteggio += 25;
        }

        setVal(punteggio);
    }
}
